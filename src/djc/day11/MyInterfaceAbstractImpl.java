package djc.day11;

//接口的实现类（抽象）
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    //对接口中的抽象方法进行覆盖重写
    @Override
    public void methodAbsb1() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void methodAbsb2() {
        System.out.println("这是第二个方法");
    }
}
