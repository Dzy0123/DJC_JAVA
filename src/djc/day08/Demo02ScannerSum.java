package djc.day08;

import java.util.Scanner;

public class Demo02ScannerSum { //键盘输入两个int数字并求出和值
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(a+"加"+b+"的值为"+sum);
    }
}
