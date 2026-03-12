import java.io.*;

public class CreateaFile {
    public static void main(String[] args) throws IOException {
        // File path
        String filePath = "C:\\xampp\\htdocs\\FrontEndProject\\java\\Practicejava\\abcd.txt";

        // Write to file
        FileWriter fw = new FileWriter(filePath,false);
        fw.write(100); 
		fw.write('\n');
		fw.write("durga\nSolutions"); 
		fw.write('\n');
        char[] ch={'a','b','c','d'};
         fw.write(ch);
           fw.write('\n');
            fw.flush();		   
         
		 // writing a single character
        fw.close();             // important: flush and close the stream

        // File object for metadata
        File file = new File(filePath);

        // Print file name
        System.out.println("File Name: " + file.getName());

        // Read and print file content
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        System.out.println("File Content:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // Close reader
        br.close();
        fr.close();
    }
}
