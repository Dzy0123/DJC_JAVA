package djc.day13;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //直接打印对象的地址值没有意义，需要覆盖重写Object类中的toString方法来打印对象的属性（name，age）

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public boolean equals(Object obj){
        //增加一个判断，防止类型转换异常
        if(obj instanceof Person){
            //向下转型，把obj转为Person类型
            Person p = (Person)obj;
            //比较两个对象的属性，一个是对象this(p1)，一个是对象p(obj -> p2)
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        //增加一个判断，传递的参数obj如果为null，直接返回false
        if(obj == null){
            return false;
        }
        //增加一个判断，传递的参数obj如果为this本身，直接返回true
        if(obj == this){
            return true;
        }
        return false; //不是Person类型就返回false
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass()使用反射技术，判断o是否是Person类型
        //等效于 obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
