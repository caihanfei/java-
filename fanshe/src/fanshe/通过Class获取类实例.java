package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ͨ��Class��ȡ��ʵ�� {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		/*
		 * 1.���Ҳ�����Person.class�ļ����ڴ棬�������ļ���װ��class����
		 * 2.������class���󴴽�����ľ����ʵ��
		 * 3.���ù��캯��
		 */
		Person p = new Person();
		/*
		 * 1.���Ҳ�����ָ�����ֵ��ֽ����ļ����ڴ棬������װ��class����
		 * 2.ͨ��class�����newInstance����������class��Ӧ�����ʵ��
		 * 3.����newInstance����������ȥʹ�ø���Ŀղι��캯�����г�ʼ��
		 * 
		 */
		String className = "fanshe.Person";
	    Class clazz = Class.forName(className);
	    
	    Object obj = clazz.newInstance();
	    
	    /*
	     *����ָ��������û�пղ������캯��
	     *����Ҫ�������������Ҫͨ��ָ���Ĺ��캯�����г�ʼ��
	     *��ʱ�Ͳ�������newInstance������
	     */
	    //��ȡָ�����е�ָ�����캯��
	    Constructor constructor = clazz.getConstructor(String.class,int.class);
	   
	    //�������󣬶���Ľ�������Ҫ���캯���ĳ�ʼ������ô�����������ͨ���������������
	    Object obj1 = constructor.newInstance("lisi",20);
	}

}
