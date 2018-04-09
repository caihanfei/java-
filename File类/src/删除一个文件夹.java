import java.io.File;

public class 删除一个文件夹 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("e:\\高数");
		removedir(f);
	}

	public static void removedir(File f) {
		// TODO Auto-generated method stub
		File [] Files = f.listFiles();
		for(File file : Files){
			if(file.isDirectory())
				removedir(file);
			else
				file.delete();		
		}
		f.delete();
	}

}
