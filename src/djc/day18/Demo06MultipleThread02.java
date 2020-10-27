package djc.day18;

public class Demo06MultipleThread02 { //创建多线程的第二种方法
    public static void main(String[] args) {
        //创建一个Runnable接口实现类RunnableImpl类的对象
        RunnableImpl ri = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable的实现类对象
        Thread t = new Thread(ri);
        //调用Thread类中的start方法，开启新的线程，执行run方法
        t.start();

        //新线程
        Thread t2 = new Thread(new RunnableImpl2());
        t2.start();

        //main线程名称遍历输出
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
