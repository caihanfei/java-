package ������;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP��ַ {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
/*
 * ��IP��ַ��װΪ����
 * ͨ������ľ�̬������ȡ����������IP��ַ����
 */
		InetAddress ip = InetAddress.getLocalHost();//��ȡ��������
		ip=InetAddress.getByName("www.sina.com.cn");//��ȡָ������IP����
		String str_ip = ip.getHostAddress();//ip��ַ
		String name_ip = ip.getHostName();//��������
		System.out.println(str_ip+","+name_ip);
		
	}

}
