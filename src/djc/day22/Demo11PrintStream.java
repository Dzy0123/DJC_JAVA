package djc.day22;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo11PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("G:\\b\\print.txt");

        //如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表
        ps.write(97); //a
        //如果使用自己特有的方法print/println方法写数据，写的数据原样输出
        ps.println(97); //97

        System.out.println("控制台输出");
        System.setOut(ps); //把输出语句的目的地改变为打印流的目的地
        System.out.println("在打印流的目的地中输出");

        //释放资源
        ps.close();
    }
}
