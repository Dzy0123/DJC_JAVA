package djc.day23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo01TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8888);

        //使用ServerSocket对象中的方法accept，获取到请求的客户端对象Socket
        Socket socket = serverSocket.accept();

        //使用Socket对象中的方法getInputStream()，获取网络字节输入流对象InputStream对象
        InputStream is = socket.getInputStream();

        //使用网络字节输入流InputStream对象中方法read，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        //使用Socket对象中的方法getOutputStream()，获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();

        //使用网络字节输出流OutputStream对象中的方法write，给客户端回写数据
        os.write("收到谢谢".getBytes());

        //释放资源
        socket.close();
        serverSocket.close();
    }
}
