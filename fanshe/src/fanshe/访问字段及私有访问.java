package fanshe;

import java.lang.reflect.Field;

public class �����ֶμ�˽�з��� {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception, SecurityException {
		// TODO Auto-generated method stub
		String className = "fanshe.Person";
		Class clazz = Class.forName(className);
	
		//��ȡ�����е�����Ϊage���ֶ�
//		Field field = clazz.getField("age");//ֻ�ܻ�ȡ���к͸����е�
		
		Field ageField = clazz.getDeclaredField("age");//���Ի�ȡ˽��
		Field nameField = clazz.getDeclaredField("name");
		//����ñ�����ֵ��������Ҫ�ж���
		Object obj = clazz.newInstance();
		//�Ը�˽���ֶν���ȡ��Ȩ�޼������
		ageField.setAccessible(true);//��������
		nameField.setAccessible(true);
		ageField.set(obj, 17);
		nameField.set(obj, "caihanfei");
		Object o = ageField.get(obj);
		Object o1 = nameField.get(obj);
		System.out.println(o+","+o1);
		
	}

}
