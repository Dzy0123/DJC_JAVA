package djc.day12;

public class Laptop { //笔记本电脑类

    public void powerOn() {
        System.out.println("电脑开机");
    }

    public void powerOff() {
        System.out.println("电脑关机");
    }

    public void useDevice(Usb usb, int std) { //使用Usb设备
        if (usb instanceof Mouse) { //判断一下父类引用usb本来是不是Mouse
            Mouse mouse = (Mouse) usb; //向下转型
            usb.standard(std); //使用鼠标
        }

        if (usb instanceof Keyboard) { //判断一下父类引用usb本来是不是Keyboard
            Keyboard keyboard = (Keyboard) usb; //向下转型
            keyboard.standard(std); //使用键盘
        }
    }
}
