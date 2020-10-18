package djc.day13;

import java.util.Objects;

public class Demo03Objects { //Objects工具类使用

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "aBc";
        String s3 = "abc";
        String s4 = "abc";

        System.out.println(s2.equals(s3)); //false
        System.out.println("===============");
        System.out.println(s3.equals(s4)); //true
        System.out.println("================");
        /*System.out.println(s1.equals(s3)); //空指针异常
        System.out.println("===============");*/

        System.out.println(Objects.equals(s1, s3)); //false
        System.out.println(Objects.equals(s3, s4)); //true
    }
}
