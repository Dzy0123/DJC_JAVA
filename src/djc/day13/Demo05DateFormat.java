package djc.day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo05DateFormat { //日期类成员方法Date

    public static void main(String[] args) throws ParseException {
        demo01();
        System.out.println("==============");

        demo02();
    }

    /*使用DateFormat中的方法format把日期格式化为文本
    使用步骤：
        1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定模式把Data日期格式化为符合模式的字符串
    */
    private static void demo01() { //格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(sdf.format(date)); //2020-10-15 13:39:37
    }

    /*使用DateFormat中的方法parse，把文本解析为日期
      使用步骤：
        1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        2.调用SimpleDateFormat对象中的方法parse，把符合构造方法模式的字符串解析为Date日期。
        注意：
            public Date parse(String source) throws ParseException
            parse方法声明了异常为解析异常；
            如果字符串和构造方法的模式不一样，那么程序就会抛出异常；
            调用了一个抛出异常的方法，就必须处理这个异常；
            要么throws继续跑出这个异常，要么try catch自己处理
    */
    public static void demo02() throws ParseException { //解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-10-15 13:39:37");
        System.out.println(date);
    }
}
