package djc.day22;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedInputStream { //字节缓冲输入流
    public static void main(String[] args) throws IOException {
        //创建一个字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("G:\\b\\a.txt");

        //创建BufferedInputStream，构造方法中传递FileInputStream对象
        BufferedInputStream bis = new BufferedInputStream(fis);

        //使用BufferedInputStream对象中的方法read，读取文件
        /*//int read()从输入流中读取数据的下一个字节
        int len = 0; //记录每次读取到的字节
        while((len = bis.read()) != -1){
            System.out.println(len);
        }*/
        //int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        byte[] bytes = new byte[1024]; //存储每次读取的数据
        int len = 0; //记录每次读取的有效字节个数
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len)); //从bytes[]的第0号索引开始转换，转换len个数据
        }

        //释放资源
        bis.close();
    }
}
