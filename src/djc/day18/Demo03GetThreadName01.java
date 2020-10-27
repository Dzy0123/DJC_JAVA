package djc.day18;

/*
 * 线程的名称：
 *   主线程：main
 *   新线程：Thread-0，Thread-1，Thread-2*/
public class Demo03GetThreadName01 {

    public static void main(String[] args) {
        //创建Thread类的子类对象
        ThreadMethod01 tm = new ThreadMethod01();
        //调用start方法，开启新线程，执行run方法
        tm.start(); //Thread-0

        new ThreadMethod01().start(); //Thread-1
        new ThreadMethod01().start(); //Thread-2
    }
}
