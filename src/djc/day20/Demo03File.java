package djc.day20;

import java.io.File;

public class Demo03File { //File类获取功能的常用方法
    public static void main(String[] args) {
        show01();
        System.out.println("==============");

        show02();
    }

    /*
    boolean exists()
        测试此抽象路径名表示的文件或目录是否存在。
        用于判断构造方法中的路径是否存在：
            存在：返回true
            不存在：返回false
    */
    private static void show01() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points");
        System.out.println(f1.exists()); //true

        File f2 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge"); //路径不存在
        System.out.println(f2.exists()); //false

        File f3 = new File("Java_Knowledge_points.iml");
        System.out.println(f3.exists()); //true

        File f4 = new File("Java_Knowledge.iml"); //路径不存在
        System.out.println(f4.exists()); //false
    }

    /*
    boolean isDirectory()
        测试此抽象路径名表示的文件是否是一个目录。
        用于判断构造方法中给定的路径是否以文件夹结尾：
            是：返回true
            否：返回false
    boolean isFile()
        测试此抽象路径名表示的文件是否是一个标准文件。
        用于判断构造方法中的路径是否以文件结尾：
            是：返回true
            否：返回false
    注意：
        电脑的硬盘中只有文件/文件夹，所以两个方法是互斥的；
        这两个方法的使用前提，路径是必须存在的，否则都返回false
    */
    private static void show02() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge"); //路径不存在
        System.out.println(f1.isDirectory()); //false
        System.out.println(f1.isFile()); //false

        File f2 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points");
        //判断路径是否存在，不存在就没有必要获取
        if (f2.exists()) {
            System.out.println(f2.isDirectory()); //true
            System.out.println(f2.isFile()); //false
        }

        File f3 = new File("Java_Knowledge_points.iml");
        if (f3.exists()) {
            System.out.println(f3.isDirectory()); //false
            System.out.println(f3.isFile()); //true
        }
    }
}
