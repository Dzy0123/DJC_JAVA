package djc.day10;

public class Demo02PhoneOverride { //方法的覆盖重写

    public static void main(String[] args) {

        //老款手机
        System.out.println("老款手机");
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("==============");

        //新款手机
        System.out.println("新款手机");
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
