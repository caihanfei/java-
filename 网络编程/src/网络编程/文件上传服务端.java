package ������;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class �ļ��ϴ������ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ����ˣ��Կͻ��˷��͵����ݽ��н��ղ��洢��һ���ļ���
		 * ���Կͻ��˽��С��ϴ��ɹ��������ķ���
		 */
		//1.���������socket����
		ServerSocket ss = new ServerSocket(1487);
		
		//2.��ȡ�ͻ��˶���
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress()+".....connect");
		//3.��ȡ�ͻ��˷���������
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.������д��һ���ļ���
		PrintWriter pw = new PrintWriter(new FileWriter("server.txt"),true);
		String line = null;
		while((line=bufIn.readLine())!=null){
			pw.println(line);
		}
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("�ϴ��ɹ�");
		
		pw.close();
		s.close();
		ss.close();
	}

}
