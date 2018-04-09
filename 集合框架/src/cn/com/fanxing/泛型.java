package cn.com.fanxing;

public class ·ºÐÍ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util<Worker> w = new Util<Worker>();
		w.setObject(new Worker());
		Worker a = w.getObject();
		
	}

}
class Util<Person>{
	private Person obj;
	public void setObject(Person obj){
		this.obj=obj;
	}
	public Person getObject(){
		return obj;
	}
}
class Worker{
	
}
class Student{
	
}