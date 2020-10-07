package djc.day07;
/*
 * 通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用。
 * 1.导包：指出需要使用的类在什么位置
 * import 包名称.类名称;
 * 对于和当前类属于同一个包的情况，可以省略导包语句不写。
 *
 * 2.创建：
 * 类名称 对象名 = new 类名称();
 *
 * 3.使用，分为两种情况：
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名(参数)*
 * 注意事项：
 * 如果成员变量没有赋值，那么将会有一个默认值，规则和数组一样。*/

public class Demo02StudentUse {
    public static void main(String[] args) {
        Student stu1 = new Student(); //根据Student类创建了一个名为stu的对象,同时无参构造方法执行
        System.out.println("==============");

        Student stu2 = new Student("wll", 18); //全参构造方法执行
        stu2.setSex("女");
        System.out.println(stu2.name + "是" + stu2.getSex());
        System.out.println("==============");

        System.out.println(stu1.name); //null
        System.out.println(stu1.age); //0
        System.out.println("=================");

        stu1.age = 18;
        stu1.name = "dzy";
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println("=================");

        stu1.eat();
        stu1.sleep();
        stu1.study();
        System.out.println("=============");

        stu2.study();
        stu2.sleep();
        stu2.eat();

    }
}
