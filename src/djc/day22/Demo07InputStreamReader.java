package djc.day22;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo07InputStreamReader { //输入转换流
    public static void main(String[] args) throws IOException {
        read_utf_8();

        read_gbk();
    }

    //读取utf-8文件
    public static void read_utf_8() throws IOException {
        //创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\b\\a.txt"), "utf-8");

        //使用InputStreamReader对象中的方法read，读取文件中的文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }

        //释放资源
        isr.close();
    }

    //读取gbk文件
    public static void read_gbk() throws IOException {
        //创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\b\\b.txt"), "gbk");

        //使用InputStreamReader对象中的方法read，读取文件中的文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }

        //释放资源
        isr.close();
    }
}
