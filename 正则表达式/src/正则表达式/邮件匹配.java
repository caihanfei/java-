package ������ʽ;

public class �ʼ�ƥ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����У��
		 */
		test();
	}
	public static void test(){
		String mail = "abc12@sina.com";
		String reg = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,3}";
		boolean b = mail.matches(reg);
		System.out.println(mail+":"+b);
	}
}
