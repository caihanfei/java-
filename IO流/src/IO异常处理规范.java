import java.io.FileWriter;
import java.io.IOException;

public class IO�쳣����淶 {

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
		throw new RuntimeException("�ر�ʧ��");
		            }
		}
		//ϵͳ�л�ȡ����������Ψһ�ġ��������رվͲ�����ʹ��
	}

}
