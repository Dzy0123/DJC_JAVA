package djc.day22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo04BufferedReader { //字符缓冲输入流
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("G:\\b\\b.txt"));

        //调用字符缓冲输入流对象中的方法read/readLine,读取文本
        /*String line = br.readLine();
        System.out.println(line); //dzy
        line = br.readLine();
        System.out.println(line); //dzy
        line = br.readLine();
        System.out.println(line); //dzy
        line = br.readLine();
        System.out.println(line); //null*/
        /*
        以上代码是一个重复的过程，所以可以使用循环优化
        不知道文件中有多少行数据，所以使用while循环
        while循环的结束条件，读取到null结束
        */
        /*int len = 0;
        char[] chars = new char[1024];
        while((len = br.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }*/
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //释放资源
        br.close();
    }
}
