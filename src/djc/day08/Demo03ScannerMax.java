package djc.day08;

import java.util.Scanner;

public class Demo03ScannerMax { //键盘输入三个int数字，然后求出其中的最大值
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();

        /*int max = 0;
        if (a > b && a > c) {
            max =a;
        } else if (a < b && c < b) {
            max = b;
        } else if(a < c && b < c){
            max = c;
        }*/

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;

        System.out.println("三个数中最大值为：" + max);
    }
}
