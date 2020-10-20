package djc.day14;

public class Generic<E> { //自定义泛型
    private E name;

    public Generic(E name) {
        this.name = name;
    }

    public Generic() {

    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
