package djc.day17;

import java.util.ArrayList;
import java.util.List;

public class Demo06MultipleException { //多个异常使用捕获处理的三种方式

    public static void main(String[] args) {
        //多个异常分别处理
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); //ArrayIndexOutOfBoundsException: 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3)); //IndexOutOfBoundsException: Index: 3, Size: 3
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("后续代码");
        System.out.println("=================");

        //多个异常,一次捕获，多次处理
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); //ArrayIndexOutOfBoundsException: 3

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3)); //IndexOutOfBoundsException: Index: 3, Size: 3
        } catch (ArrayIndexOutOfBoundsException e) { //异常出现子父类关系，子类异常必须写在上面
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) { //异常出现子父类关系，父类异常必须写在下面
            System.out.println(e);
        }
        System.out.println("后续代码");
        System.out.println("=================");

        //多个异常,一次捕获，一次处理
        try {
            int[] arr = {1, 2, 4};
            System.out.println(arr[3]); //ArrayIndexOutOfBoundsException: 3

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3)); //IndexOutOfBoundsException: Index: 3, Size: 3
        } catch (Exception e) { //异常出现子父类关系，子类异常必须写在上面
            System.out.println(e);
        }
        System.out.println("后续代码");
    }
}
