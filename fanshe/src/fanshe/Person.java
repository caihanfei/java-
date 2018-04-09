package fanshe;

public class Person {

	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		System.out.println("person run");
		// TODO Auto-generated constructor stub
	}
	public static void show(){
		System.out.println("person static show run");
	}
	public void function(String a,int b){
		System.out.println("person param function "+a+","+b);
	}
	private void privateShow(){
		System.out.println("private show run");
	}
	
}
