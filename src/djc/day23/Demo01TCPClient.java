package djc.day23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo01TCPClient { //TCP通信客户端
    public static void main(String[] args) throws IOException {
        //创建一个客户端对象Socket，构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);

        //使用Socket对象中的方法getOutputStream()，获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();

        //使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据
        os.write("你好".getBytes());

        //使用Socket对象中的方法getInputStream()，获取网络字节输入流对象InputStream对象
        InputStream is = socket.getInputStream();

        //使用网络字节输入流InputStream对象中方法read，读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        //释放资源
        socket.close();
    }
}
