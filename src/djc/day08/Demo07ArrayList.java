package djc.day08;

import java.util.ArrayList;

public class Demo07ArrayList {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println(al); //[]
        System.out.println("===========");

        al.add("dzy"); //向集合中添加数据
        System.out.println(al); //[dzy]
        al.add("wll");
        System.out.println(al); //[dzy,wll]
        System.out.println("============");

        //常用方法
        System.out.println("第0号元素是：" + al.get(0)); //get()从集合中获取元素
        System.out.println("当前集合的长度为：" + al.size()); //获取集合的长度尺寸，也就是其中的元素个数
        System.out.println("==============");

        al.remove(1); //把array[1]从集合当中删除
        System.out.println("当前的集合为" + al);
        System.out.println("当前集合的长度为：" + al.size()); //获取集合的长度尺寸，也就是其中的元素个数
        System.out.println("===============");

        //遍历集合
        al.add("wll");
        al.add("lxr");
        al.add("wj");
        System.out.println("遍历集合：");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("==================");

        //存储基本数据
        ArrayList<Integer> listi = new ArrayList<>(); //集合类中存储int基本类型数据
        listi.add(10);
        listi.add(20);
        System.out.println(listi); //[10,20]
        System.out.println("第0号元素是："+listi.get(0)); //10

    }
}
