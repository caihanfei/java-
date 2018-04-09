import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ¸´ÖÆmp3ÎÄ¼þ {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("Jay-Z,Alicia Keys - Empire State Of Mind.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		fos.close();
		fis.close();
	}
}
