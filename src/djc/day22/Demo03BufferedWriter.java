package djc.day22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedWriter { //字符缓冲输出流
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象，构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\b\\b.txt"));
        //调用字符缓冲输出流的方法write，把数据写入到内存缓冲区中
        for (int i = 0; i < 3; i++) {
            bw.write("dzy");
            bw.newLine(); //换行
        }
        //调用字符缓冲输出流中的flush方法，把内存缓冲区的数据刷新到文件中
        bw.flush();
        //释放资源
        bw.close();
    }
}
