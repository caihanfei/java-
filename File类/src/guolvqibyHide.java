import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class guolvqibyHide implements FileFilter {

	@Override
	public boolean accept(File f) {
		
		return f.isHidden();
	}

}
