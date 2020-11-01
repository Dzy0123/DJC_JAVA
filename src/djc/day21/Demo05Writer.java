package djc.day21;

import java.io.FileWriter;
import java.io.IOException;

public class Demo05Writer { //字符输出流Writer
    public static void main(String[] args) throws IOException {
        //创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("G:\\b\\3.txt");
        //使用FileWriter对象中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）

        //void write(int c)写入单个字符
        fw.write(97); //a
        //使用FileWriter对象中的方法flush，把内存缓冲区中的数据，刷新到文件中；
        fw.flush();
        //刷新之后，流可以继续使用
        fw.write(98); //b
        //释放资源（先把内存缓冲区中的数据刷新到文件中）。
        fw.close();

        //字符输出流写数据的其他方法
        FileWriter fw2 = new FileWriter("G:\\b\\4.txt");
        char[] chars = {'a','b','c'};
        //void write(char[] cbuf)写入字符数组
        fw2.write(chars); //abc

        //void write(char[] cbuf, int off, int len)写入字符数组的一部分
        fw2.write(chars,1,2); //abcbc

        //void write(String str)写入字符串
        fw2.write("dzy"); //abcbcdzy

        //void write(String str, int off, int len)写入字符串的一部分
        fw2.write("wll",1,2); //abcbcdzyll

        //释放资源
        fw2.close();

        //续写
        FileWriter fw3 = new FileWriter("G:\\b\\4.txt",true);
        /*
        abcbcdzyllHelloWorld0
        HelloWorld1
        HelloWorld2
        HelloWorld3
        HelloWorld4
        HelloWorld5
        HelloWorld6
        HelloWorld7
        HelloWorld8
        HelloWorld9
        */
        for (int i = 0; i < 10; i++) {
            fw3.write("HelloWorld"+i+"\r\n"); //"\r\n"换行符
        }
        //释放资源
        fw3.close();
    }
}
