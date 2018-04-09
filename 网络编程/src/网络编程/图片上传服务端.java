package 网络编程;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class 图片上传服务端 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 服务端：接收客户端发送过来的图片数据。
		 * 进行存储后，回馈一个上传成功字样。
		 */
		
		ServerSocket ss = new ServerSocket(10004);
		
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress()+"....connect");
		//读取数据。网络
		InputStream in = s.getInputStream();
		
		//目的： 文件
		FileOutputStream fos = new FileOutputStream("server.jpg");
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=in.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		OutputStream out = s.getOutputStream();
		out.write("上传成功".getBytes());
		
		fos.close();
		s.close();
		ss.close();
		
	}
}
