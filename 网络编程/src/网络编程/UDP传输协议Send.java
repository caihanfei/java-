package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP传输协议Send {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
 * 需求：通过UDP协议发送一段数据给指定主机。 
 */
		System.out.println("udp的发送端开启");
	// 1.进行UDP协议的网络通讯，首先建立udp socket服务
		DatagramSocket ds = new DatagramSocket(1500);
		
	// 2.确定发送的具体数据
		String str = "hi,udp";
		byte[] buf = str.getBytes();
	
	// 3.创建数据包对象，因为udp协议需要将数据封装到指定的数据包中
		DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName("dell"), 10000);
	
	// 4.使用udp的socket服务的send方法将数据包发出
		ds.send(dp);
		
	// 5.关闭资源
		ds.close();
	}

}
