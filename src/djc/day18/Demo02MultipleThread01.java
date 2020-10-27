package djc.day18;

public class Demo02MultipleThread01 { //创建多线程的第一种方法
    public static void main(String[] args) {
        //创建Thread类的子类MyThread子类对象
        MyThread thread = new MyThread();
        //调用Thread类中的start方法，开启新的线程，执行run方法
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
