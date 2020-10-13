package djc.day12;

public class Keyboard implements Usb { //键盘类

    @Override
    public void standard(int std) { //使用键盘
        if (std == Usb.std) {
            Usb.open();
            System.out.println("键盘的USB类型为：" + std + "，符合规范，可以使用");
            knock();
        } else {
            Usb.close();
            System.out.println("键盘的USB类型为：" + std + "，符合规范，可以使用");
        }
    }

    public void knock() {
        System.out.println("敲击键盘");
    }
}
