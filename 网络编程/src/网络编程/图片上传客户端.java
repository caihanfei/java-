package ������;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ͼƬ�ϴ��ͻ��� {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		/*
		 * �ͻ��ˣ���ȡһ��ͼƬ���ݣ����͵�����ˣ�����ȡ������Ϣ
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
		s.shutdownOutput();//�������
		
		InputStream in =s.getInputStream();
		byte[] bufIn = new byte[1024];
		int lenIn = in.read(bufIn);
		String info = new String(bufIn,0,lenIn);
		System.out.println(info);
		fis.close();
		s.close();
		
	}

}
