package fanshe;

import java.lang.reflect.Method;

public class ���ʿղλ��ߴ��κ��� {

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
		Method method = clazz.getMethod("show", null);//���þ�̬����
		method.invoke(null, null);//����Ҫ��������
	}
	
	
	//��ȡ���еĹ������ղ����ķ���
	public static void getMethod_1() throws Exception{
		String className = "fanshe.Person";
		Class clazz = Class.forName(className);
		
		Method method = clazz.getMethod("toString", null);
		//��ȡ�ܵ��ø÷����Ķ���
		Object obj = clazz.newInstance();	
		Object returnValue = method.invoke(obj, null);
		System.out.println(returnValue);
		
		
		//		Method[] methods = clazz.getMethods();//ֻ��ȡ�����ĺ͸��෽��
		//		for(Method method : methods){
		//			System.out.println(method);
		//		}
	}
}
