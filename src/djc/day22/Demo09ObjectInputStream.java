package djc.day22;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo09ObjectInputStream { //反序列化流
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\b\\c.txt"));

        //使用ObjectInputStream对象中的方法readObject，读取保存对象的文件
        Object o = ois.readObject();

        //释放资源
        ois.close();

        //使用一下读取出来的对象（打印）
        System.out.println(o); //Person{name='wll', age=18}
        Person p = (Person) o;
        System.out.println(p.getName()); //wll
        System.out.println(p.getAge()); //18
    }
}
