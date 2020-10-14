package djc.day12;

/*
 * 如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
 * “局部”：只有当前所述的方法才能使用它，出了这个方法外面就不能用了*/
public class OutTwo { //外部类

    public void methodOuter() { //外部类方法
        class Inner { //局部内部类
            int num = 10;

            public void methodInner() { //局部内部类方法
                System.out.println("局部变量："+num); //10
            }
        }

        //创建局部内部类对象
        Inner inner = new Inner();
        inner.methodInner();
    }
}
