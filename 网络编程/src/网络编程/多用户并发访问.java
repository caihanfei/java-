package 网络编程;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class 多用户并发访问 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 多用户的并发访问。
		 */
		ServerSocket ss = new ServerSocket(10045);
		while(true){
		Socket s = ss.accept();
		new Thread(new UploadTHread(s)).start();
		
		
		}
	}

}
