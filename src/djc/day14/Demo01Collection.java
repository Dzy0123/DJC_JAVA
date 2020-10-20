package djc.day14;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {

    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); //[]
        System.out.println("==============");

        //public boolean add方法
        //把给定的对象添加到当前集合中
        coll.add("dzy");
        coll.add("wll");
        coll.add("lxr");
        coll.add("wj");
        System.out.println(coll); //[dzy, wll, lxr, wj]
        System.out.println("--------------");

        //public boolean remove(E e)
        //把给定的对象在当前集合中删除
        coll.remove("wj");
        System.out.println(coll);
        System.out.println("--------------");

        //public boolean contains(E e)
        //判断当前集合中是否包含给定的对象
        boolean b1 = coll.contains("dzy");
        boolean b2 = coll.contains("wj");
        System.out.println("b1:" + b1); //true
        System.out.println("b2:" + b2); //false
        System.out.println("--------------");

        //public boolean size()
        //返回集合中元素的个数
        int size = coll.size();
        System.out.println(size); //3
        System.out.println("--------------");

        //public boolean isEmpty()
        //判断集合是否为空
        boolean b3 = coll.isEmpty();
        System.out.println("b3:" + b3); //false
        System.out.println("--------------");

        //public Object[] toArray()
        //把集合中的元素，存储到数组中
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------------");

        //public void clear()
        //清空集合中的所有元素
        coll.clear();
        System.out.println(coll); //[]
        System.out.println(coll.isEmpty()); //true
    }
}
