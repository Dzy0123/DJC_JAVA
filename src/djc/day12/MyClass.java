package djc.day12;

public final class MyClass { //不能使用final类作为父类

    //由于成员变量具有默认值，所以用了final之后必须手动赋值
    //这是直接赋值,
    //private final String name = "一班";

    //通过构造赋值
    private final String name;

    //必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值
    public MyClass() {
        name = "一班";
    }

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //已经通过构造方法赋值了，不能再用Setter方法
    /*public void setName(String name) { //不需要了
        this.name = name;
    }*/
}
