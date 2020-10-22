package djc.day16;

import java.util.LinkedHashMap;

public class Demo05LinkedHashMap { //LinkedHashMap集合

    public static void main(String[] args) {
        LinkedHashMap<String,String> lhmap = new LinkedHashMap();
        lhmap.put("a","a");
        lhmap.put("d","d");
        lhmap.put("c","c");
        lhmap.put("b","b");
        System.out.println(lhmap); //{a=a, d=d, c=c, b=b},存储取出顺序一致
    }
}
