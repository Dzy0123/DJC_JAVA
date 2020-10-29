package djc.day19;

/*等待线程唤醒案例：线程之间的通信
*   创建一个顾客线程（消费者）：
*       告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入到WAITING状态(无线等待状态)
*   创建一个老板线程（生产者）：
*       花了5秒做包子，做好包子之后调用notify方法唤醒顾客吃包子
*   注意事项：
*       顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
*       同步使用的锁对象必须保证是唯一的
*       只有锁对象才能调用wait和notify方法
*   Object类中的方法：
*       public final void wait()throws InterruptedException：
                在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
        public final void notify()：
                唤醒在此对象监视器上等待的单个线程
                唤醒后会继续执行wait方法之后的代码*/
public class Demo01WaitAndNotify { //线程唤醒案例代码实现

    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();

        //创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("告知老板要的包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("开始吃包子");
                }
            }
        }.start();

        //创建一个老板线程
        new Thread() {
            @Override
            public void run() {
                //花了5秒做包子
                try {
                    Thread.sleep(5000); //线程睡眠5秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("包子做好了，可以吃了");
                    obj.notify();
                }
            }
        }.start();
    }
}
