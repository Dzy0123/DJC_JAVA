package djc.day10;

public class NewPhone extends Phone { //继承

    //新款手机
    @Override
    public void show() {
        super.show(); //把父类的show方法拿来重复利用
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
