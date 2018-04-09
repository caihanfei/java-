package 学生信息管理练习;
								//此接口建立学生的自然排序						
public class Student implements Comparable<Student>{
	private String name;
	private int ma,ch,en;
	private int sum;
	public Student() {
		super();
	}
	public Student(String name, int ma, int ch, int en) {
		super();
		this.name = name;
		this.ma = ma;
		this.ch = ch;
		this.en = en;
		this.sum =ma+ch+en;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	/*
	 * 覆盖compareTo方法，建立学生的比较方式。按照总分从小到大排序
	 */
	public int compareTo(Student stu){
		int temp = this.sum-stu.sum;
		return temp==0?this.name.compareTo(stu.name):temp;
		
	}
}
