package djc.day21;

import java.io.FileReader;
import java.io.IOException;

public class Demo04Reader { //字符输入流Reader
    public static void main(String[] args) throws IOException {
        //创建FileReader对象，在构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("G:\\b\\2.txt");
        //使用FileReader对象中的方法read读取文件
        /*//int read()读取单个字符并返回
        int len = 0;
        while((len = fr.read()) != -1){
            System.out.print((char) len); //你好abc123###
        }*/

        //int read(char[] cbuf)一次读取多个字符，将字符读入数组
        char[] chars = new char[1024];
        int len2 = 0;
        while ((len2 = fr.read(chars)) != -1) {
            /*
            String类的构造方法：
                String(char[] value)
                String(char[] value,int offset,int count)
            */
            System.out.println(new String(chars, 0, len2)); //你好abc123###
        }

        //释放资源
        fr.close();
    }
}
