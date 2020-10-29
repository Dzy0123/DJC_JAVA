package djc.day19;

/*生产者（包子铺）类：是一个线程类，可以继承Thread
 * 设置线程任务：
 *   生产包子；
 *   对包子的状态进行判断：
 *       true，有包子：
 *           包子铺调用wait方法进入等待状态；
 *       false，没有包子：
 *           包子铺交替生产两种包子：
 *               两种状态用 i%2==0 表示
 *           包子铺生产好包子以后修改包子的状态为true；
 *           唤醒顾客线程，让顾客线程吃包子
 * 注意事项：
 *   包子铺线程和包子线程关系：通信（互斥）关系；
 *   必须使用同步技术保证两个线程只能有一个在执行；
 *   锁对象必须保证唯一，可以使用包子对象作为锁对象。
 *   包子铺类和顾客类就需要把包子对象作为参数传递进来：
 *       需要在成员位置创建一个包子变量；
 *       使用带参数构造方法为这个包子变量赋值
 */
public class BaoZiPu extends Thread {
    //在成员位置创建一个包子变量
    private BaoZi bz;

    //使用带参数构造方法为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务，生产包子
    @Override
    public void run() {
        //定义一个状态变量
        int count = 0;

        //一直生产包子
        while (true) {
            //同步代码块，保证只有一个线程在执行
            synchronized (bz) {
                //对包子的在状态进行判断
                //有包子
                if (bz.flag == true) {
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行，包子铺交替生产两种包子
                if (count % 2 == 0) {
                    //生产薄皮三鲜馅包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜";
                } else {
                    //生产冰皮牛肉馅包子
                    bz.pi = "冰皮";
                    bz.xian = "牛肉";
                }
                count++;
                System.out.println("包子铺正在生产：" + bz.pi + bz.xian + "包子");

                //生产包子需要三秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //包子生产好之后修改包子状态为true，并唤醒顾客线程吃包子
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经生产了：" + bz.pi + bz.xian + "馅的包子，顾客可以吃了");
            }
        }
    }
}
