package 学生信息管理练习;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个比较器 可以对对象原有的自然排序进行逆序
		Comparator<Student> comp = Collections.reverseOrder();
		//数学成绩比较器
		comp = new ComparatorByMath();
		Set<Student> set = StundentinfoTool.getStudentSet(comp);//获取集合
		File dest = new File("info.txt");//将数据写入指定文件夹
		StundentinfoTool.writeFile(set, dest);
	}

}
