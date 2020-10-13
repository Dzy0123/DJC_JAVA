package djc.day12;

public class Demo05Final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);
        System.out.println("=================");

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改,只能赋值一次
        final int num2 = 200;
        System.out.println(num2);
        System.out.println("=================");

        final int num3;
        num3 = 30; //保证一次赋值
        System.out.println(num3);
        System.out.println("=================");

        //对于基本类型来说，不可变说的是变量当中的【数据】不可改变
        //对于引用类型来说，不可变说的是变量当中的【地址值】不可改变
        Student student = new Student("dzy");
        System.out.println(student.getName()); //dzy
        student = new Student("wll");
        System.out.println(student.getName()); //wll
        System.out.println("================");

        final Student stu2 = new Student("dzy");
        System.out.println(stu2.getName()); //dzy
        // 错误写法！final的引用类型变量，其中的地址不可改变
        // stu2 = new Student("wll"); //错误写法
        stu2.setName("wll"); //地址值没有改变，地址值指向的内容改变
        System.out.println(stu2.getName()); //wll
    }
}
