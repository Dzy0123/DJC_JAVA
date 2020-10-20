package djc.day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*
 * 集合综合案例：斗地主
 * 按照斗地主的规则，完成发牌洗牌的动作
 * 具体规则：
 *   使用54张牌打乱顺序，三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌
 * 分析：
 *   准备牌：
 *       牌可以设计成一个ArrayList<String>，每个字符串为一张牌
 *       每张牌由数字花色两部分组成，使用花色集合与数字集合嵌套迭代完成每张牌的组装
 *       牌由Collection类的shuffle方法进行随机排序
 *   发牌：
 *       将每个人的底牌设计为ArrayList<String>，将最后三张牌直接存放于底牌，剩余牌通过对3取模依次发牌
 *   看牌：
 *       直接打印每个集合
 */
public class Demo05LandlordsTest { //斗地主

    public static void main(String[] args) {
        //创建一副牌
        ArrayList<String> card = new ArrayList<>();
        prepare(card);

    }

    public static void prepare(ArrayList<String> card) {

        //花色
        String[] color = {"♠", "♥", "♦", "♣"};
        //大小
        String[] numbers = {"A", "J", "Q", "K", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        //嵌套循环遍历
        for (String number : numbers) {
            for (String c : color) {
                card.add(c + number);
            }
        }

        //大小王
        card.add("Joker"); //大王
        card.add("joker"); //小王

        //洗牌
        Collections.shuffle(card);

        System.out.println(card);

        //创建玩家和底牌
        ArrayList<String> list1 = new ArrayList<>(); //玩家1手牌
        ArrayList<String> list2 = new ArrayList<>(); //玩家2手牌
        ArrayList<String> list3 = new ArrayList<>(); //玩家3手牌
        ArrayList<String> list4 = new ArrayList<>(); //底牌

        //把最后三张放入底牌
        for (int i = 51; i < 54; i++) {
            list4.add(card.get(i));
        }

        for (int i = 0; i < 51; i++) {
            if (i % 3 == 0) {
                list1.add(card.get(i));
            } else if (i % 3 == 1) {
                list2.add(card.get(i));
            } else if (i % 3 == 2) {
                list3.add(card.get(i));
            }
        }

        System.out.println("周润发" + list1);
        System.out.println("刘德华" + list2);
        System.out.println("周星驰" + list3);
        System.out.println("底牌" + list4);
    }
}
