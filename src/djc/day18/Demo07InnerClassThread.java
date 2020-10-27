package djc.day18;

public class Demo07InnerClassThread { //匿名内部类创建线程

    public static void main(String[] args) {
        //实现继承父类的方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }.start();

        //实现接口的方式
        /*Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        };
        new Thread(r).start();*/
        //简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }).start();

    }
}
