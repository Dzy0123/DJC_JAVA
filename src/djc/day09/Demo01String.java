package djc.day09;

public class Demo01String { //字符串

    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println(str1); //无内容
        System.out.println("==============");

        //根据字符数组进行创建字符串
        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println(str2); //abc
        System.out.println("==============");

        char[] charArray2 = {'a', 'b', 'c'};
        String str7 = new String(charArray2);
        System.out.println(str7); //abc
        System.out.println("==============");

        //根据字节数组进行创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println(str3); //abc
        System.out.println("==============");

        //直接创建
        String str4 = "dzy";
        System.out.println(str4); //dzy
        System.out.println("===============");

        //常量池
        String str5 = "abc"; //直接写上的双引号字符串，保存在字符串常量池中
        String str6 = "abc";
        /*
         * 对于基本类型来说，==是进行数值的比较；
         * 对于引用类型来说，==是进行地址值的比较
         */
        System.out.println(str5 == str6); //true
        System.out.println(str5 == str2); //false
        System.out.println(str6 == str2); //false
        System.out.println(str5 == charArray.toString()); //false
        System.out.println("=================");

        System.out.println(str2 == str7); //false
        System.out.println(str2.equals(str7)); //true
        System.out.println(str3.equals(str7)); //true
    }
}
