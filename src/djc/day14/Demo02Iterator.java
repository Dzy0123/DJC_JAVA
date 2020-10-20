package djc.day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator { //Iterator迭代器

    public static void main(String[] args) {

        //创建集合
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");

        //使用集合中的方法iterator()获取迭代器的实现类对象
        //使用Iterator接口来接收(多态)
        Iterator<String> iter = coll.iterator();

        /*//使用Iterator接口的hasNext方法判断还有没有下一个元素
        System.out.println(iter.hasNext()); //true
        //使用Iterator接口的next方法取出集合中的下一个元素
        System.out.println(iter.next()); //a
        System.out.println("------------------");

        System.out.println(iter.hasNext()); //true
        System.out.println(iter.next()); //b
        System.out.println("------------------");

        System.out.println(iter.hasNext()); //true
        System.out.println(iter.next()); //c
        System.out.println("------------------");

        System.out.println(iter.hasNext()); //false
        //System.out.println(iter.next()); //异常*/

        //使用循环来使用Iterator接口方法
        //不知道循环次数所以用while循环
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
