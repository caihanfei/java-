package 网络编程;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class 文件上传客户端 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 需求：读取一个本地文件，将数据发送到服务端，服务端对数据进行存储
		 * 		 存储完毕后，给客户端一个提示。
		 *	文本文件上传	
		 */
		//1.创建socket服务
		Socket s = new Socket("192.168.1.105",1487);
		
		//2.读取本地文件
		BufferedReader bufr = new BufferedReader(new FileReader("client.txt"));
		
		//3.确定目的：网络
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufr.readLine())!=null){
			out.println(line);
		}
		//给服务端发送一个结束标记,使用socket对象的shutdownOutput（）方法
		s.shutdownOutput();
		//4.读取服务端回馈信息
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String text = bufIn.readLine();
			System.out.println("server"+text);
			bufr.close();
			s.close();
		
	}

}
