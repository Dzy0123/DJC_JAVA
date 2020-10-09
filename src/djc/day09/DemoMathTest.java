package djc.day09;

import java.util.Arrays;

public class DemoMathTest {

    public static void main(String[] args) {

        //计算在-10.8到5.9之间，绝对值大于6 或者小于2.1的整数有多少个
        double min = -10.8;
        double max = 5.9;
        int num = 0;
        for (int i = (int)min; i < max; i++) { //变量i就是区间之内所有的整数
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1){
                num++;
            }
        }
        System.out.println("-10.8到5.9之间，绝对值大于6或者小于2.1的整数有"+num+"个");
    }
}
