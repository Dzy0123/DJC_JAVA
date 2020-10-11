package djc.day11;

/*
 * 接口当中也可以定义“成员变量”，但是必须使用 public static final三个关键字进行修饰
 * 从效果上看，这其实就是接口的【常量】
 * */
public interface MyInterfaceConst { //定义了一个常量的接口

    //定义一个常量，一旦赋值不能修改
    public static final int NUM_OF_MYINTERFACE = 10;
}
