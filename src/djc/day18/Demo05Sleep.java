package djc.day18;

/*
 * public static void sleep(long millis)：
 *   在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）。
 *   毫秒数结束之后，线程继续执行。
 */
public class Demo05Sleep {
    public static void main(String[] args) throws InterruptedException {
        //模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法使程序睡眠一秒钟
            Thread.sleep(1000);
        }
    }
}
