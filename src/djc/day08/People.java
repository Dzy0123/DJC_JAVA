package djc.day08;
/*
* 定义一个数组，用来存储三个People对象
*
* 数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
*/
public class People {

    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
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
}
