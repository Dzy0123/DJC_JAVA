package djc.day12;
/*
* 如果出现了重名现象，那么格式是：外部类.this.外部类成员变量*/
public class Outer { //外部类

    int num = 10; //外部类成员变量

    public class Inner { //成员内部类
        int num = 20; //内部类成员变量

        public void method() { //内部类方法
            int num = 30; //内部类局部变量

            System.out.println("内部类局部变量" + num);
            System.out.println("内部类成员变量" + this.num);
            System.out.println("外部类成员变量" + Outer.this.num);
        }
    }
}
