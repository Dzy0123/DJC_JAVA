package djc.day22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo08ObjectOutputStream { //序列化流
    public static void main(String[] args) throws IOException {
        //创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\b\\c.txt"));

        //使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        oos.writeObject(new Person("wll", 18));

        //资源释放
        oos.close();
    }
}
