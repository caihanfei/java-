package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP传输协议服务端 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 创建一个服务端用来接收数据,显示在显示器上
		 * 并给客户端一个回馈信息
		 * 
		 */
		System.out.println("服务端启动");
		// 1.创建tcp服务端对象。
		ServerSocket ss = new ServerSocket(2568);
		
		// 2.获取客户端对象和指定的客户端进行通讯，该方法是accept（）
		Socket s = ss.accept();
		
		//获取一次ip地址
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+".....connected");
		
		// 3.有了socket，可以获取其中的流，要读取客户端的数据，需要获取读取流
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		
		//调用socket的输出流，给客户端回馈
		OutputStream out = s.getOutputStream();
		out.write("收到".getBytes());
		
		//关闭资源
		s.close();
		ss.close();
	}

}
