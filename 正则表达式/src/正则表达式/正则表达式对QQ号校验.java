package 正则表达式;

public class 正则表达式对QQ号校验 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 对QQ号进行校验
		 * 5~15位，不能以0开头 ，必须是数字
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
					System.out.println("每一位必须是数字");
					
				}
			}
			else{
				System.out.println("不能以0开头");
			}
				
		}
		else{
			System.out.println("QQ长度错误");
		}
		return flag;
	}
}
