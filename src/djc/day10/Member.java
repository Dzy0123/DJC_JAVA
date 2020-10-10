package djc.day10;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User { //成员类

    public Member() {
    }

    public Member(String name, double balance) {
        super(name, balance);
    }

    public void accept(ArrayList<Integer> list) { //收红包加余额

        //从多个红包中随便拿一个
        int index = new Random().nextInt(list.size());

        // 根据索引从集合当中删除那个被自己得到的红包
        double get = list.remove(index);

        //成员自己本来有多少钱
        double balance = super.getBalance();

        //收钱之后的余额
        super.setBalance(balance + get);
    }
}
