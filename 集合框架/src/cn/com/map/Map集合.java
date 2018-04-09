package cn.com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map集合 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(21,"caihanfei" );
		map.put(54, "aaaa");
		map.put(6, "gwage");
		System.out.println(map);
		System.out.println(map.get(21));
//		map.clear();//清空集合
//		System.out.println(map);
		Set<Integer> getall = map.keySet();//获取Map中所有Key
		Iterator<Integer> it = getall.iterator();
		while(it.hasNext()){
			Integer key =it.next();
			String value = map.get(key);
			System.out.println(key+","+value);
		}
		Map<Integer, String> map1 = new HashMap<Integer,String>();
		map1.put(0, "abc");
		map1.put(1, "bcd");
		map1.put(2, "weef");
		Set<Map.Entry<Integer,String>> aaa = map1.entrySet();//获得对应关系
		Iterator<Map.Entry<Integer, String>> itt = aaa.iterator();
		while(itt.hasNext()){
			Map.Entry<Integer, String> me = itt.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+","+value);
			
		}
	}

}
