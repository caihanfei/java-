import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class 序列流 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis1 = new FileInputStream("111.txt");
		FileInputStream fis2 = new FileInputStream("222.txt");
		FileInputStream fis3 = new FileInputStream("333.txt");
		ArrayList<FileInputStream> v = new ArrayList<FileInputStream>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		Enumeration<FileInputStream> en = Collections.enumeration(v); 
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("123all.txt");//创建目的文件
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
	}

}
