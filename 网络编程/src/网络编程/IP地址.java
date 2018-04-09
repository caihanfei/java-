package 网络编程;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP地址 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
/*
 * 将IP地址封装为对象
 * 通过该类的静态方法获取本地主机的IP地址对象
 */
		InetAddress ip = InetAddress.getLocalHost();//获取本地主机
		ip=InetAddress.getByName("www.sina.com.cn");//获取指定主机IP对象
		String str_ip = ip.getHostAddress();//ip地址
		String name_ip = ip.getHostName();//主机名称
		System.out.println(str_ip+","+name_ip);
		
	}

}
