import java.io.File;

public class ����Ŀ¼ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c://");
		String[] names = f.list(new guolvqi(".txt"));//����һ������.txt�ļ���β�Ĺ�����
		for(String name : names){
			System.out.println(name);
		}
		File [] files = f.listFiles(new guolvqibyHide());//����һ�����˳����������ļ��Ĺ�����
		for(File fs : files){
			System.out.println(fs);
		}
	}

}
