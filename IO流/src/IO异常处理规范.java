import java.io.FileWriter;
import java.io.IOException;

public class IO异常处理规范 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try{
			fw = new FileWriter("demo2.txt");
			fw.write("abcde");
			fw.flush();
		}
		catch(IOException e){
			
		}
		finally {
			if(fw!=null)
				try{
					fw.close();
				}
			    catch(IOException e){
		throw new RuntimeException("关闭失败");
		            }
		}
		//系统中获取的流对象是唯一的。如果将其关闭就不能再使用
	}

}
