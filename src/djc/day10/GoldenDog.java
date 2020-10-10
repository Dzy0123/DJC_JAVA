package djc.day10;

public class GoldenDog extends Dog { //抽象子类Dog的子类GoldenDog

    //eat方法已经在eat里面覆盖重写过了
    @Override
    public void sleep() {
        System.out.println("蜷着睡");
    }
}
