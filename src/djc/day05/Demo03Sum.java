package djc.day05;

public class Demo03Sum { //定义一个方法，求出1~100的和
    public static void main(String[] args) {
        System.out.println(isSum(0));
    }

    public static int isSum(int sum) {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
