import java.io.FileWriter;
import java.io.IOException;

public class FileWriter�ַ������Ӧ�� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�ö��󱻴�����Ŀ���ļ�ͬʱ�ᱻ������
		FileWriter fw = new FileWriter("demo.txt");
		//�ַ���û��д�뵽Ŀ���ļ��У�����д���˻�������
		fw.write("caihanfei");
		fw.flush();//ˢ�»���
		fw.close();//�رմ������ر�֮ǰ��Ҫ��ˢһ�λ��塣
		
		//��дdemo�������µĹ��캯��
		FileWriter fw1 = new FileWriter("demo.txt",true);
		fw1.write("lallalala");
		fw1.flush();
		fw1.close();
	}

}
//�ֽ����������Ҫ����flush���� ����Ҫ����close�ر���Դ��