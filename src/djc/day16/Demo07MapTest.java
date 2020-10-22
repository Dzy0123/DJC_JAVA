package djc.day16;

import java.util.HashMap;
import java.util.Scanner;


/*
*   计算一个字符串中每个字符出现的次数
*/
public class Demo07MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        count(str);
    }

    public static void count(String str){
        //创建Map集合，key是字符串中的字符c，value是字符的个数
        HashMap<Character,Integer> map = new HashMap<>();

        //遍历字符串，获取每一个字符
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if(map.containsKey(c)){
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                //key不存在
                map.put(c,1);
            }
        }
        //输出结果
        System.out.println(map);
        System.out.println("==========");
    }
}
