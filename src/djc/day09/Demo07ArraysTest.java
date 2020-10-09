package djc.day09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo07ArraysTest {

    public static void main(String[] args) {

        //请使用Arrays相关的API，将一个字符串中的所有字符进行升序排列，并且倒序打印。
        System.out.println("请输入一个任意的字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] array = str.toCharArray();
        Arrays.sort(array);

        System.out.println("字符串升序排序后，倒序打印为：");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
