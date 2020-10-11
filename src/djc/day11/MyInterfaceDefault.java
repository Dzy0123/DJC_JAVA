package djc.day11;

public interface MyInterfaceDefault { //为实现默认方法的接口

    //创建抽象方法
    public abstract void methodAbs();

    //创建默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }
}
