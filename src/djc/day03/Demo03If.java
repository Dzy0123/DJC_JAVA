package djc.day03;

public class Demo03If { //判断语句
    public static void main(String[] args){
        //单if判断
        int age = 16;
        if(age >= 18){
            System.out.println(age+"岁允许进入网吧");
        }
        System.out.println(age+"岁拒绝进入网吧");
        System.out.println("=====================");

        //if...else
        int num1 = 13;
        if(num1%2 == 0){
            System.out.println(num1+"是偶数");
        }else{
            System.out.println(num1+"是基数");
        }
        System.out.println("===============");

        //if...else if...else
        int x = -10;
        int y;
        if(x >= 3){
            y = 2*x + 1;
        }else if(x<3 && x>-1){
            y = 2*x;
        }else{
            y = 2*x - 1;
        }
        System.out.println("x为"+x+"时，y等于"+y);
        System.out.println("========================");

        //if练习，判断成绩等级
        int num2 = 100;
        if(num2<60 && num2>=0){
            System.out.println(num2+"分，不及格");
        }else if(num2>=60 && num2<70){
            System.out.println(num2+"分，及格");
        }else if(num2>=70 && num2<80){
            System.out.println(num2+"分,良");
        }else if(num2>=80 && num2<90){
            System.out.println(num2+"分，好");
        }else if(num2>=90 && num2<=100){
            System.out.println(num2+"分，优秀");
        }else{
            System.out.println(num2+"分是无效成绩");
        }
        System.out.println("===================");

        //用if语句替换三元运算符
        //取两个数中的最大值
        int num3 = 10;
        int num4 = 20;
        int max = 0;
        if(num3 > num4){
            max = num3;
        }else if(num3 == num4){
            System.out.println(num3+"等于"+num4);
        }else{
            max = num4;
        }
        System.out.println("最大值为："+max);

    }
}
