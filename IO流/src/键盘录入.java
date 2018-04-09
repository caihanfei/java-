import java.io.IOException;
import java.io.InputStream;

public class 键盘录入 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		key();
	}

	public static void key() throws IOException {
		InputStream is = System.in;
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while((ch=is.read())!=-1){
			if(ch=='\r')
				continue;
			if(ch=='\n'){
				 String s = sb.toString();
				 if("over".equals(s))
					 break;
				 else
				 System.out.println(s.toUpperCase());
				 sb.delete(0, sb.length());
			}
			else
			sb.append((char)ch);
		}
		
		
		
	}

}
//BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
//PrintWriter out = new PrintWriter(System.out) 打印流 调用out.write和out.flush
//转换流应用。
		/*	InputStream is = System.in;
		 *  InputStreamReader isr = new InputStreamReader(is);
		 *  BufferedReader bf = new BufferedReader(isr);
		 *  String line = null;
		 *  while((line = bf.readLine())!=null){
		 *  if("over".equals(line))
		 *  	break;
		 *  System.out.println(line.toUpperCase());
		 * }
		 */