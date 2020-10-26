package djc.day17;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo03Throws { //throws方法抛出异常

    //FileNotFoundException是IOException的子类
    public static void main(String[] args) throws /*FileNotFoundException ,*/IOException {
        readFile("c:\\\\a.text");
    }

    /*
     * 定义一个方法，对传递的文件路径进行合法性判断，
     * 如果路径不是"c:\\a.text"，那么我们就抛出文件找不到异常对象，告知方法的调用者
     */
    //FileNotFoundException是IOException的子类
    public static void readFile(String fileName) throws /*FileNotFoundException ,*/IOException {
        if (!fileName.equals("c:\\\\a.text")) {
            throw new FileNotFoundException("传递的文件路径不是:c:\\\\a.text");
        }
        /*
         * 如果传递的路径，不是.txt结尾，
         * 那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名正确");
        }
        System.out.println("路径正确，读取文件");
    }
}
