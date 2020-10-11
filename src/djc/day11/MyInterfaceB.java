package djc.day11;

//继承了父类并实现的接口B，也是MyInterfaceExtends接口的父接口
public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void method();

    public default void methodDefault() {
        System.out.println("B默认方法执行");
    }
}
