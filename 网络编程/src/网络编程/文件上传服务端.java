package 网络编程;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class 文件上传服务端 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 服务端：对客户端发送的数据进行接收并存储到一个文件中
		 * 并对客户端进行”上传成功“字样的返回
		 */
		//1.创建服务端socket服务
		ServerSocket ss = new ServerSocket(1487);
		
		//2.获取客户端对象
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress()+".....connect");
		//3.读取客户端发来的数据
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.将数据写入一个文件中
		PrintWriter pw = new PrintWriter(new FileWriter("server.txt"),true);
		String line = null;
		while((line=bufIn.readLine())!=null){
			pw.println(line);
		}
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("上传成功");
		
		pw.close();
		s.close();
		ss.close();
	}

}
