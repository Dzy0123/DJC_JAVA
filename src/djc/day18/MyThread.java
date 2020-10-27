package djc.day18;

public class MyThread extends Thread { //创建一个Thread类的子类
    //在Thread类的子类中重写Thread类的run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }


}
