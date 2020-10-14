package djc.day12;
/*
* 局部内部类如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】*/
public class MyOuter { //局部内部类的final问题

    public void methodOuter(){
        /*final*/int num = 10; //外部类方法的局部变量
        //num = 20; //错误写法
        class MyInner {
            public void methodInner(){
                System.out.println(num); //局部内部类方法访问外部类方法的局部变量
            }
        }
    }
}
