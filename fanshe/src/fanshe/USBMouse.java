package fanshe;

public class USBMouse implements USB{
	public void close(){
		System.out.println("mouse close");
	}
	public void open(){
		System.out.println("mouse open");
	}
}
