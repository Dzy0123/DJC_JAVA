package djc.day18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 *
 * 解决线程安全问题的第三种方案：使用Lock锁
 * 使用步骤：
        在成员位置创建一个Lock的实现类对象ReentrantLock；
        在可能会出现线程安全问题的代码前调用Lock接口中的方法lock获取锁；
        在可能会出现线程安全问题的代码后调用Lock接口中的方法unlock释放锁；
 */
public class TicketImpl03 implements Runnable {
    //定义一个多线程共享的资源
    private int ticket = 100;

    //在成员位置创建一个ReentrantLock();
    Lock l = new ReentrantLock();

    /*//设置线程任务，卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true) {
            //在可能出现线程安全问题的代码前调用Lock接口中的方法lock获取锁
            l.lock();

            //判断票是否存在
            if (ticket > 0) {
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                //票存在，卖票
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }

            //在可能出现线程安全问题的代码之后调用Lock接口中的方法unlock释放锁
            l.unlock();
        }
    }*/

    //设置线程任务，卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true) {
            //在可能出现线程安全问题的代码前调用Lock接口中的方法lock获取锁
            l.lock();

            //判断票是否存在
            if (ticket > 0) {
                //票存在，卖票
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                } finally {
                    //在可能出现线程安全问题的代码之后调用Lock接口中的方法unlock释放锁
                    l.unlock(); //无论程序是否异常都会把锁释放
                }
            }
        }
    }
}
