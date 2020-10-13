package djc.day12;

public interface Usb { //定义一个USB接口

    int std = 10; //规范数据

    public void standard(int std); //使用设备规范

    public static void open() {
        System.out.println("USB功能打开");
    }

    public static void close() {
        System.out.println("USB功能关闭");
    }


}
