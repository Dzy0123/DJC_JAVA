package djc.day20;

import java.io.File;

public class Demo10Filter {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src\\djc\\day20");
        search(dir);
    }

    public static void search(File dir) {
        //创建文件数组,传递过滤器对象
        File[] files = dir.listFiles(new FileFilterImpl());
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
