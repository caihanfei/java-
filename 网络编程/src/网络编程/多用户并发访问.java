package ������;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ���û��������� {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ���û��Ĳ������ʡ�
		 */
		ServerSocket ss = new ServerSocket(10045);
		while(true){
		Socket s = ss.accept();
		new Thread(new UploadTHread(s)).start();
		
		
		}
	}

}
