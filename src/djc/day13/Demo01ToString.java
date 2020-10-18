package djc.day13;

public class Demo01ToString { //Object类的toString方法

    public static void main(String[] args) {
        /*
         * Person类默认继承了Object类，所以可以使用Object类中的toString方法
         */

        /*Person person = new Person("dzy",21);
        System.out.println(person.toString()); //地址值

        //直接打印对象的名字，其实就是调用对象的toString
        System.out.println(person); //地址值*/

        //重写toString方法后的打印
        System.out.println(new Person("dzy", 21)); //Person{name='dzy', age=21}
    }
}
