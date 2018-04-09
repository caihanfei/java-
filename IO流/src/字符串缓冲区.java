import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class ×Ö·û´®»º³åÇø {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("demo21.txt");
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write("caihanfeicaihanfei");
		bf.flush();
		bf.close();
	}
}
