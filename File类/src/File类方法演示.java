import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class File�෽����ʾ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("E:\\java\\File��\\1.txt");
		String name = f.getName(); //��ȡ�ļ���
		String abspath = f.getAbsolutePath();//��ȡ����·��
		String path = f.getPath();// ��ȡ·��
		String dir = f.getParent();// ��ȡ��Ŀ¼
		long len = f.length();//��ȡ��С
		f.createNewFile();//�����ļ�
		//f.delete();ɾ���ļ�
		boolean b = f.exists();//�ļ��Ƿ����
		
		File ff = new File("c:\\abc\\a\\f\\chf");
		ff.mkdirs();//��������ļ��� mkdir ����һ���ļ���
		
		
		File file = new File("E:\\java");
		long time = file.lastModified();
		//Ϊ��֪������ʱ�� ��Ҫ������ֵת���ɶ���
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
