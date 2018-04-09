package 正则表达式;

import java.util.Arrays;
import java.util.TreeSet;

public class IP排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 192.108.90.34  10.10.10.10 5.5.5.5 30.107.100.5 
		 * 对IP地址字符串中的IP地址进行排序按照ip的分类顺序
		 */
		String ip = "192.108.90.34  10.10.10.10 5.5.5.5 30.107.100.5 ";
		/*
		 * 为了排序方便，最好让ip中的每一段都是三位。这样就可以用字典顺序排序
		 * 给每一段进行补零的操作
		 * 而每一段需要补的零又不一样多，不如都按最多补两个零
		 * 然后在每一段保留最后三位
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
