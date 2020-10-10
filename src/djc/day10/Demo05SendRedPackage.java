package djc.day10;

import java.util.ArrayList;

/*
 * 发红包案例：
 * 群主发普通红包。某群有多名成员，群主给成员发普通红包。
 * 普通红包规则：
 *   1：群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。
 *   2：成员领取红包后，保存到成员余额当中。
 * 根据描述，完成案例中所有类的定义以及指定类之间的继承关系，并完成发红包的操作。
 */
public class Demo05SendRedPackage { //执行类

    public static void main(String[] args) {

        //群主当前余额
        Administrator administrator = new Administrator("群主", 100);
        administrator.show();
        double money = administrator.getBalance(); //原始余额
        System.out.println("===========");

        //群主发红包
        ArrayList<Integer> redlist = administrator.send(66, 5);
        System.out.println("群主发了：" + (money - administrator.getBalance()) + "元的红包");
        System.out.println("===========");

        //创建成员对象，接收红包并显示余额
        for (int i = 0; i < 5; i++) {
            Member memberi = new Member("群员" + i, 0);
            memberi.accept(redlist);
            memberi.show();
        }
        System.out.println("===========");

        //群主剩余余额
        administrator.show();
    }
}
