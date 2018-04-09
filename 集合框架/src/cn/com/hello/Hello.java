package cn.com.hello;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method 
		Scanner scanner = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer("abc");
		s1.append("a");
		System.out.println(s1.toString());
		int arr[]={1,5,78,65};
		System.out.println(arr);
		System.out.println(Integer.MAX_VALUE);
		String str="14 52 69 78 20";
		
		
		String [] ar = str.split(" ");
		System.out.println(ar[1]);
		Collection coll = new ArrayDeque();
		coll.add("abc");
		coll.add("bb");
		coll.add(new Object());
		System.out.println(coll);
		Point p1;
		p1 = new Point(2,3);
		String str5 = "888"+8+8;
		System.out.println(str5);
		Iterator it =coll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(Iterator ita = coll.iterator();ita.hasNext();){
			System.out.println(ita.next());
		}
		int num;
		num=scanner.nextInt();
		switch(num){
			case 1:System.out.println(1);
				break;
			case 2:System.out.println(2);
				break;
			case 3:System.out.println(3);
				break;
			default :System.out.println(5);
				break;
				
			case 4:System.out.println(4);
				break;
			
		}
		String str11 = "1";
		String str22 = "1";
		System.out.println(str11==str22);
		char aa='\ucafe';
		System.out.println(aa);
		String strrr=p1.abc();
		System.out.println(strrr);
		ArrayList array = new ArrayList();
		array.add("abc1");
		array.add("abc2");
		array.add("abc3");
		for(Iterator itt = array.iterator();itt.hasNext();){
			System.out.println(itt.next());
		}

	}

}
