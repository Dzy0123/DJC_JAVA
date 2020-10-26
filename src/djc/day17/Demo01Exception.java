package djc.day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {

    public static void main(String[] args) {
        //Exception：编译期异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse("2012.08.20");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println(e); //java.text.ParseException: Unparseable date: "2012.08.20"
        }
        System.out.println("代码继续");
        System.out.println("==================");

        //RuntimeException，运行期异常，java程序运行过程中出现的问题
        int[] arr = {1, 2, 3};
        try {
            //可能异常的代码
            System.out.println(arr[3]);
        } catch (Exception e) {
            //异常的处理逻辑
            System.out.println(e); //java.lang.ArrayIndexOutOfBoundsException: 3
        }
        System.out.println("代码继续");
        System.out.println("=============");

        /*
        Error：错误
        OutOfMemoryError: Java heap space
        内存溢出的错误，创建的数组太大了，超出了给JVM分配的内存
        */
        int[] array = new int[1024 * 1024 * 1024];
    }
}
