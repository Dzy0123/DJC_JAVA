package djc.day21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo01OutputStream { //OutputStream字节输出流
    public static void main(String[] args) throws IOException {
        //创建文件字节输出流FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src\\djc\\a.txt");
        //调用FileOutputStream对象中的方法write，把数据写入到文件中
        fos.write(97); //a
        fos.write(98); //b
        //释放资源
        fos.close();

        /*一次写多个字节的方法：
          void write(byte[] b)
            将 b.length 个字节从指定的 byte 数组写入此输出流。
            一次写多个字节：
                如果写的第一个字节是正数(0-127)，那么显示的时候会查询ASCII表；
                如果写的第一个字节是负数(0-127)，那么第一个字节会和第二个字节组成一个中文显示，查询系统默认码表；
          void write(byte[] b, int off, int len)
            将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
            把字节数组的一部分写入到文件中：
                int off：数组的开始索引
                int len：写几个字节
        */
        FileOutputStream fos2 = new FileOutputStream("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src\\djc\\b.txt");
        //文件中显示100
        fos2.write(49);
        fos2.write(48);
        fos2.write(48);

        //一次写多个字节
        //创建byte类型数组
        byte[] btes = {65, 66, 67, 68, 69};
        fos2.write(btes); //ABCDE

        byte[] btes2 = {-65, -66, -67, 68, 69};
        fos2.write(btes2); //烤紻E

        //把字节数组的一部分写入到文件中
        fos2.write(btes, 1, 2); //BC

       /* 写入字符的方法：
            可以使用String类中的方法把字符串，转换为字节数组
            byte[] getBytes()把字符串转换为字节数组
       */
        byte[] btes3 = "你好".getBytes();
        System.out.println(Arrays.toString(btes3)); //[-28, -67, -96, -27, -91, -67]
        fos2.write(btes3); //你好

        //释放资源
        fos2.close();

        //追加续写、换行
        //续写
        FileOutputStream fos3 = new FileOutputStream("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src\\djc\\c.txt", true);
        fos3.write("你好".getBytes()); //每执行一次续写一次
        //换行
        for (int i = 0; i < 10; i++) {
            fos3.write("你好".getBytes());
            fos3.write("\r\n".getBytes());
        }
        //释放资源
        fos3.close();
    }
}
