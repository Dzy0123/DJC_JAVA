package djc.day12;

public class Mouse implements Usb { //鼠标类

    @Override
    public void standard(int std) { //使用鼠标
        if (std == Usb.std) {
            Usb.open();
            System.out.println("鼠标的USB类型为：" + std + "，符合规范，可以使用");
            click();
            Usb.close();
        } else {
            Usb.close();
            System.out.println("鼠标的USB类型为：" + std + "，不符合规范，不能使用");
        }
    }

    public void click() {
        System.out.println("点击鼠标");
    }
}
