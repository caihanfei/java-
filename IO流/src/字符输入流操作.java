import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ×Ö·ûÊäÈëÁ÷²Ù×÷ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader read = new FileReader("demo.txt");
//		int ch = read.read();
//		System.out.println((char)ch);
		int ch1=0;
		while((ch1=read.read())!=-1){
			System.out.print((char)ch1);
		}
		read.close();
	}

}