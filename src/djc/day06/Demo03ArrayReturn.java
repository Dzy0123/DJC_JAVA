package djc.day06;
/*
* 一个方法可以有多个参数，但只能有一个返回值。
* 如果希望一个方法中产生了多个结果数据进行返回，使用一个数组作为返回值即可。
* 数组作为方法的参数，传递进去的其实就是数组的地址值；
* 数组作为方法的返回值，返回的也就是数组的地址值。
* */
public class Demo03ArrayReturn { //数组作为方法返回值
    public static void main(String[] args) {
        int[] result = calculate(30,50);
        System.out.println(result[0]); //sum80
        System.out.println(result[1]); //avg40
    }
    public static int[] calculate(int a,int b){
        int sum = a + b;
        int avg = sum / 2;
        int[] array = {sum,avg};
        return array;
    }
}
