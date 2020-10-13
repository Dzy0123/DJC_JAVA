package djc.day12;

public class Demo01Multi { //多态

    public static void main(String[] args) {

        //使用多态写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();

        //成员方法调用
        obj.method(); //子类方法
        obj.methodFu(); //父类特有方法
        System.out.println("============");

        //直接调用成员变量
        System.out.println(obj.num); //10 等号左边是Fu obj
        System.out.println("============");

        //间接通过成员方法调用成员变量
        obj.showNum(); //10 方法属于Fu类，优先使用Fu的num，若是子类有覆盖，则是子类的num
    }
}
