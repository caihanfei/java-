package ������ʽ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class �������� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * �������棬spider
		 * ���ڸ����ȡָ�����������
		 */
//		getMails();
		getMailsbynet();
	}
	/*
	 * ��ȡָ���ļ��е��ض���Ϣ���������ַ
	 * 
	 * ˼·��
	 * 1.��ȡ�ļ���
	 * 2.��ȡ�ļ��е�ÿһ���ַ���
	 * 3.�Ը����ַ����е��ض���Ϣ���й����ƥ�䣬�����Ϲ���Ķ���ȡ�������д洢
	 */
	public static void getMailsbynet() throws IOException{
		URL url = new URL("http://blog.sina.com.cn/s/blog_515617e60101e151.html");
		BufferedReader bufr = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		String mail_reg = "\\w+@\\w+(\\.\\w+)+";//�õ���������
//		String QQ_reg ="[0-9]{9,12}";//�õ�����QQ��
		
		Pattern p = Pattern.compile(mail_reg);
		while((line=bufr.readLine())!=null){
			Matcher m = p.matcher(line);
			while(m.find()){
				System.out.println(m.group());
			}
		}
	}
	
	public static void getMails() throws IOException{
		BufferedReader bufr = new BufferedReader(new FileReader("�����ַ��ȫ_�����_���˲���.mhtml"));
		String line = null;
		String mail_reg = "\\w+@\\w+(\\.\\w+)+";//�õ���������
//		String QQ_reg ="[0-9]{9,12}";//�õ�����QQ��
		
		Pattern p = Pattern.compile(mail_reg);
		while((line=bufr.readLine())!=null){
			Matcher m = p.matcher(line);
			while(m.find()){
				System.out.println(m.group());
			}
		}
	}
}
