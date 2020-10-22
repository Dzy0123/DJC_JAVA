package djc.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet { //使用键值对遍历Map集合

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("詹姆斯","戴维斯");
        map.put("哈登","威少");
        map.put("小卡","泡椒");
        System.out.println(map);
        System.out.println("===============");

        //使用entrySet()方法把Map集合内部的多个Entry对象取出来存储到一个Set集合中
        Set<Map.Entry<String, String>> set = map.entrySet();
        //遍历Set集合，获取Map集合的每一个key
        //迭代器
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("----------------");
        //增强for
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
