package ������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ������ʽ������ʾ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkTel();
		splitDemo();
		replaceAllDemo();
		getDemo();
	}
	//��ȡ��ʾ
	public static void getDemo(){
		String str = "da jia zhu yi le ,yao pai wei dian ying le !";
		String reg = "\\b[a-z]{3}\\b";//������ĸ��ɵĵ���ȡ����
		Pattern p = Pattern.compile(reg);//������򱻱����pattern����
		//ͨ������ķ���matcher���ַ����������ȡƥ��������
		Matcher m = p.matcher(str);
		//ʹ��ƥ�����ķ������ַ������в���
		while(m.find()){
			System.out.println(m.group());
		}
	}
	
	
	//�滻��ʾ
	public static void replaceAllDemo(){
//		String str = "werqqtyuzzzic";
//		str = str.replaceAll("(.)\\1+","#");
//		str = str.replaceAll("(.)\\1+", "$1");
		String str = "15812345678";
		str = str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		System.out.println(str);
	}
	
	
	
	//�и���ʾ
	public static void splitDemo(){
//		String str = "23    19 -1 9 56";
//		String[] arr = str.split(" +");

//		String str = "zhangsan.lisi.wangwu";
//		String [] arr = str.split("\\.");//ת��
		
		String str = "werqqtyueeeio";
		String[] arr = str.split("(.)\\1+");
		for(String a : arr){
			System.out.println(a);
		}
	}
	
	
	
	//ƥ����ʾ�����ֻ��Ž���У�顣
	public static void checkTel(){
		String str = "15580010951";
		String reg = "1[358]\\d{9}";
		boolean b = str.matches(reg);
		System.out.println(b);
	}
}
