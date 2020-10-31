package djc.day20;

import java.io.File;

public class Demo02File { //File类获取功能的常用方法
    public static void main(String[] args) {

        show01();
        System.out.println("==========");

        show02();
        System.out.println("==========");

        show03();
        System.out.println("===========");

        show04();
    }

    /*
    String getAbsolutePath()
        返回此抽象路径名的绝对路径名字符串。
        获取的是构造方法中传递的路径；
        无论路径是绝对的还是相对的，getAbsolutePath返回的都是绝对路径
    */
    private static void show01() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\a.txt");
        String ap1 = f1.getAbsolutePath();
        System.out.println(ap1); //C:\Users\GEM\IdeaProjects\Java_Knowledge_points\a.txt

        File f2 = new File("a.txt");
        String ap2 = f2.getAbsolutePath();
        System.out.println(ap2); //C:\Users\GEM\IdeaProjects\Java_Knowledge_points\a.txt
    }

    /*
    String getPath()
        将此抽象路径名转换为一个路径名字符串。
    */
    private static void show02() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\a.txt");
        String p1 = f1.getPath();
        System.out.println(p1); //C:\Users\GEM\IdeaProjects\Java_Knowledge_points\a.txt

        File f2 = new File("a.txt");
        String p2 = f2.getPath();
        System.out.println(p2); //a.txt

        System.out.println(f1); //C:\Users\GEM\IdeaProjects\Java_Knowledge_points\a.txt
        //toString调用的就是getPath方法
        System.out.println(f1.toString()); //C:\Users\GEM\IdeaProjects\Java_Knowledge_points\a.txt
    }

    /*
    String getName()
        返回由此抽象路径名表示的文件或目录的名称。
        获取的就是构造方法传递路径的结尾部分(文件或文件夹)
    */
    public static void show03() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1); //a.txt

        File f2 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points");
        String name2 = f2.getName();
        System.out.println(name2); //Java_Knowledge_points
    }

    /*
    long length()
        返回由此抽象路径名表示的文件的长度。
        注意：
            文件夹是没有长度概念，所以不能获取文件夹长度；
            如果构造方法中给出的路径不存在，那么length返回0；
    */
    public static void show04() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\a.txt");
        long length1 = f1.length();
        System.out.println(length1); //0

        File f2 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\Test\\src");
        long length2 = f2.length();
        System.out.println(length2); //0
    }
}
