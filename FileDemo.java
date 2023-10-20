package Exception2;
import java.io.*;
public class FileDemo {
	public static void main (String[] args) throws IOException {
	
		File f = new File("C:\\Users\\Madhu\\Desktop\\mugi.txt");
		
		FileReader fr = new FileReader(f);//checkedException file not found exception
		
		int temp = 0;
		while((temp=fr.read())!=0) {
			System.out.print((char)(temp));//ioException
		}
	
    }

}
