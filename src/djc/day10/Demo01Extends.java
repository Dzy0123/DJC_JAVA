package djc.day10;

public class Demo01Extends { //继承

    public static void main(String[] args) {
        //创建一个子类对象teacher
        Teacher teacher = new Teacher();
        //Teacher类当中虽然什么都没写，但是会继承父类的method方法
        teacher.method(); //方法执行

        //创建一个子类对象assistant
        Assistant assistant = new Assistant();
        assistant.method(); //方法执行
        System.out.println("================");

        //创建一个父类对象
        Employe employe = new Employe();
        System.out.println(employe.num1); //父类对象只能使用父类的成员变量，不能使用子类的成员变量

        System.out.println(teacher.num1); //子类对象既可以使用子类的成员变量，也可以使用父类的成员变量
        System.out.println(teacher.num2);
        System.out.println("================");

        //父子类成员变量重名：
        // 直接访问："."左边是谁就优先用谁，没有则向上找
        System.out.println(teacher.num); //优先子类,200
        System.out.println(employe.num); //优先父类，100
        System.out.println("================");
        //间接访问：
        //这是子类方法，优先用子类的成员变量，没有的话在父类里找
        teacher.methodTeacher(); //200
        //这个方法是父类当中定义的，优先用父类的成员变量
        teacher.menthodEmploye(); //100
        System.out.println("=================");

        //区分三种成员变量重名
        //子类局部变量，子类成员变量，父类成员变量
        assistant.method();

        //父子类成员方法重名
        assistant.method(); //创建的对象是Assistant类的，就优先用Assistant类的成员方法
        employe.method();
    }
}
