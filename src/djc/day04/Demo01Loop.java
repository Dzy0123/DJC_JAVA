package djc.day04;

public class Demo01Loop { //循环语句
    public static void main(String[] args) {
        //for循环
        for (int i = 1; i <= 3000; i++) {
            System.out.println("I love WLL" + i);
        }
        System.out.println("3 thousands times");
        System.out.println("===================");

        //while循环
        int i1 = 1;
        while (i1 <= 3000) {
            System.out.println("I love WLL" + i1);
            i1++;
        }
        System.out.println("3 thousands times");
        System.out.println("===================");

        //do-while循环
        int i2 = 1;
        do {
            System.out.println("I love WLL" + i2);
            i2++;
        } while (i2 <= 3000);
        System.out.println("=================");

        //求1~100的和
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 += i; //sum1 = sum1 + i
        }
        System.out.println("1~100的和为" + sum1);
        System.out.println("================");

        //求1~100之间的偶数和
        //for循环
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum2 += i;
            }
        }
        System.out.println("1~100之间的偶数和为" + sum2);
        System.out.println("===================");

        //求1~100之间的偶数和
        //while循环
        int sum3 = 0;
        int i3 = 1;
        while (i3 <= 100) {
            if (i3 % 2 == 0) {
                sum3 += i3;
            }
            i3++;
        }
        System.out.println("1~100偶数和为" + sum3);
        System.out.println("===========================");

        //break的运用
        for (int i = 1; i <= 3000; i++) {
            if (i == 7) { //从第七次开始后续都不要
                break;
            }
            System.out.println("I love WLL" + i);
        }
        System.out.println("3 thousands times");
        System.out.println("===================");

        //continue的运用
        //一旦执行，立刻跳过当前次循环剩余内容，马上开始下一个循环
        for (int i = 1; i <= 10; i++) {
            if (i == 4) { //如果当前是4
                continue; //跳过本次循环马上开始下一次循环
            }
            System.out.println(i);
        }
        System.out.println("=================");

        /*
        死循环的标准格式:
        while(true){
            循环体
        }
        */

        //循环嵌套
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.println("现在是" + i + "点" + j + "分");
            }
        }
        System.out.println("================");

        //打印5*8的矩形
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
