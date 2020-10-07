package djc.day07;

/*
 * 定义一个类，模拟“学生”事物
 * 属性（是什么）：姓名，年龄         --> 成员变量
 * 行为（做什么）：吃饭，睡觉，学习    -->成员方法
 * 注意事项：
 * 1.成员变量是直接定义在类当中的，在方法外边。
 * 2.成员方法不要写static关键字。
 * */
public class Student {

    String name;
    int age;
    private String sex;

    public Student() { //
        System.out.println("无参构造方法执行");
    }

    public Student(String name, int age) {
        System.out.println("全参构造方法执行");
        this.name = name;
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }

    public void study() {
        System.out.println(name + "学习");
    }
}
