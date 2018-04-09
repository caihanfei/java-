package fanshe;

public class 获得Class对象的三种方法 {
	public static void main(String[] args) throws ClassNotFoundException {
		//第一种
		Class clazz = Class.forName("Person");
		//第二种
		Class clazz1 = Person.class;
		//第三种
		Person p = new Person();
		Class clazz2 = p.getClass();
	}
}
