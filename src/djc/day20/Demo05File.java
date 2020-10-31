package djc.day20;

import java.io.File;

public class Demo05File { //File类遍历（文件夹）目录功能
    public static void main(String[] args) {
        //src
        //Test.iml
        show01();

        //C:\Users\GEM\IdeaProjects\Java_Knowledge_points\Test\src
        //C:\Users\GEM\IdeaProjects\Java_Knowledge_points\Test\Test.iml
        show02();
    }

    /*
    String[] list()：
        返回一个String数组，表示该File目录中的所有子文件或目录
        遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中。
    注意：
        list方法和listFiles方法遍历的是构造方法中给出的目录；
        如果构造方法中给出目录的路径不存在，就会抛出空指针异常；
        如果构造方法中给出的路径不是一个目录，也会抛出空指针异常。
    */
    public static void show01() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\Test");
        String[] arr = f1.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }

    /*
    File[] listFiles()：
        返回一个File数组，表示该File目录中的所有子文件或目录
        遍历构造方法中给出的目录，会获取目录中所有文件/文件夹，把获取到的多个对象封装为File对象，
        多个File对象存储到File数组中。
    */
    public static void show02() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\Test");
        File[] arr = f1.listFiles();
        for (File fileName : arr) {
            System.out.println(fileName);
        }
    }
}
