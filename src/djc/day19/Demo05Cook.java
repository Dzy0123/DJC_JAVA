package djc.day19;

/*给定一个厨子Cook接口，内含唯一抽象方法makeFood，无参无返回值；
 * 使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”*/
public class Demo05Cook {
    public static void main(String[] args) {
        //使用匿名内部类调用invokeCook方法
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！");
            }
        });
        System.out.println("============");

        //使用Lambda
        invokeCook(() -> {
            System.out.println("吃饭啦！");
        });

        //省略格式
        invokeCook(() -> System.out.println("吃饭啦！"));
    }

    //定义一个invokeCook方法,参数传递Cook接口，方法调用Cook接口内部抽象方法makeCook
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
