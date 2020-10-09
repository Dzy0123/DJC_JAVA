package djc.day09;

public class Student {

    int num; //成员变量
    static int numStaticnum; //静态变量

    private int id; //学号
    private String name;
    private int age;
    static String room;
    private static int idcounter = 0; //学号计数器，每当new了一个新对象的时候，计数器++

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        this.id = ++idcounter;
    }

    public Student(String name, int age) {
        this.id = ++idcounter;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //成员方法
    public void method() {
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStaticnum);
    }

    //静态方法
    public static void methodStatic() {
        System.out.println("这是一个静态方法");
        //静态方法不能直接访问非静态变量
        //System.out.println(num); //报错
        //静态方法可以访问静态变量
        System.out.println(numStaticnum);
    }
}
