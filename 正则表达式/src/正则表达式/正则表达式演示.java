package 正则表达式;

public class 正则表达式演示 {

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
