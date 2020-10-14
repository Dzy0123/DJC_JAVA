package djc.day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
* java.util.List正是ArrayList所实现的接口
*/
public class Demo11Interface { //接口作为参数和返回值

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("dzy");
        list.add("wll");
        list.add("lxr");
        return list;
    }
}
