package djc.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo03Set { //Set集合

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add方法
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用迭代器遍历集合
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); //1 2 3不存储重复数据，不一定按照顺序
        }
        System.out.println("----------");
        //增强for遍历
        for (Integer integer : set) {
            System.out.println(integer); //1 2 3
        }
    }
}
