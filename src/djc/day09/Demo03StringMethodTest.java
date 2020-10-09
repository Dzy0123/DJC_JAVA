package djc.day09;

import java.util.Scanner;

public class Demo03StringMethodTest {

    public static void main(String[] args) {
        //arrayToString调用
        int[] array = {1, 2, 3};
        arrayToString(array);
        System.out.println("=============");

        //countString调用
        countString();
        System.out.println("=============");

    }

    //定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照：[word1#word2#word3]
    public static String arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str = str + "word" + "#" + array[i];
        }
        System.out.println(str + "]");
        return str;
    }

    //键盘输入一个字符串，并且统计其中各种字符出现的次数
    //种类有：大写字母、小写字母、数字、其他
    public static void countString() {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        String str1 = new String();
        String str2 = new String();
        String str3 = new String();
        String str4 = new String();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A' <= ch && ch <= 'Z') {
                ++num1;
                str1 += ch;
            } else if ('a' <= ch && ch <= 'z') {
                ++num2;
                str2 += ch;
            } else if ('0' <= ch && ch <= '9') {
                ++num3;
                str3 += ch;
            } else {
                ++num4;
                str4 += ch;
            }
        }

        System.out.println("字符串中大写字母出现的次数为：" + num1);
        System.out.println("字符串中出现的大写字母为：" + str1);

        System.out.println("字符串中小写字母出现的次数为：" + num2);
        System.out.println("字符串中出现的小写字母为：" + str2);

        System.out.println("字符串中数字出现的次数为：" + num3);
        System.out.println("字符串中出现的数字为：" + str3);

        System.out.println("字符串中其他类型字符出现的次数为：" + num4);
        System.out.println("字符串中出现的其他类型字符为：" + str4);
    }
}
