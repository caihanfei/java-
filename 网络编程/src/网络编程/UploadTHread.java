package 网络编程;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadTHread implements Runnable {
	private Socket s;
	public UploadTHread(Socket s) {
		super();
		this.s = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String ip = s.getInetAddress().getHostAddress();
		System.out.println("....connect");
		//读取数据。网络
		try{
		InputStream in = s.getInputStream();
		File dir = new File("c:\\pic");
		if(!dir.exists())
			dir.mkdirs();
		int count = 1;
		File file = new File(dir,ip+".jpg");
		while(file.exists()){
			file = new File(dir,ip+"("+(count++)+").jpg");
		}
		//目的： 文件
		FileOutputStream fos = new FileOutputStream(file);
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=in.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		OutputStream out = s.getOutputStream();
		out.write("上传成功".getBytes());
		
		fos.close();
		s.close();
		}
		catch(IOException e){
			
		}
	}


}
