package djc.day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件复制：一读一写

明确：
    数据源：E:\a\1.jpg；
    数据目的地：G:\b\1.jpg；
步骤：
    创建一个字节输入流对象，构造方法中绑定要读取的数据源；
    创建一个字节输出流对象，构造法方法中绑定要写入的目的地；
    使用字节输入流的方法read读取文件；
    使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中；
    释放资源。
*/
public class Demo03Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\a\\1.jpg");
        FileOutputStream fos = new FileOutputStream("G:\\b\\1.jpg");


        /*//使用一次读取1个字节一次写入1个字节的方式
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }*/

        //使用数组缓冲读取多个字节，写入多个字节的方式
        byte[] bytes = new byte[1024];
        int len = 0; //每次读取的有效字节个数
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        //释放资源（先关写的，后关读的；如果写完可定读完，但是读完不一定写完）
        fos.close();
        fis.close();
    }
}
