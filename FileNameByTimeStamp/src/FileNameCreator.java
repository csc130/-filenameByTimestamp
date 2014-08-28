import java.io.PrintWriter;
import java.util.Date;


public class FileNameCreator {
	public static void main(String [] args) {
		Date date = new Date();
		System.out.println(date);
		String fileName = "receipt/"+(date+"").replace(':','_');
		PrintWriter output;
		try {
			output = new PrintWriter(fileName);
			output.println(date);
			output.println("COKE");
			output.close();
		}catch (Exception e) {
			System.out.print("File not found.");
		}
	}
}
