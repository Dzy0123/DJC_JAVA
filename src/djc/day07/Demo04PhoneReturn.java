package djc.day07;

public class Demo04PhoneReturn { //使用对象类型作为方法的返回值
    public static void main(String[] args) {
        Phone ph2 = getPhone();
        System.out.println(ph2.price);
        System.out.println(ph2.color);
        System.out.println(ph2.name);
    }

    public static Phone getPhone() {
        Phone ph = new Phone();
        ph.name = "华为";
        ph.price = 8888.8;
        ph.color = "blue";
        return ph;
    }
}
