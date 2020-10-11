package djc.day11;

public interface MyInterface { //被继承了直接父类Fu的子类Zi使用的接口

    public default void method() {
        System.out.println("接口的默认方法");
    }
}
