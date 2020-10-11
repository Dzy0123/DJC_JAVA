package djc.day11;

public class Demo05Interface { //继承父类并实现多个接口

    public static void main(String[] args) {
        //创建子类对象
        Zi zi = new Zi();

        //父类方法和接口的默认方法冲突，优先实现父类方法
        zi.method(); //执行父类方法
    }
}
