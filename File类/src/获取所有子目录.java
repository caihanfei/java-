import java.io.File;

public class 获取所有子目录 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("e:\\java\\IO流");
		showfile(dir,0);
	}

	public static void showfile(File dir,int count) {
		System.out.println("dir:"+dir); 
		count++;
		File[] files = dir.listFiles();
		for(File f : files){
			if(f.isDirectory()){
				showfile(f,count);//递归思想
			}
			else
				System.out.println(getsspace(count)+f);
		}
		
	}

	private static String getsspace(int count) {
		StringBuilder sb = new StringBuilder();
		for(int a=0;a<count;a++){
			sb.append("   ");
		}
		return sb.toString();
	}
	

}
