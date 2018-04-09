package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则表达式四种演示 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkTel();
		splitDemo();
		replaceAllDemo();
		getDemo();
	}
	//获取演示
	public static void getDemo(){
		String str = "da jia zhu yi le ,yao pai wei dian ying le !";
		String reg = "\\b[a-z]{3}\\b";//三个字母组成的单词取出来
		Pattern p = Pattern.compile(reg);//正则规则被编译成pattern对象
		//通过正则的方法matcher和字符串相关联获取匹配器对象
		Matcher m = p.matcher(str);
		//使用匹配器的方法对字符串进行操作
		while(m.find()){
			System.out.println(m.group());
		}
	}
	
	
	//替换演示
	public static void replaceAllDemo(){
//		String str = "werqqtyuzzzic";
//		str = str.replaceAll("(.)\\1+","#");
//		str = str.replaceAll("(.)\\1+", "$1");
		String str = "15812345678";
		str = str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		System.out.println(str);
	}
	
	
	
	//切割演示
	public static void splitDemo(){
//		String str = "23    19 -1 9 56";
//		String[] arr = str.split(" +");

//		String str = "zhangsan.lisi.wangwu";
//		String [] arr = str.split("\\.");//转义
		
		String str = "werqqtyueeeio";
		String[] arr = str.split("(.)\\1+");
		for(String a : arr){
			System.out.println(a);
		}
	}
	
	
	
	//匹配演示，对手机号进行校验。
	public static void checkTel(){
		String str = "15580010951";
		String reg = "1[358]\\d{9}";
		boolean b = str.matches(reg);
		System.out.println(b);
	}
}
