import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class File类方法演示 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("E:\\java\\File类\\1.txt");
		String name = f.getName(); //获取文件名
		String abspath = f.getAbsolutePath();//获取绝对路径
		String path = f.getPath();// 获取路径
		String dir = f.getParent();// 获取父目录
		long len = f.length();//获取大小
		f.createNewFile();//创建文件
		//f.delete();删除文件
		boolean b = f.exists();//文件是否存在
		
		File ff = new File("c:\\abc\\a\\f\\chf");
		ff.mkdirs();//创建多个文件夹 mkdir 创建一个文件夹
		
		
		File file = new File("E:\\java");
		long time = file.lastModified();
		//为了知道具体时间 需要将毫秒值转换成对象
		Date d = new Date(time);
		DateFormat formate = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String str_time = formate.format(d);
		System.out.println(str_time);
		Date a = new Date();
		
		File [] roots = File.listRoots();
		for(File root : roots){
			System.out.println(root);
		}
		
	}

}
