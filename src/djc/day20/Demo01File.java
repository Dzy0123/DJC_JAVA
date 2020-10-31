package djc.day20;

import java.io.File;

public class Demo01File { //File类的构造方法

    public static void main(String[] args) {

        /*
        static String pathSeparator
            与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
        static char pathSeparatorChar
            与系统有关的路径分隔符。
        static String separator
            与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
        static char separatorChar
            与系统有关的默认名称分隔符。
        */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // ';'路径分隔符 windows:分号 linux:冒号

        String separator = File.separator;
        System.out.println(separator); // '\'默认名称分隔符 windows:反斜杠 linux:正斜杠
        System.out.println("===============");

        //三种构造方法
        show01();
        System.out.println("==========");

        show02("c:\\", "a.txt"); //c:\a.txt
        show02("d:\\", "a.txt"); //d:\a.txt
        System.out.println("===========");

        show03();
    }

    /*File(String pathname)
        通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        参数：
            String pathname：字符串的路径名称
            路径可以是以文件结尾，也可以是以文件夹结尾；
            路径可以是相对路径，也可以是绝对路径；
            路径可以是存在的也可以是不存在的；
            创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况；
    */
    private static void show01() {
        File f1 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\a.txt");
        System.out.println(f1); //重写了toString方法C:\Users\GEM\IdeaProjects\Java_Knowledge_points\a.txt

        File f2 = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points");
        System.out.println(f2); //C:\Users\GEM\IdeaProjects\Java_Knowledge_points

        File f3 = new File("b.txt");
        System.out.println(f3); //b.txt
    }

    /*
    File(String parent, String child)：
        根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        参数：
            String parent：父路径；
            child parent：子路径；
        好处：
            父路径和子路径，可以单独的出现，使用起来非常灵活；
            父路径和子路径都可以变化；
    */
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /*
    File(File parent, String child)：
        根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        参数：
            File parent：父路径；
            child parent：子路径；
        好处：
            父路径和子路径都可以变化；
            父路径是File类型，可以使用File的方法对路径进行操作，在使用路径创建对象
    */
    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent,"hello.java");
        System.out.println(file); //c:\hello.java
    }
}
