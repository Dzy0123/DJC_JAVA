package djc.day08;

import java.util.Scanner;

public class Demo04AnonymousPerson {

    public static void main(String[] args) {
        //标准创建对象
        Person ps = new Person();
        ps.name = "dzy";
        ps.show(); //dzy
        System.out.println("==============");

        //创建匿名对象
        new Person().name = "wll";
        new Person().show(); //null,这是一个全新的对象
        System.out.println("==============");

        /*//匿名对象的方式
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是"+num);*/

        /*//使用一般写法进行传参
        Scanner sc = new Scanner(System.in);
        methodParam(sc);*/

        //使用匿名对象来进行传参
        methodParam(new Scanner(System.in)); //用匿名对象作为方法的参数
        System.out.println("============");

        Scanner sc = methodReturn(); //用匿名对象作为方法的返回值
        System.out.println(sc.nextInt());


    }

    public static void methodParam(Scanner sc) { //用匿名对象作为方法的参数
        System.out.println(sc.nextInt());
    }

    public static Scanner methodReturn() { //用匿名对象作为方法的返回值
        /*Scanner sc = new Scanner(System.in);
        return sc;*/
        return new Scanner(System.in);
    }
}
