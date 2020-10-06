package djc.day06;

import java.lang.reflect.Array;

public class Demo01Array {
    public static void main(String[] args) {
        //动态数组
        //创建一个数组，里面可以存放300个int数据
        int[] array1 = new int[300];
        //创建一个数组，里面可以存放300个double数据
        double[] array2 = new double[300];
        //创建一个数组，里面可以存放300个字符串
        String[] array3 = new String[300];

        //静态数组
        //直接创建一个数组,里面装的全都是int数字，具体为：5、15、25、35
        int[] array4 = new int[]{5, 15, 25, 35}; //标准格式
        int[] array5 = {10, 20, 30}; //省略格式
    }
}
