package djc.day22;

import java.io.*;
import java.util.ArrayList;

/*
练习：序列化集合
    当我们想在文件中保存多个对象的时候，
    可以把多个对象存储到一个集合中，
    对集合进行序列化和反序列化。
分析：
    1.定义一个存储Person对象的ArrayList集合
    2.往ArrayList集合中存储Person对象
    3.创建一个序列化流ObjectOutputStream对象
    4.使用ObjectOutputStream对象中的方法writeObject，对集合进行序列化
    5.创建一个反序列化流ObjectInputStream对象
    6.使用ObjectInputStream对象中的方法readObject，读取文件中保存的集合
    7.把Object类型的集合转换为ArrayList集合
    8.遍历ArrayList集合
    9.释放资源
*/
public class Demo10SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //定义一个存储Person对象的ArrayList集合
        ArrayList<Person> list = new ArrayList<>();

        //往ArrayList集合中存储Person对象
        list.add(new Person("dzy", 18));
        list.add(new Person("wll", 19));
        list.add(new Person("lxr", 20));

        //创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\b\\list.txt"));

        //使用ObjectOutputStream对象中的方法writeObject，对集合进行序列化
        oos.writeObject(list);

        //创建一个反序列化流ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\b\\list.txt"));

        //使用ObjectInputStream对象中的方法readObject，读取文件中保存的集合
        Object o = ois.readObject();

        //把Object类型的集合转换为ArrayList集合
        ArrayList<Person> list2 = (ArrayList<Person>) o;

        //遍历ArrayList集合
        for (Person person : list2) {
            System.out.println(person);
        }

        //释放资源
        ois.close();
        oos.close();
    }
}
