package djc.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet { //通过键找值方法遍历Map集合

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("詹姆斯","戴维斯");
        map.put("哈登","威少");
        map.put("小卡","泡椒");
        System.out.println(map);
        System.out.println("===============");

        //通过keySet()方法把Map集合中所有的键存储到一个Set集合中
        Set<String> set = map.keySet();
        //遍历Set集合，获取Map集合的每一个key
        //迭代器
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("-------------");
        //增强for
        for (String key : set) {
            //通过Map集合的getKey方法，通过key找到对应的value值
            System.out.println(key+"="+map.get(key));
        }
    }
}
