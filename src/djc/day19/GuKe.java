package djc.day19;
/*消费者（顾客）类：是一个线程类，可以继承Thread
* 设置线程任务：
*   吃包子
*   对包子的状态进行判断：
*       false：没有包子：
*           顾客调用wait方法进入等待状态；
*       true：有包子：
*           顾客吃包子；
*           顾客吃完包子后修改包子的状态为false；
*           顾客唤醒包子铺线程生产包子
*/
public class GuKe extends Thread{
    //在成员位置创建一个包子变量
    private BaoZi bz;

    //使用带参数构造方法为这个包子变量赋值
    public GuKe(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务，吃包子
    @Override
    public void run() {
        //让顾客一直吃包子
        while(true){
            //同步代码块保证只有一个线程在执行
            synchronized (bz){
                //判断包子状态，没有包子
                if(bz.flag == false){
                    //顾客线程调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //线程唤醒之后执行，顾客吃包子
                System.out.println("顾客正在吃"+bz.pi+bz.xian+"包子");
                //包子吃完了，修改包子的状态为false
                bz.flag = false;

                //唤醒包子铺线程继续生产
                bz.notify();
                System.out.println(bz.pi + bz.xian + "包子吃完了，包子铺继续生产");
                System.out.println("------------");
            }
        }
    }
}
