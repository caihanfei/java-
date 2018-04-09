package fanshe;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class 反射技术的应用 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 笔记本电脑使用usb设备
		 */
		Notebook book = new Notebook();
		book.run();
		
		
		File propertiesFile = new File("usb.properties");
		FileInputStream fis = new FileInputStream(propertiesFile);
		Properties prop = new Properties();
		
		prop.load(fis);
		
		for(int x=1;x<=prop.size();x++){
			String className = prop.getProperty("usb"+x);
			Class clazz = Class.forName(className);
			USB usb = (USB)clazz.newInstance();
			book.useUSb(usb);
		}
		fis.close();
	}

}
