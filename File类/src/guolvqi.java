import java.io.File;
import java.io.FilenameFilter;

public class guolvqi implements FilenameFilter {
	private String arg1;
	@Override
	public boolean accept(File f, String name) {
		
		return name.endsWith(arg1);
	}
	public guolvqi(String arg1) {
		super(); 
		this.arg1 = arg1;
		
		// TODO Auto-generated constructor stub
	}
	
	//¹ýÂËÆ÷

}
