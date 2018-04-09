import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class 获取系统属性集与Runtime类 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pro = System.getProperties();//把系统信息放在Properties集合中
		//获取该集合中的信息，先将其转为set集合。
		Set<String> nameset = pro.stringPropertyNames();
		for(String name :nameset){
			String value = pro.getProperty(name);
			System.out.println(name+"::::"+value);
			
		}
		System.out.println();
		System.out.println();
		String a = pro.getProperty("os.name");
		System.out.println(a);
		//Runtime类不能被实例化 只能用getRuntime方法获取
		Runtime run = Runtime.getRuntime();
		//run.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe");//用该方法可以直接打开程序
	}

}
