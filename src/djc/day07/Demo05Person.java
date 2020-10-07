package djc.day07;

public class Demo05Person { //间接访问private修饰的成员变量，使得成员变量可以被限制
    public static void main(String[] args) {
        Person ps = new Person();
        ps.show();
        System.out.println("================");

        ps.name = "wll";
        ps.setAge(18); //间接访问
        ps.setMale(false);
        ps.show();
        System.out.println("============");

        System.out.println("姓名是：" + ps.name);
        System.out.println("姓名是：" + ps.getAge());
        System.out.println("姓名是：" + ps.isMale());
        System.out.println("=================");

        ps.sayHello("dzy");
        System.out.println("==============");

    }
}
