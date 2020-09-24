package djc.day02;

public class Demo03DataType {
    public static void main(String[] args){
        //自动数据类型转换（隐式）
        long num1 = 100; // int --> long，数据范围符合从小到大，数据类型自动转换
        System.out.println(num1); //100

        double num2 = 2.5F; //float --> double
        System.out.println(num2); //2.5

        float num3 = 30L; //long --> float
        System.out.println(num3);//30.0

        //强制数据类型转换
        int num4 = (int) 10000L; //long --> int，数据范围不是从小到大，强制转换
        System.out.println(num4);

        int num5 = (int) 6000000000L; //long强制转换称为int，long的数据值超过int数据范围，数据溢出
        System.out.println(num5); //1705032704

        int num6 = (int) 3.5F; //double强制转换成int，精度损失
        System.out.println(num6); //3

        char zifu1 = 'A'; //
        System.out.println(zifu1+1); //66，A被计算机转换成二进制，翻译为int 65

        byte num7 = 40;
        byte num8 = 50;
        // byte + byte --> int +int = int
        int result1 = num7 + num8;
        System.out.println(result1); //90

        short num9 = 60;
        //byte + short --> int +int = int --> short
        //int强制转换为short，必须保证逻辑上真实大小本来就没有超过short范围，否则就会数据溢出
        short result2 = (short) (num7 + num9);
        System.out.println(result2); //100

        /*ASCII码表：美国信息交换标准代码
        * Unicode码表：万国码。也是数字和符号的对照关系，开头0-127和部分和ASCII完全一样，但是从128开始包含更多的字符
        * 48-'0'
        * 65-'A'
        * 97-'a'*/
        char zifu2 = 'B';
        System.out.println(zifu2 + 0); //66

        char zifu3 = '1';
        System.out.println(zifu3 + 0); //49

        char zifu4 = '董';
        System.out.println(zifu4 + 0); //33891

    }
}
