package djc.day11;

//继承了父类并实现的接口A，也是MyInterfaceExtends接口的父接口
public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void method();

    public default void methodDefault() {
        System.out.println("A默认方法执行");
    }
}
