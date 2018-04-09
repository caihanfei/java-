package 学生信息管理练习;

import java.util.Comparator;

public class ComparatorByMath implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int temp = o1.getMa()-o2.getMa();
		return temp==0?o1.getName().compareTo(o2.getName()):temp;
	}

}
