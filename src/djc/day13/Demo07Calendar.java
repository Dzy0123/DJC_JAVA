package djc.day13;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.DATA_CONVERSION;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Demo07Calendar { //日历类

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance(); //多态写法
        System.out.println(date); //java.util.GregorianCalendar[time=1602911467084,...,DST_OFFSET=0]
        System.out.println("================");

        //public int get(int field)获取日期，没有set方法默认为当前日期
        System.out.println(date.get(Calendar.YEAR)); //2020
        System.out.println(date.get(Calendar.MONTH) + 1); //10，西方的月份0-11，东方是1-12
        System.out.println(date.get(Calendar.DATE)); //17
        System.out.println(date.get(Calendar.DAY_OF_MONTH)); //17
        System.out.println("=================");

        //public void set(int field, int value)设置日期
        date.set(Calendar.YEAR, 1999); //设置年为1999
        date.set(Calendar.MONTH, 01); //设置月为01
        date.set(Calendar.DATE, 23); //设置日为23
        System.out.print(date.get(Calendar.YEAR) + "."); //1999.
        System.out.print(date.get(Calendar.MONTH) + "."); //1.
        System.out.println(date.get(Calendar.DATE)); //23
        System.out.println("-------------------");
        //set方法重载，同时设置年月日
        date.set(1999, 06, 02);
        System.out.print(date.get(Calendar.YEAR) + "."); //1999.
        System.out.print(date.get(Calendar.MONTH) + "."); //6.
        System.out.println(date.get(Calendar.DATE)); //02

        //public abstract void add(int field, int amount)
        //为给定的日历字段加上或减去指定时间量
        date.add(Calendar.YEAR, 0); //给年加0年
        date.add(Calendar.MONTH, -5); //给月减5月
        date.add(Calendar.DATE, 21); //给天增加21天
        System.out.print(date.get(Calendar.YEAR) + "."); //1999.
        System.out.print(date.get(Calendar.MONTH) + "."); //1.
        System.out.println(date.get(Calendar.DATE)); //23
        System.out.println("==================");

        //public Data getTime()返回一个表示此Calendar时间值的Data对象
        //把日历对象Calendar转换为日期对象Date
        System.out.println(date.getTime()); //Tue Feb 23 14:15:17 GMT+08:00 1999
        //把日期对象Date转换为日期格式的字符串
        //注意，转换为日期对象Date时，月份会加一
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date.getTime())); //1999-02-23 14:17:40
    }
}
