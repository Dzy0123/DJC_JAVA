package djc.day13;

public class Demo08System { //System类

    public static void main(String[] args) {

        //currentTimeMillis方法
        System.out.println(System.currentTimeMillis()); //1602916271579
        System.out.println("==============");

        demo01();
        System.out.println("==============");

        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        demo02(src, dest);
    }

    //验证程序效率
    //验证for循环打印数字1-9999所需要使用时间(毫秒)
    public static void demo01() {
        //程序执行前，获取一次毫秒值
        long begin = System.currentTimeMillis();

        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }
        //程序执行后，获取一次毫秒值
        long end = System.currentTimeMillis();

        //验证for循环打印数字1-9999所需要使用时间(毫秒)
        System.out.println("程序共耗时：" + (end - begin) + "毫秒"); //程序共耗时：115毫秒
    }

    //练习
    /*将src数组中前3个元素，复制到dest数组的前3个位置上复制元素前：
    * src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
    * 复制后：
    * src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
    * src：源数组
      srcPos：源数组中的起始位置
      dest：目标数组
      destPos：目标数组中的起始位置
      length：要复制的数组元素的数量*/
    public static void demo02(int[] src, int[] dest) {
        System.arraycopy(src, 0, dest, 0, 3);

        System.out.println("复制后源数组src为：");
        for (int i = 0; i < src.length; i++) {
            System.out.print(src[i]);
        }
        System.out.println();

        System.out.println("复制后目标数组dest为：");
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i]);
        }
    }

}
