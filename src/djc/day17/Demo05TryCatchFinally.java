package djc.day17;

import java.io.IOException;

public class Demo05TryCatchFinally { //finally代码块

    public static void main(String[] args) {
        try {
            //可能出现异常的代码
            readFile("c:\\\\a.text");
        } catch (IOException e) {
            //异常处理逻辑
            e.printStackTrace();
        } finally {
            //无论是否异常都会执行
            System.out.println("资源释放");
        }
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件名不正确");
        }

        System.out.println("文件路径正确");
    }
}
