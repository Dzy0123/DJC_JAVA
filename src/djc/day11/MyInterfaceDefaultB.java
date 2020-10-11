package djc.day11;

public class MyInterfaceDefaultB implements MyInterfaceDefault { //实现类（默认B）
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法B");
    }

    //覆盖重写接口接口的methodDefault方法
    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
