package djc.day10;

public class Teacher extends Employe { //定义一个子类，讲师类

    int num2 = 20;

    int num = 200; //子类成员变量

    public void methodTeacher() {
        System.out.println("子类方法" + num);
    }
}
