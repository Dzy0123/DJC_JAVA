package djc.day12;

/*
 * 笔记本电脑案例：
 *   定义USB接口，具备最基本的开启功能和关闭功能。
 *   定义笔记本类，具备开机关机功能使用USB功能
 *   定义鼠标类。实现USB接口并具备点击的方法
 *   定义键盘类，实现USB接口并具备敲击的方法
 *   鼠标和键盘要想能在电脑上使用，那么鼠标和键盘必须也遵守USB规范。
 *   否则鼠标键盘无法使用*/
public class Demo04LaptopTest {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();

        System.out.println("USB的规范类型为：" + Usb.std);

        laptop.powerOn(); //开机
        System.out.println("=============");

        laptop.useDevice(mouse, 20); //发生向上转型，实现类mouse --> 接口usb
        laptop.useDevice(keyboard, 10); //发生向上转型，实现类keyboard --> 接口usb
        System.out.println("=============");

        laptop.powerOff(); //关机
    }
}
