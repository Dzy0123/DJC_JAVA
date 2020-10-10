package djc.day10;

public abstract class Dog extends Animal { //Animal的子类Dog也是一个抽象类

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
}
