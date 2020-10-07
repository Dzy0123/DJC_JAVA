package djc.day07;

public class Person { //使用private修饰成员变量，使得成员变量可以被限制
    String name;
    private int age;
    private boolean male;

    public void setAge(int num) {
        if (num <= 100 && num > 0) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean man) {
        man = male;
    }

    public boolean isMale() { //对于基本类型中的boolean值，Getter方法一定要写成isXxx的形式，Setter不变
        return male;
    }

    public void sayHello(String name) {
        //局部变量name+成员变量this.name --> 局部变量name+成员变量ps.name --> dzy给wll打招呼
        System.out.println(name + "给" + this.name + "打招呼");
    }

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("是否是男生：" + male);
    }
}
