package ������;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP����Э��Send {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
 * ����ͨ��UDPЭ�鷢��һ�����ݸ�ָ�������� 
 */
		System.out.println("udp�ķ��Ͷ˿���");
	// 1.����UDPЭ�������ͨѶ�����Ƚ���udp socket����
		DatagramSocket ds = new DatagramSocket(1500);
		
	// 2.ȷ�����͵ľ�������
		String str = "hi,udp";
		byte[] buf = str.getBytes();
	
	// 3.�������ݰ�������ΪudpЭ����Ҫ�����ݷ�װ��ָ�������ݰ���
		DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName("dell"), 10000);
	
	// 4.ʹ��udp��socket�����send���������ݰ�����
		ds.send(dp);
		
	// 5.�ر���Դ
		ds.close();
	}

}
