package djc.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo08Collections { //Collections工具类

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //addAll(Collection<? super T> c,T... elements),往集合中添加多个元素
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list); //[a, b, c]

        //shuffle(List<?> list)，打乱集合中的顺序
        Collections.shuffle(list);
        System.out.println(list); //[b, a, c]
        System.out.println("==============");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "a", "c", "e", "d", "b");
        System.out.println(list1); //[a, c, e, d, b]
        //sort(List<T> list)，升序排序
        Collections.sort(list1);
        System.out.println(list1); //[a, b, c, d, e]
        System.out.println("-------------");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "abc", "cda", "efg", "bfd", "bac");
        System.out.println(list2); //[abc, cda, efg, bfd, bac]
        //sort(List<T> list,Comparator<? super T> c)，按照指定器产生的顺序排序
        Collections.sort(list2, new Comparator<String>() {
            //重写比较规则
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0); //首字母升序
            }
        });
        System.out.println(list2); //[abc, bfd, bac, cda, efg]
    }
}
