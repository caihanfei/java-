package cn.com.a;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
//��������compareto�����Ƚϴ�С����Ƚ϶����С��Ҫ����compareto����
public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tree = new TreeSet();
		tree.add("1");
		tree.add("3");
		tree.add("4");
		tree.add("5");
		tree.add("2");
	
	for(Iterator it = tree.iterator();it.hasNext();){
		System.out.println(it.next());
	}
	//��TreeSet����һ���Ƚ������Ƚ��ַ������ȡ�
	TreeSet tree1 = new TreeSet(new comparebylength());
	tree1.add("wgrgwrg");
	tree1.add("rggrw");
	tree1.add("brbt");
	tree1.add("a");
	tree1.add("wgethjtyjyj");
	Iterator<String> itt = tree1.iterator();
	while(itt.hasNext()){
		System.out.println(itt.next());
	}
	
}
}
class comparebylength implements Comparator{

	
	public int compare(Object arg0, Object arg1) {
		String s1 = (String)arg0;
		String s2 = (String)arg1;
		int temp = s1.length()-s2.length();
		return temp==0?s1.compareTo(s2):temp;
	}
	
}