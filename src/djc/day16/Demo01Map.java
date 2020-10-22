package djc.day16;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map { //Map集合

    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,String> map = new HashMap<>();

        /*
        *   public V put(K key, V value):
        *       把指定的键与指定的值添加到Map集合中
        *   返回值：V
        *       存储键值对的时候，key不重复，返回值V是null
        *       存储键值对的时候，key重复，会使用新的value替换Map中重复的value，返回被替换的value值
        */
        String v1 = map.put("dzy","wll1");
        System.out.println("v1:"+v1); //v1:null
        System.out.println(map); //{dzy=wll1}
        String v2 = map.put("dzy","wll2");
        System.out.println("v2:"+v2); //v2:wll1
        System.out.println(map); //{dzy=wll2}
        System.out.println("==================");

        map.put("李晨","范冰冰");
        map.put("黄晓明","杨颖");
        //key不允许重复，但是value可以重复
        map.put("PGone","李小璐");
        map.put("贾乃亮","李小璐");
        //{dzy=wll2, 贾乃亮=李小璐, 李晨=范冰冰, PGone=李小璐, 黄晓明=杨颖}
        System.out.println(map);
        System.out.println("=================");

        /*
        *   public V remove(Object key)：
        *       把指定的键，所对应的键值对元素，在Map集合中删除，返回被删除元素的值
            返回值：V
                key存在，v返回被删除的值；
                key不存在，v返回null；
        */
        String v3 = map.remove("黄晓明");
        System.out.println("被删除的是："+v3); //被删除的是：杨颖
        //{dzy=wll2, 贾乃亮=李小璐, 李晨=范冰冰, PGone=李小璐}
        System.out.println(map);
        String v4 = map.remove("abc");
        System.out.println("被删除的是："+v4); //被删除的是：null
        System.out.println("=====================");

        /*
        *   public V get(Object key)：
        *       根据指定的键，在Map集合中获取对应的值。
        *   返回值：V
                key存在，返回对应的获取的value；
                key不存在，返回null；
        */
        System.out.println(map.get("李晨")); //范冰冰
        System.out.println(map.get("黄晓明")); //null
        System.out.println("==============");

        /*
        *   boolean containsKey(Object key)：
        *       判断集合中是否包含指定的键
        *   返回值：
                包含返回true;
                不包含返回false;
        */
        System.out.println(map.containsKey("dzy")); //true
        System.out.println(map.containsKey("黄晓明")); //false
    }
}
