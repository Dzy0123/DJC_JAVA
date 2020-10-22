package djc.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo04HashMapSavePerson { //HashMap存储自定义类型元素

    public static void main(String[] args) {
        //创建HashMap集合对象
        /*
            key：String类型
                String类必须从写hashCode方法和equals方法，以保证key唯一
            value：Person类型
                value可以重复(同名同年龄的人视为同一个人)
        */
        HashMap<String,Person> map = new HashMap<>();
        map.put("西安",new Person("dzy",21));
        map.put("上海",new Person("lxr",20));
        map.put("北京",new Person("wj",19));
        map.put("西安",new Person("wll",18)); //key重复，value替换

        Set<String> set = map.keySet();
        /*
            上海-->Person{name='lxr', age=20}
            西安-->Person{name='wll', age=18}
            北京-->Person{name='wj', age=19}
        */
        for (String s : set) {
            System.out.println(s+"-->"+map.get(s));
        }
        System.out.println("==============");

        /*
            key：Person类型：
                Person类必须重写hashCode方法和equals方法，以保证key唯一
            value：String类型：
                可以重复
        */
        HashMap<Person,String> map2 = new HashMap<>();
        map2.put(new Person("范冰冰",18),"北京");
        map2.put(new Person("佟丽娅",19),"新疆");
        map2.put(new Person("杨幂",22),"杭州");
        map2.put(new Person("范冰冰",18),"东北"); //同名同年龄，key重复，value替换

        /*
            Person{name='杨幂', age=22}<--杭州
            Person{name='佟丽娅', age=19}<--新疆
            Person{name='范冰冰', age=18}<--东北
        */
        Set<Map.Entry<Person, String>> entrySet = map2.entrySet();
        for (Map.Entry<Person, String> personEntry : entrySet) {
            System.out.println(personEntry.getKey()+"<--"+personEntry.getValue());
        }
    }
}
