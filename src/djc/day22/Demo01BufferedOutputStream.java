package djc.day22;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream { //字节缓冲输出流
    public static void main(String[] args) throws IOException {
        //创建一个字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("G:\\b\\a.txt");

        //创建BufferedOutputStream，构造方法中传递FileOutputStream对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //使用BufferedOutputStream对象中的方法write，把数据写入到内部的缓冲区中
        bos.write("把数据写入到内部缓冲区中".getBytes());

        //使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据，刷新到文件中
        bos.flush();

        //释放资源（会先调用flush方法刷新数据，第4步可以省略）
        bos.close();

    }
}
