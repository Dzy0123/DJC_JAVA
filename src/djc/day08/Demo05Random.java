package djc.day08;

import java.util.Random;
import java.util.Scanner;

public class Demo05Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int num1 = rd.nextInt();
        System.out.println(num1);
        System.out.println("=========");

        for (int i = 0; i < 100; i++) {
            int num2 = rd.nextInt(30);
            System.out.println(num2);
        }
        System.out.println("=============");

        //根据int变量n的值获取随机数字，范围是[1,n]
        /*System.out.println("请输入n的值：");
        int  n = new Scanner(System.in).nextInt();
        for (int i = 0; i < 100; i++) {
            int num3 = rd.nextInt(n+1);
            if(num3 >= 1){
                System.out.println("在1~"+n+"之间的随机数为");
                System.out.println(num3);
            }
        }*/
        System.out.println("请输入n的值：");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < 100; i++) {
            int num3 = rd.nextInt(n) + 1;
            System.out.println(num3);
        }
        System.out.println("==============");

        //猜数字小游戏
        int num4 = rd.nextInt(100) + 1;
        int i2 = 5;

        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println("请输入你所猜的数字,你还有" + i2 + "次机会");
            --i2;
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i > num4) {
                System.out.println("你所猜的数字过大");
            } else if (i < num4) {
                System.out.println("你所猜的数字过小");
            } else {
                System.out.println("你真棒！");
                break;
            }
        }


    }
}
