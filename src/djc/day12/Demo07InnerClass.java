package djc.day12;

public class Demo07InnerClass { //成员内部类和外部类重名的成员变量的访问

    public static void main(String[] args) {
        //创建成员内部类对象
        Outer.Inner oi = new Outer().new Inner();
        //直接调用内部类方法
        oi.method();
    }
}
