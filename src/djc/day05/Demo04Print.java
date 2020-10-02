package djc.day05;

public class Demo04Print { //打印指定次数的输出
    public static void main(String[] args) {
        printcount(10);
    }

    public static void printcount(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("这是第" + i + "次");
        }
    }
}
