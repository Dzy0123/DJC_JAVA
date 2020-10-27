package djc.day18;

/*
 * 线程的名称：
 *   主线程：main
 *   新线程：Thread-0，Thread-1，Thread-2*/
public class Demo04GetThreadName02 {

    public static void main(String[] args) {
        //创建Thread类的子类对象
        ThreadMethod02 tm = new ThreadMethod02();
        //调用start方法，开启新线程，执行run方法
        /*
          Thread[Thread-0,5,main]
          Thread-0
        */
        tm.start();
        /*
          Thread[Thread-1,5,main]
          Thread-1
        */
        new ThreadMethod02().start();
        /*
          Thread[Thread-2,5,main]
          Thread-2
        */
        new ThreadMethod02().start();
    }
}
