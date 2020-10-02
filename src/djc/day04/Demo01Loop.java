package djc.day04;

public class Demo01Loop { //循环语句
    public static void main(String[] args){
        //for循环
        for(int i1 = 1;i1 <= 3000;i1++){
            System.out.println("I love WLL"+i1);
        }
        System.out.println("3 thousands times");
        System.out.println("===================");

        //while循环
        int i2 = 1;
        while(i2 <= 3000){
            System.out.println("I love WLL"+i2);
            i2++;
        }
        System.out.println("3 thousands times");
        System.out.println("===================");

        //do-while循环
        int i3 = 1;
        do{
            System.out.println("I love WLL"+i3);
            i3++;
        }while(i3 <= 3000);
        System.out.println("=================");

        //求1~100的和
        int sum1 = 0;
        for(int i4 = 1;i4 <= 100;i4++){
             sum1 += i4; //sum1 = sum1 + i4
        }
        System.out.println("1~100的和为"+sum1);
        System.out.println("================");

        //求1~100之间的偶数和
        //for循环
        int sum2 = 0;
        for(int i5 = 1;i5 <=100;i5++){
            if(i5%2 == 0){
                sum2 += i5;
            }
        }
        System.out.println("1~100之间的偶数和为"+sum2);
        System.out.println("===================");

        //求1~100之间的偶数和
        //while循环
        int sum3 = 0;
        int i6 = 1;
        while(i6 <= 100){
            if(i6%2 == 0){
                sum3 += i6;
            }
            i6++;
        }
        System.out.println("1~100偶数和为"+sum3);
        System.out.println("===========================");

        //break的运用
        for(int i1 = 1;i1 <= 3000;i1++){
            if(i1 == 7){ //从第七次开始后续都不要
                break;
            }
            System.out.println("I love WLL"+i1);
        }
        System.out.println("3 thousands times");
        System.out.println("===================");

        //continue的运用
        //一旦执行，立刻跳过当前次循环剩余内容，马上开始下一个循环
        for(int i1 = 1;i1 <= 10;i1++){
            if(i1 == 4){ //如果当前是4
                continue; //跳过本次循环马上开始下一次循环
            }
            System.out.println(i1);
        }
        System.out.println("=================");

        /*
        死循环的标准格式:
        while(true){
            循环体
        }
        */

        //循环嵌套
        for(int i7 = 0;i7 < 24;i7++){
            for(int j1 = 0;j1 < 60;j1++){
                System.out.println("现在是"+i7+"点"+j1+"分");
            }
        }
        System.out.println("================");

        //打印5*8的矩形
        for(int i8 = 0;i8 < 5;i8++){
            for(int j2 = 0;j2 < 8;j2++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
