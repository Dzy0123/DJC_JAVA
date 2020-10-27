package djc.day18;

/*
 * 获取线程名称：
 *   1.使用Thread类中的方法getName()
 *       String getName()返回该线程的名称
 *   2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
 *       static Thread currentThread()返回对当前正在执行的线程对象的引用
 */
public class ThreadMethod02 extends Thread { //先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
    //重写Thread类中的run方法，设置线程任务
    @Override
    public void run() {
        //获取线程名称
        Thread t = Thread.currentThread();
        System.out.println(t); //Thread[Thread-0,5,main]

        String name = t.getName();
        System.out.println(name);
    }
}
