package 正则表达式;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 网络爬虫 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 网络爬虫，spider
		 * 用于负责获取指定规则的数据
		 */
//		getMails();
		getMailsbynet();
	}
	/*
	 * 获取指定文件中的特定信息，如邮箱地址
	 * 
	 * 思路：
	 * 1.读取文件。
	 * 2.获取文件中的每一行字符串
	 * 3.对该行字符串中的特定信息进行规则的匹配，将符合规则的都获取出来进行存储
	 */
	public static void getMailsbynet() throws IOException{
		URL url = new URL("http://blog.sina.com.cn/s/blog_515617e60101e151.html");
		BufferedReader bufr = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		String mail_reg = "\\w+@\\w+(\\.\\w+)+";//拿到所有邮箱
//		String QQ_reg ="[0-9]{9,12}";//拿到所有QQ号
		
		Pattern p = Pattern.compile(mail_reg);
		while((line=bufr.readLine())!=null){
			Matcher m = p.matcher(line);
			while(m.find()){
				System.out.println(m.group());
			}
		}
	}
	
	public static void getMails() throws IOException{
		BufferedReader bufr = new BufferedReader(new FileReader("邮箱地址大全_无语汇_新浪博客.mhtml"));
		String line = null;
		String mail_reg = "\\w+@\\w+(\\.\\w+)+";//拿到所有邮箱
//		String QQ_reg ="[0-9]{9,12}";//拿到所有QQ号
		
		Pattern p = Pattern.compile(mail_reg);
		while((line=bufr.readLine())!=null){
			Matcher m = p.matcher(line);
			while(m.find()){
				System.out.println(m.group());
			}
		}
	}
}
