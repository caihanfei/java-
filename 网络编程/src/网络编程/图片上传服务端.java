package ������;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ͼƬ�ϴ������ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ����ˣ����տͻ��˷��͹�����ͼƬ���ݡ�
		 * ���д洢�󣬻���һ���ϴ��ɹ�������
		 */
		
		ServerSocket ss = new ServerSocket(10004);
		
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress()+"....connect");
		//��ȡ���ݡ�����
		InputStream in = s.getInputStream();
		
		//Ŀ�ģ� �ļ�
		FileOutputStream fos = new FileOutputStream("server.jpg");
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=in.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		OutputStream out = s.getOutputStream();
		out.write("�ϴ��ɹ�".getBytes());
		
		fos.close();
		s.close();
		ss.close();
		
	}
}
