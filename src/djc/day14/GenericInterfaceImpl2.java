package djc.day14;

//第二种含有泛型的接口的实现类
//接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
public class GenericInterfaceImpl2<E> implements GenericInterface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }


}
