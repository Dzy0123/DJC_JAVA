package djc.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List { //List集合

    public static void main(String[] args) {

        //创建List集合
        List<String> list = new ArrayList<>();
        //add方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list); //[a, b, c, d, a]

        //指定索引位置的add方法
        list.add(3,"3");
        System.out.println(list); //[a, b, c, 3, d, a]

        //remove方法
        String str1 = list.remove(3);
        System.out.println("被移除的元素："+str1); //被移除的元素：3
        System.out.println(list); //[a, b, c, d, a]

        //set方法
        String str2 = list.set(3,"3");
        System.out.println("被替换的元素："+str2); //被替换的元素：d
        System.out.println(list); //[a, b, c, 3, a]

        //List集合遍历的三种方式
        //使用普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------");
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------");
        //增强for循环遍历
        for(String str : list){
            System.out.println(str);
        }
    }
}
