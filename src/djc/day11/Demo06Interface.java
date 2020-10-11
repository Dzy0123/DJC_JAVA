package djc.day11;

public class Demo06Interface { //接口的多继承的使用

    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();

        impl.methodA();
        System.out.println("=========");

        impl.methodB();
        System.out.println("=========");

        impl.method();
        System.out.println("=========");

        impl.methodDefault();
    }
}
