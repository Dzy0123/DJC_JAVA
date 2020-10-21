package djc.day15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Demo06LinkedHashSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("www");
        set.add("itcast");
        System.out.println(set); //[abc, www, itcast]无序，不允许重复

        LinkedHashSet<String> linkedset = new LinkedHashSet<>();
        linkedset.add("www");
        linkedset.add("abc");
        linkedset.add("abc");
        linkedset.add("itcast");
        System.out.println(linkedset); //[www, abc, itcast]有序，不允许重复
    }
}
