package ������ʽ;

public class ������ʽ��QQ��У�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��QQ�Ž���У��
		 * 5~15λ��������0��ͷ ������������
		 */
		String QQ ="046666";
//		checkQQ(QQ);
		String regex = "[1-9][0-9]{4,14}";
		boolean b = QQ.matches(regex);
		System.out.println(b);
		
	}
	public static boolean checkQQ(String QQ){
		int len = QQ.length();
		boolean flag = false;
		if(len>5 && len<15){
			if(!QQ.startsWith("0")){
				try{
					long l = Long.parseLong(QQ);
					System.out.println("QQ:"+l);
					flag = true;
				}catch(NumberFormatException e){
					System.out.println("ÿһλ����������");
					
				}
			}
			else{
				System.out.println("������0��ͷ");
			}
				
		}
		else{
			System.out.println("QQ���ȴ���");
		}
		return flag;
	}
}
