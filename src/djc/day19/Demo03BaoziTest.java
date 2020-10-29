package djc.day19;

/*测试类：
 * 包含main方法，程序执行入口，启动程序
 * 创建包子对象；
 * 创建包子铺线程，开启，生产包子；
 * 创建吃货线程，开启，吃包子
 */
public class Demo03BaoziTest {

    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建包子铺线程，开启，生产包子
        BaoZiPu bzp = new BaoZiPu(bz);
        bzp.start();
        //创建吃货线程，开启，吃包子
        GuKe gk = new GuKe(bz);
        gk.start();
    }
}
