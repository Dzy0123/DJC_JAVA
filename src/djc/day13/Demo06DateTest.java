package djc.day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//计算一个人已经出生了多少天
public class Demo06DateTest {

    public static void main(String[] args) throws ParseException {
        show();
    }

    public static void show() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期，格式为：yyyy-MM-dd");
        String birthday = sc.next();

        //把字符串解析为日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(birthday);

        //把出生日期转换为毫秒值
        long time1 = parse.getTime();
        //把当前天数转换为毫秒值
        long time2 = new Date().getTime();

        //毫秒转换为天数，1天 = 24*60*60 = 86400秒 = 86400000毫秒
        long day = (time2 - time1) / 86400000;
        System.out.println("你已经出生了" + day + "天");
    }
}
