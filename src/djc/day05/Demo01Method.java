package djc.day05;

public class Demo01Method {

    public static void main(String[] args) {
        Method1(); //单独调用
        System.out.println("===============");

        Sum(10, 20); //单独调用，有参数
        System.out.println("===============");

        System.out.println(Sum(10, 20)); //打印调用
        System.out.println("===============");

        int number = Sum(10, 20); //赋值调用
        System.out.println("===============");

        System.out.println(number);
        System.out.println("===============");

        Method2(); //无参数
    }

    //复习
    public static void Method1() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //有参数，有返回值
    public static int Sum(int a, int b) {
        int result = a + b;
        return result;
    }

    //无参数,无返回值
    public static void Method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld");
        }
    }
}
