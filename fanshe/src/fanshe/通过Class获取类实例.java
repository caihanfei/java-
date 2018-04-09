package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 通过Class获取类实例 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		/*
		 * 1.查找并加载Person.class文件进内存，并将该文件封装成class对象
		 * 2.在依据class对象创建该类的具体的实例
		 * 3.调用构造函数
		 */
		Person p = new Person();
		/*
		 * 1.查找并加载指定名字的字节码文件进内存，并被封装成class对象
		 * 2.通过class对象的newInstance方法创建该class对应的类的实例
		 * 3.调用newInstance（）方法会去使用该类的空参构造函数进行初始化
		 * 
		 */
		String className = "fanshe.Person";
	    Class clazz = Class.forName(className);
	    
	    Object obj = clazz.newInstance();
	    
	    /*
	     *若果指定的类中没有空参数构造函数
	     *或者要创建的类对象需要通过指定的构造函数进行初始化
	     *这时就不可以用newInstance方法了
	     */
	    //获取指定类中的指定构造函数
	    Constructor constructor = clazz.getConstructor(String.class,int.class);
	   
	    //创建对象，对象的建立都需要构造函数的初始化，怎么创建对象可以通过构造器对象完成
	    Object obj1 = constructor.newInstance("lisi",20);
	}

}
