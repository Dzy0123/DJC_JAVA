package djc.day12;

public class Cat extends Animal {

    //覆盖重写抽象父类的抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
