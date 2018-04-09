import java.io.FileWriter;
import java.io.IOException;

public class FileWriter字符输出流应用 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//该对象被创建，目的文件同时会被创建。
		FileWriter fw = new FileWriter("demo.txt");
		//字符串没有写入到目的文件中，而是写入了缓冲区。
		fw.write("caihanfei");
		fw.flush();//刷新缓冲
		fw.close();//关闭此流，关闭之前需要先刷一次缓冲。
		
		//续写demo，调用新的构造函数
		FileWriter fw1 = new FileWriter("demo.txt",true);
		fw1.write("lallalala");
		fw1.flush();
		fw1.close();
	}

}
//字节输出流不需要调用flush方法 但需要调用close关闭资源。