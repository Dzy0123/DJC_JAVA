package djc.day08;

import java.util.ArrayList;
import java.util.Random;

public class Demo08ArrayListTest {

    public static void main(String[] args) {

        // 生成6个1~33之间的随机整数，添加到集合，并遍历集合

        /*Random rd = new Random();
        int num1 = rd.nextInt(33)+1;
        int num2 = rd.nextInt(33)+1;
        int num3 = rd.nextInt(33)+1;
        int num4 = rd.nextInt(33)+1;
        int num5 = rd.nextInt(33)+1;
        int num6 = rd.nextInt(33)+1;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        list.add(num6);*/

        Random rd = new Random();

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = rd.nextInt(33) + 1;
            list1.add(num);
        }

        System.out.println("随机生成的集合的遍历为：");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("===============");

        // 自定义四个学生对象并添加到集合，并遍历
        ArrayList<Student> list2 = new ArrayList<>();

        Student stu1 = new Student("dzy", 22);
        Student stu2 = new Student("wll", 22);
        Student stu3 = new Student("lxr", 22);
        Student stu4 = new Student("wj", 22);

        list2.add(stu1);
        list2.add(stu2);
        list2.add(stu3);
        list2.add(stu4);

        System.out.println("四个学生对象集合的遍历为：");
        for (int i = 0; i < list2.size(); i++) {
            Student stu = list2.get(i);
            System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge());
        }
        System.out.println("==================");

        //调用自定义方法
        ArrayListprintf(list1);
        System.out.println("=================");

        //集合元素筛选，用一个大集合去存入二十个随机数字，然后筛选其中的偶数元素放入小集合之中。
        //要求使用自定义的方法来实现筛选。
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayScreening(list3, list4);

    }

    // 定义以指定格式打印集合的方法
    // ArrayList类型作为参数，使用{}扩起集合，使用@分割每个元素，格式参照（元素@元素@元素）
    public static void ArrayListprintf(ArrayList<Integer> list) {
        System.out.println("自定义方法输出的集合格式为：");
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size()) {
                System.out.print(list.get(i) + "@");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.println("}");
    }

    //集合元素筛选，用一个大集合去存入二十个随机数字，然后筛选其中的偶数元素放入小集合之中。
    //要求使用自定义的方法来实现筛选。
    public static ArrayList ArrayScreening(ArrayList<Integer> ls1, ArrayList<Integer> ls2) {

        Random rd2 = new Random();

        for (int i = 0; i < 20; i++) {
            int num = rd2.nextInt(50);
            ls1.add(num);
            if (ls1.get(i) % 2 == 0) {
                ls2.add(ls1.get(i));
            }
        }

        System.out.println("大集合为：" + ls1);
        System.out.println("小集合为：" + ls2);
        System.out.println("小集合的元素个数为：" + ls2.size());
        return ls2;
    }
}
