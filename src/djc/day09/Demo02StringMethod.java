package djc.day09;

public class Demo02StringMethod { //字符串常用方法
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        //boolean equals()比较字符串内容
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //true
        System.out.println(str2.equals(str3)); //true
        System.out.println(str3.equals("abc")); //true
        System.out.println("abc".equals(str1)); //true
        System.out.println("Abc".equals(str1)); //false
        System.out.println("=============");

        //boolean equalsIgnoreCase()忽略英文大小写比较字符串内容
        String str4 = "ABC";
        String str5 = "AbC";
        System.out.println(str1.equalsIgnoreCase(str4)); //true
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str5)); //true
        System.out.println(str4.equalsIgnoreCase(str5)); //true
        System.out.println("===================");

        //int length()获取字符串长度
        String str6 = "abc.def";
        System.out.println("字符串长度为：" + str6.length());
        System.out.println("=================");

        //String concat(String str)拼接字符串
        String str7 = "Hello";
        String str8 = "World";
        String str9 = str7.concat(str8);
        System.out.println(str7); //Hello
        System.out.println(str8); //World
        System.out.println(str9); //HelloWorld
        System.out.println("=================");

        //char charAt(int index)获取指定位置的单个字符
        System.out.println("str7字符串中第1号字符是：" + str7.charAt(1)); //e
        System.out.println("str9字符串中第5号字符是：" + str9.charAt(5)); //W
        System.out.println("===============");

        //int indexOf(String str)查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1值
        System.out.println("str7字符串中字符“e”第一次出现是第" + str7.indexOf("e") + "号索引值"); //1
        System.out.println("str9字符串中字符“W”第一次出现是第" + str9.indexOf("W") + "号索引值"); //5
        System.out.println("str9字符串中字符“Wor”第一次出现是第" + str9.indexOf("Wor") + "号索引值"); //5
        System.out.println("str9字符串中字符“Wrl”第一次出现是第" + str9.indexOf("Wrl") + "号索引值"); //-1
        System.out.println("str9字符串中字符“F”第一次出现是第" + str9.indexOf("F") + "号索引值"); //-1
        System.out.println("===================");

        //String substring(int index)截取从参数位置一直到字符串末尾，返回新的字符串
        String str10 = str9.substring(3); //"Hel"前三位字符不截取，从第四位也就是第三号开始
        System.out.println(str9); //HelloWorld
        System.out.println(str10); //loWorld
        System.out.println("===============");

        //String substring(int begin,int end)截取从begin到end之间的字符串，左闭右开区间
        String str11 = str9.substring(3, 6); //截取第三号到第五号
        System.out.println(str9); //HelloWorld
        System.out.println(str11); //loW
        System.out.println("=================");

        //char[] toCharArray()将字符串拆分成为字符数组作为返回值
        char[] chars1 = str9.toCharArray();
        System.out.println("字符串str9拆分的字符数组的遍历为：");
        for (int i = 0; i < chars1.length; i++) {
            System.out.println(chars1[i]);
        }
        System.out.println("=================");

        //byte[] getBytes()获得当前字符串底层的字节数组
        byte[] bytes1 = str9.getBytes();
        System.out.println("字符串str9对应的字节数组的遍历为：");
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }
        System.out.println("=================");

        //String replace(CharSequence oldString, CharSequence newString)
        //将所有出现的老字符串替换成为新的字符串，返回替换后的新的字符串
        String str12 = str9.replace("Hello", "你好");
        System.out.println("原字符串为：" + str9); //HelloWorld
        System.out.println("替换后的字符串为：" + str12); //你好World
        System.out.println("=================");

        //String[] split(String regex)按照参数的规则将字符串切分成为若干部分
        String[] str13 = str9.split("o"); //把每个"o"当做切分点
        System.out.println("原字符串str9为：HelloWorld");
        System.out.print("切分后的字符串数组为：");
        for (int i = 0; i < str13.length; i++) {
            System.out.print(str13[i]);
        }
        System.out.println();
        System.out.println("---------------");

        String[] str14 = str6.split("."); //切分失败
        for (int i = 0; i < str14.length; i++) {
            System.out.println(str14[i]);
        }
        System.out.println("---------------");

        String[] str15 = str6.split("\\."); //adc;def
        System.out.println("原字符串str6为：abc.def");
        System.out.println("切分后的字符串遍历为：");
        for (int i = 0; i < str15.length; i++) {
            System.out.print(str15[i]);
        }
        System.out.println();
        System.out.println("===================");
    }
}
