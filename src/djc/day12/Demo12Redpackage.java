package djc.day12;

import djc.day12.red.OpenMode;
import djc.day12.red.RedPacketFrame;

import java.util.ArrayList;
import java.util.Random;

/*
* 场景说明：
*   红包发出去之后，所有人都有红包，大家抢完了之后最后一个红包给群主自己。
* 大多数代码都是现成的，我们需要做的就是填空题：
*   1：设置程序标题，通过构造方法的字符串参数；
*   2：设置群主名称；
*   3：设置分发策略：平均还是随机；
* 红包分发策略：
*   1：普通红包（平均）：totalMoney/totalCount,余数放在最后一个红包中。
*   2：手气红包（随机）：最少一分钱，最多不超过剩余金额平均数的二倍。应该越发越少。
*/
public class Demo12Redpackage {

    public static void main(String[] args) {
        //设置程序标题
        MyRed myRed = new MyRed("红包案例");

        //设置群主名称
        myRed.setOwnerName("王思聪");

        //设置分发策略
        OpenMode normal = new NormalMode(); //普通红包
        myRed.setOpenWay(normal);

        /*OpenMode random = new RandomMode();
        myRed.setOpenWay(random);*/
    }
}
