package djc.day18;

public class Demo01MainThread { //主线程

    public static void main(String[] args) {
        Person p1 = new Person("dzy");
        p1.run();
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(0 / 0);

        /*
         * 因为main(主)线程是单线程的，所以发生异常以后后续代码无法执行*/
        Person p2 = new Person("wll");
        p2.run();
    }
}
