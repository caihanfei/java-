package cn.com.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Linkedlistģ���ջ�Ͷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue my = new MyQueue();
		my.MyAdd("aaa");
		my.MyAdd("bbb");
		my.MyAdd("ccc");
		while(!my.isNull()){
			System.out.println(my.MyGet());
		}
		
		
		//foreach�����������   ��ʾ
		Collection<String> coll = new ArrayList<String>();
		coll.add("wfe");
		coll.add("wafwe");
		coll.add("wrg");
		for(String s : coll){
			System.out.println(s);
		}
		
	}

}
 class MyQueue{
	private LinkedList link = null;
	public MyQueue(){
		link = new LinkedList();
	}
	public void MyAdd(Object obj){
		link.addLast(obj);
	}
	public Object MyGet(){
		return link.removeFirst();//��removefirst��Ϊremoverlast��Ϊ��ջ���ݽṹ
	}
	public boolean isNull(){
		return link.isEmpty();
	}
	
}