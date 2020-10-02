package djc.day05;

public class Demo05Overload { //方法的重载
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
        System.out.println("==============");

        System.out.println(sum(20, 10));
        System.out.println("==============");

        System.out.println(sum(10, 10, 20, 30));
        System.out.println("==============");

        System.out.println(sum(30.2, 39.2));
        System.out.println("==============");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(double a, double b) {
        return (int) (a + b);
    }

    public static int sum(int a, double b) {
        return (int) (a + b);
    }

    public static int sum(double a, int b) {
        return (int) (a + b);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
