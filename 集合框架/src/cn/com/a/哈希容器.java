package cn.com.a;

import java.util.HashSet;
import java.util.Iterator;

public class ��ϣ���� {

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
//��ϣ�������ظ�Ԫ�س��֡���Ҫȥ��������ͬ�Ķ�����Ҫ����equals������