package djc.day10;

public class Assistant extends Employe { //定义了员工类的另一个子类，助教类

    int num = 20; //子类成员变量

    public void method() {
        int num = 30; //子类局部变量
        System.out.println("子类局部变量" + num); //30
        System.out.println("子类成员变量" + this.num); //20
        System.out.println("父类成员变量" + super.num); //100，父类成员变量
        System.out.println("===========");
        System.out.println("子类重名方法执行");
    }

    @Override //检测是否是正确的覆盖重写
    public String method1() { //重写：子类成员方法
        return null;
    }

    public Assistant() { //子类构造方法
        super(20); //调用父类重载的构造方法
        System.out.println("子类构造方法执行");
    }
}
