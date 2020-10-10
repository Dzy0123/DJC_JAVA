package djc.day10;

public class Cat extends Animal { //抽象子类

    //对父类所有抽象方法的覆盖重写
    @Override
    public void eat() { //对父类抽象方法的覆盖重写
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {

    }

    public Cat() {
        //super();
        System.out.println("子类构造方法执行");
    }
}
