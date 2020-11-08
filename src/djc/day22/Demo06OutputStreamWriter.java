package djc.day22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo06OutputStreamWriter { //输出转换流
    public static void main(String[] args) throws IOException {
        write_utf_8();

        write_gbk();
    }


    //使用转换流写utf-8格式的文件
    public static void write_utf_8() throws IOException {
        //创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\b\\a.txt"), "utf-8");

        //使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中
        osw.write("你好");

        //使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中
        osw.flush();

        //释放资源
        osw.close();
    }

    //
    public static void write_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\b\\b.txt"), "gbk");

        osw.write("王兰");

        osw.flush();

        osw.close();
    }
}
