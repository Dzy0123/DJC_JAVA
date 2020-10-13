package djc.day12;

public class Demo02AnimalUse { //对象转型调用

    public static void main(String[] args) {
        //对象的向上转型
        Animal animal = new Cat();
        animal.eat();

        //对象的向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //错误
        //Dog dog = (Dog)animal; //编译不会报错，运行会出现类转换异常

    }
}
