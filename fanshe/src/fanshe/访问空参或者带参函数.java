package fanshe;

import java.lang.reflect.Method;

public class 访问空参或者带参函数 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getMethod_1();
		getMethod_2();
		getMethod_3();
	}
	public static void getMethod_3() throws Exception{
		String className = "fanshe.Person";
		Class clazz = Class.forName(className);
		Method method = clazz.getMethod("function",String.class,int.class );
		Object obj = clazz.newInstance();
		method.invoke(obj, "haha",89);
	}
	
	
	public static void getMethod_2() throws Exception{
		String className = "fanshe.Person";
		Class clazz = Class.forName(className);
		Method method = clazz.getMethod("show", null);//调用静态方法
		method.invoke(null, null);//不需要创建对象
	}
	
	
	//获取类中的公共，空参数的方法
	public static void getMethod_1() throws Exception{
		String className = "fanshe.Person";
		Class clazz = Class.forName(className);
		
		Method method = clazz.getMethod("toString", null);
		//获取能调用该方法的对象
		Object obj = clazz.newInstance();	
		Object returnValue = method.invoke(obj, null);
		System.out.println(returnValue);
		
		
		//		Method[] methods = clazz.getMethods();//只获取公共的和父类方法
		//		for(Method method : methods){
		//			System.out.println(method);
		//		}
	}
}
