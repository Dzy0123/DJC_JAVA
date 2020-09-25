package djc.day03;

public class Demo04Swtich { //选择语句
    public static void main(String[] args){
        int num1 = 6;
        System.out.println("一周中的第"+num1+"天是：");
        switch (num1){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周天");
                break;
            default:
                System.out.println("无效日期");
                break;

        }
    }
}
