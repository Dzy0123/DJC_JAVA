package djc.day17;

public class Demo02Throw { //Throw关键字

    public static void main(String[] args) {
        /*int[] arr1 = null;
        int e1 = getElement(arr1,0);
        System.out.println(e1);*/
        System.out.println("==============");

        int[] arr2 = {1, 2, 3};
        int e2 = getElement(arr2, -1);
        System.out.println(e2);
    }

    /*
     *    定义一个方法，获取数组指定索引处的元素
     *    参数：
     *        int[] arr
     *        int index
     *    以后工作中，我们首先必须对方法传递进来的参数进行合法性校验；
     *    如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
     */
    public static int getElement(int[] arr, int index) {
        /*
         * 我们对传递过来的参数数组，进行合法性校验；
         * 如果数组arr的值是null，那么我们就跑出空指针异常；
         * 告知方法的调用者，传递的参数有问题。
         */
        if (arr == null) {
            throw new NullPointerException("传递的数组是null");
        }

        /*
         * 我们对传递过来的参数index进行合法性校验；
         * 如果index的范围不在数组的索引范围内，那么我们就抛出索引越界异常；
         * 告知方法的调用者，传递的索引超出了数组的范围
         */
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组的索引越界了");
        }
        int ele = arr[index];
        return ele;
    }
}
