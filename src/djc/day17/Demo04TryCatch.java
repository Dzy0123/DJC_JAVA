package djc.day17;

import java.io.IOException;

public class Demo04TryCatch { //try...catch方法捕获异常

    public static void main(String[] args) {
        /*
          文件后缀名正确，读取文件
          后续代码
        */
        try {
            readFile("c:\\\\a.txt");
        } catch (IOException e) {
            System.out.println("文件后缀名不正确");
        }
        System.out.println("后续代码");
        System.out.println("============");

        /*
          文件后缀名不正确
          后续代码
        */
        try {
            readFile("c:\\\\a.text");
        } catch (IOException e) {
            //System.out.println("文件后缀名不正确");

            //Throwable的三种方法
            System.out.println(e.getMessage()); //文件后缀名不正确
            System.out.println(e.toString()); //java.io.IOException: 文件后缀名不正确
            System.out.println(e); //java.io.IOException: 文件后缀名不正确,和toString是一样的
            /*
              java.io.IOException: 文件后缀名不正确
           	  at djc.day17.Demo04TryCatch.readFile(Demo04TryCatch.java:47)
	          at djc.day17.Demo04TryCatch.main(Demo04TryCatch.java:25)
            */
            e.printStackTrace(); //最全面
        }
        System.out.println("后续代码");


    }

    /*
     * 如果传递的路径，不是.txt结尾，
     * 那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
     */
    public static void readFile(String fileName) throws IOException {

        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名不正确");
        }
        System.out.println("文件后缀名正确，读取文件");
    }
}
