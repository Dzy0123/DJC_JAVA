package djc.day19;

import java.util.ArrayList;

public class Demo08ArrayList {
    public static void main(String[] args) {
        //JDK1.7版本之前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();
        //JDK1.7版本之后，等号后的泛型可以省略，后边的泛型可以根据前边的泛型推导出来
        ArrayList<String> list02 = new ArrayList<>();

        //使用实现类对象创建多线程
        new Thread(new RunnableImpl()).start();

        //使用匿名内部类创建多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建了新线程");
            }
        }).start();

        //使用Lambda实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "创建了新线程");
        }).start();

        //Lambda省略格式
        new Thread(() ->
                System.out.println(Thread.currentThread().getName() + "创建了新线程")
        ).start();
    }
}
