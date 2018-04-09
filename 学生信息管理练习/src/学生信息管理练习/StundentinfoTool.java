package ѧ����Ϣ������ϰ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import javax.management.RuntimeErrorException;

public class StundentinfoTool {
/*
 * ͨ������¼���ȡ��Ϣ
 * ������Ϣ��װΪѧ������
 * ��ѧ����Ϣ�洢��������
 */
	
	public static Set<Student> getStudentSet() throws IOException {
		// TODO Auto-generated method stub
		return getStudentSet(null);
	}
	public static Set<Student> getStudentSet(Comparator<Student> comp) throws IOException{
		Set<Student> stuSet = null;
		BufferedReader bufr = null;
		if(comp==null)
			stuSet = new TreeSet<Student>();
		else
			stuSet = new TreeSet<Student>(comp);//��������
				try{
					bufr = new BufferedReader(new InputStreamReader(System.in));//��ȡ����¼��
					
					String line = null;//��ȡ����¼��
					while((line=bufr.readLine())!=null){
						if("over".equals(line))
							break;
						String [] arr = line.split(",");
						//��װ��������
						Student stu = new Student(arr[0],
								Integer.parseInt(arr[1]),
								Integer.parseInt(arr[2]),
								Integer.parseInt(arr[3]));
						stuSet.add(stu);
					}
				}finally {
					if(bufr!=null){
						try{
							bufr.close();
						}
						catch (IOException e) {
							throw new RuntimeException("�ر�ʧ��");
						}
					}
				}
				return stuSet;
	}
	/*
	 * �������е�����д�뵽һ���ļ���
	 */
	public static void writeFile(Set<Student> set,File dest) throws IOException{
		BufferedWriter bufw = null;
		try{
			bufw = new BufferedWriter(new FileWriter(dest));
			//��������
			for(Student stu: set ){
				bufw.write(stu.getName()+"....."+stu.getSum()+"...."+stu.getMa());
				bufw.newLine();
				bufw.flush();
			}
		}finally{
			try{
			if(bufw!=null){
				bufw.close();
			}
			}
			catch(IOException e){
				throw new RuntimeException("�ر�ʧ��");
			}
		}

	}

		
}
