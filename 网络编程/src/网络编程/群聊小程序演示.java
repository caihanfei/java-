package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class 群聊小程序演示 {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		/*
		 * 群聊程序
		 * 收发同时运行，需要一个线程负责收数据，一个线程负责发数据
		 * 定义两个线程任务。
		 */
		
		//创建接收端和发送端
		DatagramSocket send = new DatagramSocket(1909);
		DatagramSocket rece = new DatagramSocket(10003);
		new Thread(new Send(send)).start();
		new Thread(new Rece(rece)).start();
	}

}
//定义发送任务
class Send implements Runnable{
	private DatagramSocket ds;
	public void run(){
		try{
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line=bufr.readLine())!=null){
				
				byte[] buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName("dell"),10003);
				ds.send(dp);
				if("over".equals(line))
					break;
			}
			ds.close();
			
		}
		catch(IOException e){
			
		}
	}
	
	public Send(DatagramSocket ds) {
		super();
		this.ds = ds;
	}
}
//定义接收任务
class Rece implements Runnable{
	private DatagramSocket ds;
	
	public Rece(DatagramSocket ds) {
		super();
		this.ds = ds;
	}
	public void run() {
		try{
			byte[] buf = new byte[1024];
			while(true){
				DatagramPacket dp = new DatagramPacket(buf,buf.length);
				ds.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				String text = new String(dp.getData(),0,dp.getLength());
				System.out.println(ip+":"+text);
				if("over".equals(text)){
					System.out.println(ip+"....离开聊天室");
				}
			}
		}
		catch(Exception e){
			
		}
	}
}