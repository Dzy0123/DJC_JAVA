package djc.day02;

public class Demo02Variable { //变量
    public static void main(String [] args){
        int num1; //创建一个变量
        num1 = 3; //给变量赋值
        System.out.println(num1); //打印输出变量内容

        //改变变量中的值
        num1 = 33;
        System.out.println(num1);

        //一步到位
        int num2 = 6;
        System.out.println(num2);

        System.out.println("==========================");
        byte num3 = 127;
        System.out.println(num3);

        short num4 = 5000;
        System.out.println(num4);

        long num5 = 300000000L;
        System.out.println(num5);

        float num6 = 2.5F;
        System.out.println(num6);

        double num7 = 3.6;
        System.out.println(num7);

        char zifu1 = 'a';
        char zifu2 = '董';
        System.out.println(zifu1);
        System.out.println(zifu2);

        boolean var1 = true;
        boolean var2 = false;
        System.out.println(var1);
        System.out.println(var2);

        //将一个变量的数据内容赋值给另一个变量
        boolean var3 = var1;
        System.out.println(var3);

    }
}
