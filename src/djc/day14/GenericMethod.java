package djc.day14;

public class GenericMethod { //含有泛型的方法

    //定义一个含有泛型的方法
    public <E> void method01(E e) {
        System.out.println(e);
    }

    //定义一个含有泛型的静态方法
    public static <E> void method02(E e) {
        System.out.println(e);
    }
}
