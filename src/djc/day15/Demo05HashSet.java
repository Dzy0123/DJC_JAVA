package djc.day15;

import java.util.HashSet;

public class Demo05HashSet { //HashSet存储自定义类型元素

    //要求同名同年龄的人，视为同一个人，只能存储一次
    public static void main(String[] args) {
        //创建Set集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("dzy",21);
        Person p2 = new Person("dzy",21);
        Person p3 = new Person("wll",21);
        /*//重写hashCode和equals方法前
        System.out.println(p1.hashCode()); //325040804
        System.out.println(p2.hashCode()); //1173230247
        System.out.println(p3.hashCode()); //856419764
        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //false
        //此时set集合中元素不重复，都会存储
        set.add(p1);
        set.add(p2);
        set.add(p3);
        //[Person{name='dzy', age=21}, Person{name='dzy', age=21}, Person{name='wll', age=21}]
        System.out.println(set);*/

        //重写hashCode和equals方法后
        System.out.println(p1.hashCode()); //3101075
        System.out.println(p2.hashCode()); //3101075
        System.out.println(p3.hashCode()); //3653247
        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //true
        //此时set集合中元素重复，只存储非重复的元素
        set.add(p1);
        set.add(p2);
        set.add(p3);
        //[Person{name='wll', age=21}, Person{name='dzy', age=21}]
        System.out.println(set);
    }

}
