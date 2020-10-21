package djc.day15;

public class Demo04HashCode { //哈希值

    public static void main(String[] args) {
        //Person类继承了Object类所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1); //325040804

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2); //1173230247

        //String类的哈希值
        //String类重写了hashCode方法
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1.hashCode()); //96354
        System.out.println(str2.hashCode()); //96354

        System.out.println("重地".hashCode()); //1179395
        System.out.println("通话".hashCode()); //1179395
    }
}
