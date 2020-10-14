package djc.day12;

import djc.day12.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode { //平均分红包
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount; //平均值
        int mod = totalMoney % totalCount; //余数（零头）

        //totalCount-1代表最后一个余数先留着
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }

        //零头需要放在最后一个红包当中
        list.add(avg + mod);

        return list;
    }
}
