package fanshe;

public class ���Class��������ַ��� {
	public static void main(String[] args) throws ClassNotFoundException {
		//��һ��
		Class clazz = Class.forName("Person");
		//�ڶ���
		Class clazz1 = Person.class;
		//������
		Person p = new Person();
		Class clazz2 = p.getClass();
	}
}
