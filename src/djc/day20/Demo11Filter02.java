package djc.day20;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo11Filter02 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src\\djc\\day20");
        search(dir);
    }

    public static void search(File dir) {
        //创建文件数组,匿名内部类
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().endsWith(".java");
            }
        });*/
        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir,String name) {
                return dir.isDirectory() || name.endsWith(".java");
            }
        });*/
        //Lambda
        File[] files = dir.listFiles((File d, String name) -> d.isDirectory() || name.endsWith(".java"));
        //遍历文件夹
        for (File f : files) {
            //判断f是否是文件夹，如果是则继续遍历，直接调用本方法
            if (f.isDirectory()) {
                search(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
