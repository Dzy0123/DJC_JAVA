package djc.day12;

public class MyInterfaceImpl implements MyInterface { //实现类

    @Override
    public void method() {
        System.out.println("实现类覆盖重写了接口抽象方法");
    }

    @Override
    public void method2() {
        System.out.println("实现类覆盖重写了接口抽象方法2");
    }
}
