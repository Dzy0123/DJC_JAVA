package djc.day12;

/*
 * 如何知道一个父类对象引用的对象，本来是什么子类？*/
public class Demo03Instanceof { //判断一个父类引用的对象本来是什么子类

    public static void main(String[] args) {
        Animal animal = new Cat(); //本来是一只猫
        animal.eat(); //猫吃鱼
        System.out.println("=============");

        //如果希望调用子类特有方法。需要向下转型
        if (animal instanceof Dog) { //判断一下父类引用animal本来是不是Dog
            Dog dog = (Dog) animal; //向下转型
            dog.watchHouse(); //狗看家
            System.out.println("=============");
        }

        if (animal instanceof Cat) { //判断一下父类引用animal本来是不是Cat
            Cat cat = (Cat) animal; //向下转型
            cat.catchMouse(); //猫抓老鼠
            System.out.println("=============");
        }

        giveMePet(new Dog()); //给我一条狗
    }

    public static void giveMePet(Animal animal) { //随便给我一个动物
        if (animal instanceof Dog) { //判断一下父类引用animal本来是不是Dog
            Dog dog = (Dog) animal; //向下转型
            dog.watchHouse(); //狗看家
        }

        if (animal instanceof Cat) { //判断一下父类引用animal本来是不是Cat
            Cat cat = (Cat) animal; //向下转型
            cat.catchMouse(); //猫抓老鼠
        }
    }
}
