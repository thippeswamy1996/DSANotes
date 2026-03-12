import java.io.*;
import java.util.*;
public class FileWriterDemo{
	public static void main(String[] args) throws Exception{
		
		FileWriter fr = new FileWriter("FileDemo.txt");
		BufferedWriter bw = new BufferedWriter(fr);
		bw.write(100);
		bw.newLine();
		char ch []={'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("Hi Thippes wellcome");
		bw.newLine();
		bw.flush();
		bw.close();
		System.out.println("Successfully written contenet in to a file");
		
	}
}