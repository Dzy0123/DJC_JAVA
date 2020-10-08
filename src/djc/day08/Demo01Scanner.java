package djc.day08;

import java.util.Scanner; //导包

public class Demo01Scanner {
    public static void main(String[] args) {
        //创建
        //System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);

        //使用
        int num = sc.nextInt(); //获取从键盘输入的一个int数字
        String str = sc.next(); //获取从键盘输入的一个字符串

        System.out.println("输入的int值是：" + num);
        System.out.println("输入的字符串是：" + str);
    }
}
