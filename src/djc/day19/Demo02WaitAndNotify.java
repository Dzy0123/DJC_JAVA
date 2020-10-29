package djc.day19;

public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();

        //创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("顾客1告知老板要的包子的种类和数量");
                    //等老板5秒做包子
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("顾客1开始吃包子");
                }
            }
        }.start();

        //创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("顾客2告知老板要的包子的种类和数量");
                    //等老板5秒做包子
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("顾客2开始吃包子");
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
                    obj.notifyAll();
                }
            }
        }.start();
    }
}
