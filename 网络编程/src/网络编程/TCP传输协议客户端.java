package ������;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP����Э��ͻ��� {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		/*
		 * ����һ��tcp�Ŀͻ���
		 * ����һ�����ݸ�����ˣ�����ȡ����˷��ص���Ϣ
		 */
		System.out.println("�ͻ�������");
		// 1.����tcp�ͻ��˶��󣬱���Ҫ��socket���񡣿ͻ���ͨ��һ����������Ҫȥ��������
		//��Ϊ����������ӵ�Э�顣���Ա�����ȷҪ�����ĸ��������Լ��˿�
		Socket s = new Socket("192.168.1.105",2568);
		// 2.����һ�����������γ����ݴ����ͨ������ͨ������IO������IO������socket�����ġ�
		// ��֮socket IO�� ������Ҳ���������������
		// ��Ҫͨ��socket io ����ȡ�����
		OutputStream out = s.getOutputStream();
		
		// 3.ʹ���������������д��
		out.write("hi,tcp".getBytes());
		
		// 4.��ȡ����������
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		
		
		// 5.�ر���Դ��
		s.close();
		
	}

}
