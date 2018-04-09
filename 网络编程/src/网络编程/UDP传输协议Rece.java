package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP传输协议Rece {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 需求：接收到发过来的数据，并将数据中的ip地址和端口以及数据内容都打印在显示器上。 
		 */
		System.out.println("接收端开启");
	//1. 创建udp socket服务器 绑定指定端口 给该应用程序分配数据标识
		DatagramSocket ds = new DatagramSocket(10000);
		
	//2. 创建数据包用于存储接收到的数据，并用数据包对象中的方法对数据包进行解析
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		
	//3. 使用socket对象的receive方法将接收到的数据都存储到数据包的对象中
		ds.receive(dp);//阻塞时方法
	
	//4. 直接用数据包对象的方法对数据进行解析
		String ip = dp.getAddress().getHostAddress();//获取ip
		int port = dp.getPort();//获取端口
		byte[] data = dp.getData();//获取数据
		String text = new String(data,0,dp.getLength());
		System.out.println(ip+":"+port+":"+text);
		
	//5. 关闭资源
		ds.close();
	}
}
