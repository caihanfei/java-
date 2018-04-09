import java.io.File;

public class 遍历目录 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c://");
		String[] names = f.list(new guolvqi(".txt"));//创建一个过滤.txt文件结尾的过滤器
		for(String name : names){
			System.out.println(name);
		}
		File [] files = f.listFiles(new guolvqibyHide());//创建一个过滤出所有隐藏文件的过滤器
		for(File fs : files){
			System.out.println(fs);
		}
	}

}
