import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ��ȡϵͳ���Լ���Runtime�� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pro = System.getProperties();//��ϵͳ��Ϣ����Properties������
		//��ȡ�ü����е���Ϣ���Ƚ���תΪset���ϡ�
		Set<String> nameset = pro.stringPropertyNames();
		for(String name :nameset){
			String value = pro.getProperty(name);
			System.out.println(name+"::::"+value);
			
		}
		System.out.println();
		System.out.println();
		String a = pro.getProperty("os.name");
		System.out.println(a);
		//Runtime�಻�ܱ�ʵ���� ֻ����getRuntime������ȡ
		Runtime run = Runtime.getRuntime();
		//run.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe");//�ø÷�������ֱ�Ӵ򿪳���
	}

}
