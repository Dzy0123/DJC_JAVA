package djc.day11;

public class Demo01Interface { //接口使用抽象方法

    public static void main(String[] args) {

        //创建实现类的对象进行使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbsb1();
        impl.methodAbsb2();
    }
}
