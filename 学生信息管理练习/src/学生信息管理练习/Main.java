package ѧ����Ϣ������ϰ;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����һ���Ƚ��� ���ԶԶ���ԭ�е���Ȼ�����������
		Comparator<Student> comp = Collections.reverseOrder();
		//��ѧ�ɼ��Ƚ���
		comp = new ComparatorByMath();
		Set<Student> set = StundentinfoTool.getStudentSet(comp);//��ȡ����
		File dest = new File("info.txt");//������д��ָ���ļ���
		StundentinfoTool.writeFile(set, dest);
	}

}
