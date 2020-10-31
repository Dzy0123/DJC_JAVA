package djc.day20;

import java.io.File;

/*
综合案例：文件搜索
搜索一个目录里以".java结尾"文件
分析：
    目录搜索，无法判断多少级目录，所以使用递归，遍历所有目录；
    遍历目录时，获取的子文件，通过文件名称，判断是否符合条件
*/
public class Demo09DiGuiTest {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src\\djc\\day20");
        search(dir);
    }

    public static void search(File dir) {
        //创建文件数组
        File[] files = dir.listFiles();
        //遍历文件夹
        for (File f : files) {
            //判断f是否是文件夹，如果是则继续遍历，直接调用本方法
            if (f.isDirectory()) {
                search(f);
            } else {
                //判断文件是否符合条件
                if (f.getName().toLowerCase().endsWith(".java")) {
                    System.out.println("目录" + dir.getName() + "中是java文件的有" + f.getName());
                }
            }
        }
    }
}

