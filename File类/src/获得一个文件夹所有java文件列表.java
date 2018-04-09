
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 获得一个文件夹所有java文件列表 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("E:\\java");
		FilenameFilter filter = new FilenameFilter(){

			public boolean accept(File dir, String name) {
			
				return name.endsWith(".java");//通过匿名内部类写过滤器
			}
		};
		List <File> list = new ArrayList<File>();//创建一个集合
		ListAllJavaFile(dir,filter,list);//使用递归，过滤并存储
		File file = new File(dir,"javalist.txt");
		Writerfile(list,file);
	}

		public static void Writerfile(List<File> list,File dest) throws IOException {
			BufferedWriter bf = new BufferedWriter(new FileWriter(dest));
			for(File file : list){
				bf.write(file.getAbsolutePath());
				bf.newLine();
				bf.flush();
			}
			bf.close();
	}

		public static void ListAllJavaFile(File dir, FilenameFilter filter, List<File> list) {
		File[] files = dir.listFiles();
		if(files!=null)
			for(File file : files){
				if(file.isDirectory()){
					ListAllJavaFile(file, filter, list);
				}
				else{
					if(filter.accept(dir, file.getName())){
						list.add(file);
						System.out.println(file);
					}
				}
			}
		
				
					
		
	}

}
