package djc.day12;
/*
* 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
* 那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。*/
public class Demo09InterfaceMain { //使用匿名内部类

    public static void main(String[] args) {

        //接口的实现类只使用了唯一的一次
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();
        impl.method2();
        System.out.println("===============");

        //使用匿名内部类
        MyInterface impl2 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("对接口的抽象方法覆盖重写的匿名内部类方法");
            }

            @Override
            public void method2() {
                System.out.println("对接口的抽象方法覆盖重写的匿名内部类方法2");
            }
        };
        impl2.method();
        impl2.method2();
        System.out.println("==============");

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("对接口的抽象方法覆盖重写的匿名内部类方法");
            }

            @Override
            public void method2() {
                System.out.println("对接口的抽象方法覆盖重写的匿名内部类方法2");
            }
        }.method();
    }
}
