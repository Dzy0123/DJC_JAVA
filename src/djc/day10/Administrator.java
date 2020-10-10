package djc.day10;

import java.util.ArrayList;

public class Administrator extends User { //群主类

    public Administrator() {
        //super();
    }

    public Administrator(String name, double balance) {
        super(name, balance);
    }

    public ArrayList<Integer> send(int totalMoney, int count) { //totalMoney是红包总金额，count是红包份数

        //首先需要一个集合来存储若干个红包
        ArrayList<Integer> redlist = new ArrayList<>();

        //群主当前余额
        double balance = super.getBalance();

        //判断余额够不够发红包
        if (totalMoney > balance) {
            System.out.println("余额不足");
            return redlist;
        }
        //扣钱，就是重新设置余额
        super.setBalance(balance - totalMoney);

        //均分后的红包添加进数组
        for (int i = 0; i < count; i++) {
            redlist.add(totalMoney / count);
        }
        return redlist;
    }
}
