import java.io.*;
import java.util.*;
public class ArrListWOrdsWritedemo 
{
	public static void main(String[] args)
	throws Exception{
		PrintWriter pw = new PrintWriter("DemoWriter.txt");
		char ch='d';
		pw.write(ch);
		pw.write("\n");
		pw.write(100);
		pw.println(100);
		pw.println(200);
		pw.flush();
		pw.close();
		System.out.println("success");
		
	}
	}