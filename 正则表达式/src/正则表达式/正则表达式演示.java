package ������ʽ;

public class ������ʽ��ʾ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		regexDemo();
	}
	public static void regexDemo(){
		String str = "aooz";
		String reg = "[ab]o+z";
		boolean b = str.matches(reg);
		System.out.println(b);
	}
}
