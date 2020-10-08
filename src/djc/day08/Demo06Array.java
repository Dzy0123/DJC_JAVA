package djc.day08;

public class Demo06Array { //对象数组
    public static void main(String[] args) {

        People[] array = new People[3];
        System.out.println(array[0]); //null
        System.out.println("=============");

        People one = new People("dzy",21);
        People two = new People("wll",21);
        People three = new People("lxr",20);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]); //地址值
            System.out.println(array[i].getName()); //name
        }

    }
}
