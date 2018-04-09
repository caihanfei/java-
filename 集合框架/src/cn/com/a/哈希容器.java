package cn.com.a;

import java.util.HashSet;
import java.util.Iterator;

public class 哈希容器 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hash = new HashSet();
		hash.add("123");
		hash.add("abc");
		hash.add("cd");
		hash.add("abc");
		hash.add("123");
		for(Iterator it = hash.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}

}
//哈希容器无重复元素出现。如要去除数据相同的对象需要覆盖equals方法。