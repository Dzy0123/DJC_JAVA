package djc.day05;

public class Demo02Same { //定义一个方法，用来判断两个数字是否相同，参数类型分别为两个byte型，两个short型，两个int型，两个long型
    public static void main(String[] args) {
        ifSame(10, 20);
        System.out.println("============");

        boolean resoult = isSame(30, 40);
        System.out.println(resoult);
        System.out.println(isSame(20, 20));
        System.out.println("============");

        System.out.println(isSame((short) 12, (short) 30));
        System.out.println(isSame((long) 2000000000, (long) 300000000));
        System.out.println(isSame(300000000, 400));
    }

    public static void ifSame(int a, int b) {
        if (a == b) {
            System.out.println(a + "等于" + b);
        } else {
            System.out.println(a + "不等于" + b);
        }
    }

    public static boolean isSame(byte a, byte b) {
        boolean same = a == b;
        System.out.println("两个byte方法执行");
        return same;
    }

    public static boolean isSame(short a, short b) {
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        System.out.println("两个short方法执行");
        return same;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long方法执行");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int方法执行");
        return a == b;
    }
}
