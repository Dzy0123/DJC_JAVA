package djc.day18;

/*
 * 卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 *
 * 解决线程安全问题的第二种方案：使用同步方法
 * 使用步骤：
 *      把访问了共享数据的代码抽取出来，放到一个方法中；
 *      在方法上添加一个synchronized修饰符
 * 格式：
 *   public synchronized void method(){
 *       可能会出现线程安全问题的代码(访问了共享数据的代码)
 *   }
 */
public class TicketImpl02 implements Runnable {
    //定义一个多线程共享的资源
    private int ticket = 100;

    //设置线程任务，卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true) {
            method();
        }

    }

    public synchronized void method() { //同步方法
        //判断票是否存在
        if (ticket > 0) {
            //提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            //票存在，卖票
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}
