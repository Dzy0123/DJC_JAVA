package djc.day13;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class Demo04Date { //日期类

    public static void main(String[] args) {

        //毫秒转换为日期，1天 = 24*60*60 = 86400秒 = 86400000毫秒
        //时间原点(0毫秒)：1970年1月1日00:00:00

        //获取当前系统一共到时间原点经历了多少毫秒
        System.out.println(System.currentTimeMillis()); //1602737229635
        System.out.println("=================");

        demo01();
        System.out.println("=================");

        demo02();
        System.out.println("=================");

    }

    private static void demo01() {
        Date date = new Date(); //空参构造方法
        System.out.println(date); //Thu Oct 15 12:44:39 GMT+08:00 2020
    }

    private static void demo02() {
        Date date = new Date(0L); //参数为毫秒值
        System.out.println(date); //Thu Jan 01 08:00:00 GMT+08:00 1970
        Date date2 = new Date(1602737229635L);
        System.out.println(date2); //Thu Oct 15 12:47:09 GMT+08:00 2020

        //日期转换为毫秒 long getTime()
        System.out.println(date2.getTime()); //1602737229635
    }
}
