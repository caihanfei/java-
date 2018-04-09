import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class 序列化与反序列化 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		writeobj();
		readobj();
	}

	public static void readobj() throws IOException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
		Person p =(Person)ois.readObject();
		System.out.println(p.getAge()+":"+p.getName());
		ois.close();
	}

	public static void writeobj() throws IOException, IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		oos.writeObject(new Person("caihanfei",18));
		oos.close();
	}

}
