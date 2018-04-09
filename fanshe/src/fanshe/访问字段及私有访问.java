package fanshe;

import java.lang.reflect.Field;

public class 访问字段及私有访问 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception, SecurityException {
		// TODO Auto-generated method stub
		String className = "fanshe.Person";
		Class clazz = Class.forName(className);
	
		//获取该类中的名称为age的字段
//		Field field = clazz.getField("age");//只能获取共有和父类中的
		
		Field ageField = clazz.getDeclaredField("age");//可以获取私有
		Field nameField = clazz.getDeclaredField("name");
		//想给该变量赋值，必须先要有对象
		Object obj = clazz.newInstance();
		//对该私有字段进行取消权限检查能力
		ageField.setAccessible(true);//暴力访问
		nameField.setAccessible(true);
		ageField.set(obj, 17);
		nameField.set(obj, "caihanfei");
		Object o = ageField.get(obj);
		Object o1 = nameField.get(obj);
		System.out.println(o+","+o1);
		
	}

}
