package djc.day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04GenericClass { //自定义泛型测试

    public static void main(String[] args) {
        //int
        Generic<Integer> generic1 = new Generic<>();
        generic1.setName(23);
        System.out.println(generic1.getName());
        System.out.println("===========");

        //String
        Generic<String> generic2 = new Generic<>();
        generic2.setName("dzy");
        System.out.println(generic2.getName());
        System.out.println("============");

        //含有泛型的方法的调用
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.method01("abc");
        genericMethod.method01('a');
        genericMethod.method01(1);
        genericMethod.method01(10.5);
        genericMethod.method01(true);
        System.out.println("---------------");

        //含有泛型的静态方法的调用
        //静态方法通过类名.方法名直接使用
        GenericMethod.method02('a');
        GenericMethod.method02("abc");
        GenericMethod.method02(1);
        GenericMethod.method02(6.6);
        GenericMethod.method02(false);
        System.out.println("===============");

        //第一种含有泛型的接口调用
        //创建含有泛型的接口的实现类对象
        GenericInterfaceImpl1 gm1 = new GenericInterfaceImpl1();
        gm1.method("dzy");
        System.out.println("===============");

        //第二种含有泛型的接口调用
        //创建含有泛型的接口的实现类对象
        GenericInterfaceImpl2<String> gm2 = new GenericInterfaceImpl2<>();
        gm2.method("wll");
        System.out.println("===============");

        //泛型的通配符使用
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");

        show1(list1);
        show1(list2);
        System.out.println("--------------");

        //泛型通配符的高级使用——受限泛型
        Collection<Integer> list3 = new ArrayList<>();
        Collection<String> list4 = new ArrayList<>();
        Collection<Number> list5 = new ArrayList<>();
        Collection<Object> list6 = new ArrayList<>();

        show2(list3); //Integer是Number的子类
        //show2(list4); //报错
        show2(list5); //Number本身
        //show2(list6); //报错

        //show3(list3); //报错
        //show3(list4); //报错
        show3(list5); //Number本身
        show3(list6); //Object是Number的父类

    }

    //定义一个方法，能遍历所有类型的ArrayList集合
    //不知道ArrayList集合使用什么类型的数据，可以使用泛型通配符
    public static void show1(ArrayList<?> list) {
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator(); //多态
        while (it.hasNext()) {
            //it.next()方法，取出的元素是Object，可以接受任意的数据类型
            System.out.println(it.next());
        }
    }

    //泛型的上限：此时的泛型?必须是Number的子类或本身
    public static void show2(Collection<? extends Number> coll) {
    }

    //泛型的上限：此时的泛型?必须是Number的父类或本身
    public static void show3(Collection<? super Number> coll) {
    }
}
