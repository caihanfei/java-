package ������;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class �ļ��ϴ��ͻ��� {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		/*
		 * ���󣺶�ȡһ�������ļ��������ݷ��͵�����ˣ�����˶����ݽ��д洢
		 * 		 �洢��Ϻ󣬸��ͻ���һ����ʾ��
		 *	�ı��ļ��ϴ�	
		 */
		//1.����socket����
		Socket s = new Socket("192.168.1.105",1487);
		
		//2.��ȡ�����ļ�
		BufferedReader bufr = new BufferedReader(new FileReader("client.txt"));
		
		//3.ȷ��Ŀ�ģ�����
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufr.readLine())!=null){
			out.println(line);
		}
		//������˷���һ���������,ʹ��socket�����shutdownOutput��������
		s.shutdownOutput();
		//4.��ȡ����˻�����Ϣ
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String text = bufIn.readLine();
			System.out.println("server"+text);
			bufr.close();
			s.close();
		
	}

}
