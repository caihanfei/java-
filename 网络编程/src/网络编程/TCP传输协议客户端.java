package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP传输协议客户端 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 定义一个tcp的客户端
		 * 发送一段数据给服务端，并读取服务端返回的信息
		 */
		System.out.println("客户端启动");
		// 1.创建tcp客户端对象，必须要有socket服务。客户端通常一建立，就需要去进行连接
		//因为这个面向连接的协议。所以必须明确要连接哪个主机，以及端口
		Socket s = new Socket("192.168.1.105",2568);
		// 2.连接一旦建立，就形成数据传输的通道，该通道就是IO流，此IO流是由socket建立的。
		// 称之socket IO流 ，该流也有输入流和输出流
		// 想要通过socket io 流获取输出流
		OutputStream out = s.getOutputStream();
		
		// 3.使用输出流对象将数据写入
		out.write("hi,tcp".getBytes());
		
		// 4.获取输入流对象
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		
		
		// 5.关闭资源。
		s.close();
		
	}

}
