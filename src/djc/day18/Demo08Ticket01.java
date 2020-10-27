package djc.day18;

/*
 * 模拟卖票案例：
 *   创建三个线程，同时开启，对共享的票进行出售*/
public class Demo08Ticket01 {

    public static void main(String[] args) {
        //创建Runnable接口的实现类TicketImpl对象
        TicketImpl01 ti = new TicketImpl01();
        //创建Thread类的对象，构造方法中传递Runnable,并调用start开启多线程
        Thread t0 = new Thread(ti);
        t0.start();
        Thread t1 = new Thread(ti);
        t1.start();
        Thread t2 = new Thread(ti);
        t2.start();
    }
}
