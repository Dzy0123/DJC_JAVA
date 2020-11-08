package djc.day22;

import java.io.Serializable;

/*
序列化和反序列化的对象类必须实现Serializable接口
*/
public class Person implements Serializable { //序列化和反序列化对象类
    private static final long serialVersionUID = 1L; //固定序列号
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
