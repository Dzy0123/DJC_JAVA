package djc.day06;

public class Demo02ArrayUse {
    public static void main(String[] args) {
        //静态初始化一个数组
        int[] array1 = {10, 20, 30};
        System.out.println(array1); //[I@135fbaa4
        System.out.println(array1[0]); //10
        System.out.println(array1[1]); //20
        System.out.println(array1[2]); //30
        System.out.println("===============");

        //将数组中的单个元素赋值给变量
        int num = array1[1];
        System.out.println(num); //20
        System.out.println("===============");

        //动态初始化
        int[] array2 = new int[3];
        System.out.println(array2[0]); //0
        array2[0] = 13;
        System.out.println(array2[0]); //13
        System.out.println("===============");

        int[] array3 = array1; //将array1数组的地址值，赋值给array3数组
        System.out.println(array3[0]); //10
        array3[0] = 60;
        System.out.println(array1[0]); //60
        System.out.println("===============");

        //数组长度获取
        int[] array4 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println("数组长度是" + array4.length); //获取数组长度
        System.out.println("================");

        //数组的遍历输出
        //数组名称.fori就可以了   array4.fori
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
        System.out.println("==============");

        //求数组中的最值
        int[] array5 = {10, 65, 21, 56, 32, 45, 87, 3, 36, 99};
        int max = array5[0];
        int min = 0;
        for (int i = 1; i < array5.length; i++) {
            if (array5[i] > array5[0]) { //array[i] > max; max = array[i]
                array5[0] = array5[i];
                max = array5[0];
            } else if (array5[i] < array5[0]) { //array[i] < min; min = array[i]
                array5[0] = array5[i];
                min = array5[0];
            }
        }
        System.out.println("数组最大值为" + max);
        System.out.println("数组最小值为" + min);
        System.out.println("===================");

        //数组元素反转
        int[] array6 = {20, 60, 32, 56, 0, 66, 4, 51, 5, 45};
        int a = 1;
        for (int i = 0, j = array6.length - 1; i < j ; i++,j--) {
            a = array6[i];
            array6[i] = array6[j];
            array6[j] = a;
        }
        for (int i = 0; i < array6.length; i++) {
            System.out.println(array6[i]);
        }
        System.out.println("==================");


    }
}
