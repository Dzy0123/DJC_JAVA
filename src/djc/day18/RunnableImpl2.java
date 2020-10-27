package djc.day18;

public class RunnableImpl2 implements Runnable { //Runnable接口的实现类
    //重写抽象run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("任务2-->" + i);
        }
    }
}
