package djc.day13;

public class Demo09StringBuilder { //字符串缓冲区

    public static void main(String[] args) {
        //构造方法，String --> StringBuilder
        //空参构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:" + bu1); //bu1:
        System.out.println("===============");

        //有参构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:" + bu2); //bu2:abc
        System.out.println("===============");

        //append成员方法返回的是this（调用方法的对象）的地址值
        StringBuilder bu3 = bu1.append("abc"); //把bu1的地址值赋给了bu3
        System.out.println(bu1 == bu3); //true，比较的地址值

        //使用append方法无需接收返回值
        bu1.append("efg");
        bu1.append(123);
        bu1.append(true);
        bu1.append(6.6);
        bu1.append('d');
        System.out.println(bu1); //abcefg123true6.6d

        //链式编程：方法返回值是一个对象，可以继续调用方法
        bu2.append("efg").append(123).append(false).append(8.8).append('w');
        System.out.println(bu2); //abcefg123false8.8w
        System.out.println("==============");

        //toString成员方法
        //StringBuilder --> String
        bu3.toString();
        System.out.println(bu3); //abcefg123true6.6d
    }
}
