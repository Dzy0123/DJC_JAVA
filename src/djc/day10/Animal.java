package djc.day10;

public abstract class Animal { //抽象父类

    //抽象方法
    public abstract void eat();
    public abstract void sleep();

    //父类构造方法
    public Animal() {
        System.out.println("父类构造方法执行");
    }

    //普通成员方法
    public void normalMethod() {
    }
}
