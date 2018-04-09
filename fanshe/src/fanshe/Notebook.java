package fanshe;

public class Notebook {
	public void run(){
		System.out.println("notebook run");
	}
	public void useUSb(USB usb){
		if(usb!=null){
			usb.open();
			usb.close();
		}
	}
}
