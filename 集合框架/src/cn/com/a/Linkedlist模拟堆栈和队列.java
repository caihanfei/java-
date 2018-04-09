package cn.com.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Linkedlist模拟堆栈和队列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue my = new MyQueue();
		my.MyAdd("aaa");
		my.MyAdd("bbb");
		my.MyAdd("ccc");
		while(!my.isNull()){
			System.out.println(my.MyGet());
		}
		
		
		//foreach语句代替迭代器   演示
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
		return link.removeFirst();//把removefirst改为removerlast则为堆栈数据结构
	}
	public boolean isNull(){
		return link.isEmpty();
	}
	
}