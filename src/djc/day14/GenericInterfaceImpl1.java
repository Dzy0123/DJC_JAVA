package djc.day14;

//第一种含有泛型的接口的实现类
//直接指定接口的泛型
public class GenericInterfaceImpl1 implements GenericInterface<String> {

    @Override
    public void method(String str) {
        System.out.println(str);
    }
}
