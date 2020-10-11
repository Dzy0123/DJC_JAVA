package djc.day11;

public class Demo02Interface { //接口使用默认方法

    public static void main(String[] args) {
        MyInterfaceDefaultA implA = new MyInterfaceDefaultA();
        implA.methodAbs(); //实现了抽象方法A
        implA.methodDefault(); //实现了默认方法
        System.out.println("================");

        MyInterfaceDefaultB implB = new MyInterfaceDefaultB();
        implB.methodAbs(); //实现了抽象方法A
        implB.methodDefault(); //实现了重写覆盖后的默认方法
    }
}
