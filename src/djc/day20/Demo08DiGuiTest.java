package djc.day20;

import java.io.File;

/*
递归打印多级目录：
    分析：
        多级目录的打印，就是当前目录的嵌套。
        遍历之前，无从知道到底有多少级目录，所以用递归实现
*/
public class Demo08DiGuiTest {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src");
        printCatalog(dir);
    }

    //定义递归方法遍历目录
    //参数传递File类型的目录
    public static void printCatalog(File dir) {
        System.out.println(dir + "的目录");

        //返回一个File数组，表示该Files目录中的所有子文件或目录
        File[] files = dir.listFiles();

        //遍历文件夹
        for (File f : files) {
            System.out.println(f);
            //判断遍历得到的f是否是文件夹，如果是则继续遍历，直接调用本方法
            if (f.isDirectory()) {
                printCatalog(f);
            }
        }

    }
}
