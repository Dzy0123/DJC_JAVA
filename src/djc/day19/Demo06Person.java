package djc.day19;

import java.util.Arrays;
import java.util.Comparator;

/*带参数带返回值的Lambda表达式练习
 * 需求：
 *   使用数组存储多个Person对象；
 *   对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo06Person {


    public static void main(String[] args) {
        //创建数组
        Person[] arr = {
                new Person("佟丽娅", 25),
                new Person("古力娜扎", 18),
                new Person("迪丽热巴", 20)
        };

        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序

        //用匿名内部类重写Comparator接口
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge(); //o1-o2升序排序
            }
        });

        //使用Lambda表达式简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //省略格式
        Arrays.sort(arr, (Person o1, Person o2) -> o1.getAge() - o2.getAge());

        //遍历Person数组
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
