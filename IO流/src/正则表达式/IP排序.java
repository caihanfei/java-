package ������ʽ;

import java.util.Arrays;
import java.util.TreeSet;

public class IP���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 192.108.90.34  10.10.10.10 5.5.5.5 30.107.100.5 
		 * ��IP��ַ�ַ����е�IP��ַ����������ip�ķ���˳��
		 */
		String ip = "192.108.90.34  10.10.10.10 5.5.5.5 30.107.100.5 ";
		/*
		 * Ϊ�����򷽱㣬�����ip�е�ÿһ�ζ�����λ�������Ϳ������ֵ�˳������
		 * ��ÿһ�ν��в���Ĳ���
		 * ��ÿһ����Ҫ�������ֲ�һ���࣬���綼����ಹ������
		 * Ȼ����ÿһ�α��������λ
		 */
		ip = ip.replaceAll("(\\d+)", "00$1");
		System.out.println(ip);
		ip = ip.replaceAll("0*(\\d{3})", "$1");
		String[] ipa = ip.split(" +");
//		TreeSet<String> ts = new TreeSet<String>();
//		for(String i : ipa){
//			ts.add(i);
//		}
		Arrays.sort(ipa);
		for(String i : ipa){
			System.out.println(i.replaceAll("0*(\\d+)","$1"));
		}
	}

}
