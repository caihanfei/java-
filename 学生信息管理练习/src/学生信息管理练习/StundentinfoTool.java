package 学生信息管理练习;

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
 * 通过键盘录入获取信息
 * 并将信息封装为学生对象
 * 将学生信息存储到集合中
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
			stuSet = new TreeSet<Student>(comp);//创建容器
				try{
					bufr = new BufferedReader(new InputStreamReader(System.in));//获取键盘录入
					
					String line = null;//读取键盘录入
					while((line=bufr.readLine())!=null){
						if("over".equals(line))
							break;
						String [] arr = line.split(",");
						//封装到对象中
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
							throw new RuntimeException("关闭失败");
						}
					}
				}
				return stuSet;
	}
	/*
	 * 将集合中的数据写入到一个文件中
	 */
	public static void writeFile(Set<Student> set,File dest) throws IOException{
		BufferedWriter bufw = null;
		try{
			bufw = new BufferedWriter(new FileWriter(dest));
			//遍历集合
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
				throw new RuntimeException("关闭失败");
			}
		}

	}

		
}
