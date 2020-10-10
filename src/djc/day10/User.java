package djc.day10;

public class User { //用户类

    private String name; //姓名
    private double balance; //余额

    public User() {
    }

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //
    public void show() { //显示余额
        System.out.println("我叫：" + name + ",我的余额为：" + balance);
    }
}
