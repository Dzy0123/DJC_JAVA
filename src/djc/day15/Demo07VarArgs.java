package djc.day15;

/*
    使用格式：
*   修饰符 返回值类型 方法名(数据类型...变量名){ }
*/
public class Demo07VarArgs { //可变参数

    public static void main(String[] args) {
        sum(); //[I@135fbaa4，底层是一个数组
        System.out.println(sum());
        System.out.println("=============");

        sum(10, 20, 30);
        System.out.println(sum(10, 20, 30));
    }

    //定义一个方法，计算0~n个int类型整数的和
    public static int sum(int... array) {
        System.out.println(array);
        //定义一个初始化变量，记录累加求和
        int sum = 0;
        //遍历数组，获取数组中的每一个元素
        for (int i : array) {
            sum += i;
        }
        //返回求和结果
        return sum;
    }

    //可变参数的特殊写法
    public static void method(Object... obj) {

    }
}
