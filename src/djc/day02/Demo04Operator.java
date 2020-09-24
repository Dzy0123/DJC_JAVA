package djc.day02;

public class Demo04Operator { //运算符
    public static void main(String[] args){
        //四则运算符
        int a = 10, b = 3;
        System.out.println(a+b); //13
        System.out.println(a-b); //7
        System.out.println(a*b); //30
        System.out.println(a/b); //3，商运算，不看余数

        System.out.println(a%b); //1，取模，整数中就是取余数

        //int + double --> double + double =double
        double result1 = a + 2.5;
        System.out.println(result1); //12.5
        System.out.println("====================");

        //加号在字符串中的连接作用
        String str1 = "Hello";
        System.out.println(str1); //Hello
        System.out.println(str1 + "World"); //HelloWorld

        //String + int --> String
        String str2 = "WangLan";
        System.out.println(str2 + 250); //WangLan250

        //优先级问题
        System.out.println(str2 + 250 + 38); //WangLan25038
        System.out.println(str2 +(250 + 38)); //WangLan288
        System.out.println(str2 + 250 * 38); //WangLan9500
        System.out.println("===========================");

        //自增自减
        int num1 = 10;
        num1++; //11
        System.out.println(num1++); //11
        System.out.println(num1); //12

        int num2 = 10;
        ++num2; //11
        System.out.println(++num2); //12

        int x = 10;
        int y = 20;
        int result2 = ++x + y--;
        System.out.println(result2);
        System.out.println(x+" "+y);
        System.out.println("========================");

        //赋值运算符
        int c = 10;
        c += 5; // c = c+5
        System.out.println(c); //15
        c -= 5; // c = c-5
        System.out.println(c); //10
        c *= 5; // c = c*5
        System.out.println(c); //50
        c /= 5; // c = c/5
        System.out.println(c); //10
        c %= 5; // c = c%5
        System.out.println(c); //0

        byte num = 30;
        num += 5;
        /*
        * num = num + 5
        * num = byte + int
        * num = int + int
        * num = int
        * num = (byte) int
        */
        System.out.println(num); //35


        //比较运算符
        System.out.println(10 > 5); //true
        int num3 = 10;
        int num4 = 12;
        System.out.println(num3<num4); //true
        System.out.println(num3>num4); //false
        System.out.println(num3>=num4); //false
        System.out.println(num3<=20); //true

        System.out.println(10==10); //true
        System.out.println(10!=10); //false
        System.out.println("===================");

        //逻辑运算符
        System.out.println(true && false); //false
        System.out.println(3<5 && 6<10); //true

        System.out.println(true || false); //true
        System.out.println(false || false); //false

        System.out.println(true); //true
        System.out.println(!true); //false

        //短路效果
        int d = 10;
        System.out.println(3>4 && ++d<100); //false
        System.out.println(d); //10

        System.out.println(4<6 || ++d>100); //true
        System.out.println(d); //10
        System.out.println("======================");

        //三元运算符
        //数据类型 变量名称 = 条件判断 ? 表达式A：表达式B
        //判断为true，把A赋值给左侧数据；判断为false，把B赋值给左侧数据
        int max = a>b ? a:b; //a=10
        int min = a<b ? a:b; //b=3
        System.out.println(max+","+min);
    }
}
