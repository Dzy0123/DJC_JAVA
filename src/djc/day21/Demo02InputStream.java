package djc.day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02InputStream { //字节输入流
    public static void main(String[] args) throws IOException {
        //创建一个FileInputStream对象，构造方法中绑定要读取数据的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src\\djc\\a.txt");
        //调用FileInputStream对象中的方法read，读取文件
        //int read()读取文件中的一个字节并返回，读取到文件的末尾返回-1
        /*int len = fis.read();
        System.out.println(len); //97
        len = fis.read();
        System.out.println(len); //98
        len = fis.read();
        System.out.println(len); //-1*/
        /*
        循环优化，不知道文件中有多少个字节，使用while循环
        while循环结束条件，读取到-1的时候结束

        布尔表达式：
            (len = fis.read()) != -1
                fis.read()：读取一个字节；
                len = fis.read()：把读取到的字节赋值给变量len；
                (len = fis.read()) != -1：判断变量len是否不等于-1
        */
        int len = 0; //记录读取到的字节
        while ((len = fis.read()) != -1) {
            System.out.println((char) len); //a b
        }
        //释放资源
        fis.close();
        System.out.println("================");

        /*
        一次读取多个字节的方法：
            明确两件事：
                方法的参数byte[]的作用:
                    缓冲作用，存储每次读取到的多个字节；
                    数组的长度把定义为1024(1kb)或者1024的整数倍；
                方法的返回值int是什么：
                    每次读取到的有效字节个数；
            String类的构造方法：
                String(byte[] bytes)：把字节数组转化为字符串
                String(byte[] bytes,int offset,int length)：把字节数组的一部分转换为字符串
                    offset：数组的开始索引
                    length：转换的字节个数
        */
        FileInputStream fis2 = new FileInputStream("C:\\Users\\GEM\\IdeaProjects\\Java_Knowledge_points\\src\\djc\\b.txt");

        /*
        byte[] btes = new byte[5];

        int len2 = fis2.read(btes);
        System.out.println(len2); //5
        System.out.println(Arrays.toString(btes)); //[49, 48, 48, 65, 66]
        System.out.println(new String(btes)); //100AB
        System.out.println("--------------");

        len2 = fis2.read(btes);
        System.out.println(len2); //5
        System.out.println(new String(btes)); //CDE��
        System.out.println("--------------");

        len2 = fis2.read(btes);
        System.out.println(len2); //5
        System.out.println(new String(btes)); //�DEBC
        System.out.println("--------------");

        len2 = fis2.read(btes);
        System.out.println(len2); //5
        System.out.println(new String(btes)); //你�
        System.out.println("--------------");

        len2 = fis2.read(btes);
        System.out.println(len2); //1
        System.out.println(new String(btes)); //����
        System.out.println("--------------");

        len2 = fis2.read(btes);
        System.out.println(len2); //-1
        System.out.println(new String(btes)); //����
        System.out.println("--------------");*/

        /*
        以上读取是一个重复过程，可以使用循环优化
        不知道文件中有多少字节，所以使用while循环：
            while循环结束条件，读取到-1结束
        */
        byte[] btes = new byte[1024]; //存储读取到的多个字节
        int len2 = 0;
        while ((len2 = fis2.read(btes)) != -1) {
            System.out.println(new String(btes, 0, len2)); //100ABCDE���DEBC你好
        }

        //释放内存
        fis2.close();
    }
}
