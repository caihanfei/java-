package ������;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP����Э��Rece {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ���󣺽��յ������������ݣ����������е�ip��ַ�Ͷ˿��Լ��������ݶ���ӡ����ʾ���ϡ� 
		 */
		System.out.println("���ն˿���");
	//1. ����udp socket������ ��ָ���˿� ����Ӧ�ó���������ݱ�ʶ
		DatagramSocket ds = new DatagramSocket(10000);
		
	//2. �������ݰ����ڴ洢���յ������ݣ��������ݰ������еķ��������ݰ����н���
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		
	//3. ʹ��socket�����receive���������յ������ݶ��洢�����ݰ��Ķ�����
		ds.receive(dp);//����ʱ����
	
	//4. ֱ�������ݰ�����ķ��������ݽ��н���
		String ip = dp.getAddress().getHostAddress();//��ȡip
		int port = dp.getPort();//��ȡ�˿�
		byte[] data = dp.getData();//��ȡ����
		String text = new String(data,0,dp.getLength());
		System.out.println(ip+":"+port+":"+text);
		
	//5. �ر���Դ
		ds.close();
	}
}
