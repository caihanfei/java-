import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 复制文件 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//第一种方式
		FileReader fr = new FileReader("demo.txt");
		FileWriter fw = new FileWriter("copy_demo.txt");
		int ch = 0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		fr.close();
		fw.close();
		//第二种方式
		FileReader read = null;
		FileWriter write = null;
		try{
			read = new FileReader("demo.txt");
			write = new FileWriter("copy_demo2.txt");
			char [] buf = new char[1024];
			int len=0;
			while((len=read.read(buf))!=-1){
				write.write(buf,0,len);
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		finally{
			if(read!=null)
			read.close();
			if(write!=null)
			write.close();
		}
		
	}

}
