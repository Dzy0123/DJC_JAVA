package djc.day15;

import java.util.LinkedList;

public class Demo02LinkedList { //List的子类

    public static void main(String[] args) {
        //创建LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        //addFirst
        list.addFirst("1");
        System.out.println(list); //[1, a, b, c, d, e]
        //push
        list.push("0");
        System.out.println(list); //[0, 1, a, b, c, d, e]
        //addLast
        list.addLast("end");
        System.out.println(list); //[0, 1, a, b, c, d, e, end]
        System.out.println("-------------");

        //getFirst
        System.out.println(list.getFirst()); //0
        //getLast
        System.out.println(list.getLast()); //end
        System.out.println("-------------");

        //removeFirst
        String str1 = list.removeFirst();
        System.out.println("被移除的第一个元素为："+str1); //被移除的第一个元素为：0
        System.out.println(list); //[1, a, b, c, d, e, end]
        //pop
        String str2 = list.pop();
        System.out.println("被移除的第一个元素为："+str2); //被移除的第一个元素为：1
        System.out.println(list); //[a, b, c, d, e, end]
        //removeLast
        String str3 = list.removeLast();
        System.out.println("被移除的最后一个元素为："+str3); //被移除的最后一个元素为：end
        System.out.println(list); //[a, b, c, d, e]
    }
}
