package djc.day20;

import java.io.File;
import java.io.IOException;

public class Demo04File { //File类创建删除功能的常用方法
    public static void main(String[] args) throws IOException {
        show01();

        show02();
    }

    /*
    boolean createNewFile()
        当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出（构造方法的参数）；
        返回值是布尔值：
            文件不存在：创建文件并返回true；
            文件存在：不会创建并返回false
        注意：
            此方法只能创建文件不能创建文件夹；
            创建文件的路径必须存在，否则会抛出异常。
    */
    public static void show01() throws IOException {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1:" + b1);

        File f2 = new File("Test\\2.txt");
        boolean b2 = f2.createNewFile();
        System.out.println("b2:" + b2);
    }

    /*
    boolean mkdir()
        创建此抽象路径名指定的目录。
        只能创建单级文件夹
    boolean mkdirs()
        创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
        既可以创建单级文件夹，也可以创建多级文件夹
        创建文件的路径和名称在构造方法中给出（构造方法的参数）；
        返回值是布尔值：
            文件夹不存在：创建文件夹并返回true；
            文件夹存在：不会创建并返回false，构造方法中给出的路径不存在也返回false
        注意：
            此方法只能创建文件夹不能创建文件。
    */
    public static void show02() {
        File f1 = new File("Test\\2.txt");
        boolean b1 = f1.mkdir();
        System.out.println("b1:" + b1);

        File f2 = new File("Test\\111\\222\\2.txt");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:" + b2);
    }

    /*
    boolean delete()
        删除此抽象路径名表示的文件或目录。
        此方法可以删除构造方法路径中给出的文件夹/文件。
        返回值是布尔值：
            文件/文件夹删除成功：返回true；
            文件夹中有内容/构造方法中的路径不存在：返回false
        注意：
            此方法直接在硬盘删除文件/文件夹，不经过回收站。
    */
    public static void show03() {
        File f1 = new File("Test\\2.txt");
        boolean b1 = f1.delete();
        System.out.println("b1:" + b1);

        File f2 = new File("Test\\111\\222\\2.txt");
        boolean b2 = f2.delete();
        System.out.println("b2:" + b2);
    }
}
