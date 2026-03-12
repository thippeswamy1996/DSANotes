import java.io.File;

public class Tests {
    public static void main(String[] args) {
        File f = new File("D:\\resume\\Testing 3+ years resume\\ATS 100\\Updated CV");
        
        String[] fileList = f.list();
        if (fileList == null) {
            System.out.println("Directory not found or it's empty.");
            return;
        }

        int count = 0;
        for (String s : fileList) {
            File fs = new File(f, s);
            if (fs.isFile()) {
              //  System.out.println(s);
                count++;
            }
			else
				
			{
				
				System.out.println(s);
			}
        }

        System.out.println("Total files: " + count);
    }
}
