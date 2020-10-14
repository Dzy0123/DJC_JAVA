package djc.day12;

import djc.day12.red.OpenMode;
import djc.day12.red.RedPacketFrame;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        //随机分配，最少一分钱，最多不超过剩余金额平均数的二倍
        //第一次发红包，随机范围是0.01元~6.66元
        //第一次发完以后，剩下的至少是3.34元
        //此时还需要再发两个红包
        //此时的随机范围是0.01元~.3.34元（取不到右边，剩下0.01）

        //公式：1+random.nextInt(leftMoney / leftCount * 2);
        Random r = new Random();

        int leftMoney = totalMoney; //剩下金额
        int leftCount = totalCount; //剩下份数

        for (int i = 0; i < totalCount - 1; i++) {
            //随机发钱n-1个
            int money = r.nextInt(leftMoney / leftCount) + 1;
            list.add(money); //将第一个随机红包放入集合
            leftMoney -= money; //剩下金额越发越少
            leftCount--; //剩下份数递减
        }
        //最后一个红包不需要随机，直接放进去
        list.add(leftMoney);

        return list;
    }
}
