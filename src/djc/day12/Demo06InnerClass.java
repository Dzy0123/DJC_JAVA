package djc.day12;

public class Demo06InnerClass { //使用成员内部类方法

    public static void main(String[] args) {

        //间接使用内部类
        Body body = new Body(); //外部类对象
        //通过外部类对象调用外部类方法，里面再间接使用成员内部类的Heart
        body.methodBody();
        System.out.println("==============");

        //直接使用成员内部类，不借助外部类方法
        Body.Heart bh = new Body().new Heart();
        bh.beat();
        System.out.println("==============");


    }
}
