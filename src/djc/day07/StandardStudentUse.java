package djc.day07;

public class StandardStudentUse {
    public static void main(String[] args) {
        StandardStudent sstu1 = new StandardStudent(); //无参
        sstu1.setName("佟丽娅");
        sstu1.setAge(22);
        System.out.println(sstu1.getName() + "今年" + sstu1.getAge() + "岁");
        System.out.println("==================");

        StandardStudent sstu2 = new StandardStudent("邓紫棋", 22); //全参
        System.out.println(sstu2.getName() + "今年" + sstu2.getAge() + "岁");
    }
}
