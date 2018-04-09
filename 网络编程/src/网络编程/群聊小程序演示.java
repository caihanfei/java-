package ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Ⱥ��С������ʾ {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		/*
		 * Ⱥ�ĳ���
		 * �շ�ͬʱ���У���Ҫһ���̸߳��������ݣ�һ���̸߳�������
		 * ���������߳�����
		 */
		
		//�������ն˺ͷ��Ͷ�
		DatagramSocket send = new DatagramSocket(1909);
		DatagramSocket rece = new DatagramSocket(10003);
		new Thread(new Send(send)).start();
		new Thread(new Rece(rece)).start();
	}

}
//���巢������
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
//�����������
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
					System.out.println(ip+"....�뿪������");
				}
			}
		}
		catch(Exception e){
			
		}
	}
}