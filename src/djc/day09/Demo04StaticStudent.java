package djc.day09;

public class Demo04StaticStudent {

    public static void main(String[] args) {

        Student stu1 = new Student("金子涵", 20);
        Student stu2 = new Student("喻言", 19);
        //静态变量
        Student.room = "202教室";

        System.out.println("学号：" + stu1.getId() + "，姓名：" + stu1.getName() + "，年龄：" + stu1.getAge() + "，教室：" + Student.room);
        System.out.println("学号：" + stu2.getId() + "，姓名：" + stu2.getName() + "，年龄：" + stu2.getAge() + "，教室：" + Student.room);

        //成员方法调用：必须首先创建对象，然后通过对象才能使用它
        Student stu = new Student();
        stu.method();

        //静态方法：可以通过对象名进行调用，也可以直接通过类名称进行调用
        Student.methodStatic(); //正确，推荐
        stu.methodStatic(); //正确但不推荐，这种写法在编译之后会被javac翻译成上面的方法

        //自己的静态方法:对于本类当中的静态方法，可以省略类名称进行调用
        myMethod();
    }

    public static void myMethod() { //自己的静态方法
        System.out.println("自己的静态方法");
    }
}
