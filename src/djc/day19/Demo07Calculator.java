package djc.day19;

/*带参数带返回值的Lambda表达式练习：
  给定一个计算器Calculator接口；
  内含抽象方法calc可以将两个int数字相加得到和值

  创建一个invokeCook方法，调用方法完成 120+130
*/
public class Demo07Calculator {
    public static void main(String[] args) {
        /*//匿名内部类
        invokeCook(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });*/

        //Lambda表达式简化匿名内部类
        invokeCook(120, 130, (int a, int b) -> {
            return a + b;
        });

        //省略格式
        invokeCook(120, 130, (int a, int b) -> a + b);
    }

    //创建invokeCook方法
    public static void invokeCook(int a, int b, Calculator ca) {
        System.out.println(ca.calc(a, b));
    }
}
