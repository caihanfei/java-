package ������;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP����Э������ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ����һ�������������������,��ʾ����ʾ����
		 * �����ͻ���һ��������Ϣ
		 * 
		 */
		System.out.println("���������");
		// 1.����tcp����˶���
		ServerSocket ss = new ServerSocket(2568);
		
		// 2.��ȡ�ͻ��˶����ָ���Ŀͻ��˽���ͨѶ���÷�����accept����
		Socket s = ss.accept();
		
		//��ȡһ��ip��ַ
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+".....connected");
		
		// 3.����socket�����Ի�ȡ���е�����Ҫ��ȡ�ͻ��˵����ݣ���Ҫ��ȡ��ȡ��
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		
		//����socket������������ͻ��˻���
		OutputStream out = s.getOutputStream();
		out.write("�յ�".getBytes());
		
		//�ر���Դ
		s.close();
		ss.close();
	}

}
