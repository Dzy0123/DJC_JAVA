package djc.day13;

import java.util.ArrayList;

public class Demo10Integer { //包装类

    public static void main(String[] args) {
        //装箱
        //构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1); //1，重写了toString方法
        Integer in2 = new Integer("1");
        System.out.println(in2); //1
        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3); //1
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4); //1

        //拆箱
        //成员方法
        int i = in1.intValue(); //int
        System.out.println(i); //1
        int j = in2.intValue(); //String
        System.out.println(j); //1

        //自动装箱与拆箱
        Integer in5 = 4; //自动装箱，Integer in5 = new Integer(4)
        in5 = in5 + 2; //自动拆箱再装箱，Integer in5 = new Integer(in5.intValue() + 2)

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //自动装箱，list.add(new Integer(1))
        list.get(0); //自动拆箱，list.get(0).intValue();
        System.out.println("================");

        //基本类型-->字符串
        //基本类型直接机上空字符串
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200); //100200
        //static String toString(int i)
        String s2 = Integer.toString(100);
        System.out.println(s2 + 200); //100200
        //String类的静态方法valueOf(参数)
        String s3 = String.valueOf(100);
        System.out.println(s3 + 200); //100200
        System.out.println("============");

        //字符串-->基本类型
        //使用包装类的静态方法parseXxx("数值类型字符串")
        int i2 = Integer.parseInt(s1);
        System.out.println(i2 + 100); //200
    }
}
