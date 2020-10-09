package djc.day09;

import java.util.Arrays;

public class Demo06Arrays { //数组工具类

    public static void main(String[] args) {
        int[] array = {1,2,3};
        String str1 = Arrays.toString(array); //将int[]数组按照默认格式变成字符串
        System.out.println(str1);
        System.out.println("=============");

        int[] array1 = {20,30,10,7};
        Arrays.sort(array1); //将int[]数组的元素按照升序进行排序
        System.out.println(Arrays.toString(array1)); //[7,10,20,30]
        System.out.println("=============");

        String[] array2 = {"bbb","aaa","vvv"};
        String[] array3 = {"cad","acd","vdf"};
        Arrays.sort(array2);
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array2)); //["aaa","bbb","ccc"]
        System.out.println(Arrays.toString(array3)); //["acd","cad","vdf"]
    }
}
