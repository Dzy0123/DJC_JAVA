package djc.day10;

public class Demo04AbstractAnimal {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        System.out.println("=============");

        GoldenDog goldenDog = new GoldenDog(); //执行的是super()父类构造
        goldenDog.eat(); //执行的是抽象子类Dog中覆盖重写的eat方法
        goldenDog.sleep(); //执行的是子类GoldenDog中覆盖重写的sleep方法

    }
}
