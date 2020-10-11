package djc.day11;

//继承了父接口A和父接口B的子接口
public interface MyInterfaceExtends extends MyInterfaceA, MyInterfaceB {

    //本接口的抽象方法
    public abstract void method();

    //抽象方法冲突不影响，不用重写覆盖
    /*
    @Override
    default void method() {
    }*/

    //默认方法冲突，要重写覆盖
    @Override
    public default void methodDefault() {
        System.out.println("覆盖重写了接口A和接口B的冲突的默认方法");
    }
}
