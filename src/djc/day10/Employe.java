package djc.day10;

public class Employe { //定义一个父类，员工类

    int num1 = 10;

    int num = 100; //父类成员变量

    public void method() {
        System.out.println("父类重名方法执行");
    }

    public void menthodEmploye() {
        System.out.println("父类方法" + num);
    }

    public Object method1() { //重写：父类成员方法
        return null;
    }

    public Employe() { //父类构造方法
        this(10); //调用本类中的另一个构造方法
        System.out.println("父类构造方法执行");

    }

    public Employe(int i) {
        System.out.println("父类有参构造方法执行");
    }
}
