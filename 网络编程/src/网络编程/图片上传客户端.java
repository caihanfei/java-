package 网络编程;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class 图片上传客户端 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 客户端：读取一个图片数据，发送到服务端，并读取回馈信息
		 * 
		 */
		Socket s = new Socket("192.168.1.105", 10045);
		FileInputStream fis = new FileInputStream("c:\\0.jpg");
		OutputStream out = s.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read(buf))!=-1){
			out.write(buf,0,len);
		}
		s.shutdownOutput();//结束标记
		
		InputStream in =s.getInputStream();
		byte[] bufIn = new byte[1024];
		int lenIn = in.read(bufIn);
		String info = new String(bufIn,0,lenIn);
		System.out.println(info);
		fis.close();
		s.close();
		
	}

}
