package djc.day13;

import java.util.ArrayList;

public class Demo02Equals { //Object类的equals方法

    public static void main(String[] args) {

        Person p1 = new Person("dzy", 21);
        Person p2 = new Person("dzy", 21);

        /*boolean b = p1.equals(p2);
        System.out.println(b); //重写equals方法之前比较的是地址值为false
        */

        boolean b = p1.equals(p2);
        System.out.println(b); //重写equals方法之后比较的是对象属性为true
        System.out.println("==============");

        ArrayList<String> list = new ArrayList<>();
        boolean b2 = p1.equals(list); //false
        System.out.println(b2); //false
    }
}
