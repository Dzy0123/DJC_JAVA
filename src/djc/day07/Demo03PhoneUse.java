package djc.day07;

public class Demo03PhoneUse {

    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.name = "三星 ";
        ph.color = "red";
        ph.price = 6500.0;
        System.out.println(ph.name);
        System.out.println(ph.color);
        System.out.println(ph.price);
        ph.call("dzy");
        ph.text();

    }
}
