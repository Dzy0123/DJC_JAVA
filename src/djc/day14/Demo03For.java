package djc.day14;

import java.util.ArrayList;

/*
* 增强for循环(也称为for each循环)是JDK1.5以后出来的一个高级for循环，专门用来遍历数组和集合的。
* 格式：
*   for(元素的类型 变量: Collection集合 or 数组) {
*       //写操作代码
    }
*/
public class Demo03For { //增强for循环

    public static void main(String[] args) {

        //遍历数组
        int[] array = {1, 2, 3, 4, 5};
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("=============");

        //遍历集合
        ArrayList<String> list = new ArrayList<>();
        list.add("dzy");
        list.add("wll");
        list.add("lxr");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
