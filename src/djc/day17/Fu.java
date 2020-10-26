package djc.day17;

/*
 * 父类异常什么样，子类异常就什么样
 */
public class Fu { //子父类异常
    //一个空指针异常，一个类型转换异常
    public void show01() throws NullPointerException, ClassCastException {
    }

    //一个数组越界异常
    public void show02() throws IndexOutOfBoundsException {
    }

    public void show03() throws IndexOutOfBoundsException {
    }

    public void show04() {
    }
}

class Zi extends Fu {
    //子类重写父类方法时，抛出和父类相同的异常
    @Override
    public void show01() throws NullPointerException, ClassCastException {
    }

    //子类重写父类方法时，抛出父类异常的子类
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
    }

    //子类重写父类方法时，不抛出异常
    public void show03() {
    }

    //父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常
    // 此时子类产生异常，只能捕获处理，不能声明抛出。
    public void show04() {
        try {
            throw new Exception("编译器异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
