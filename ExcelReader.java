import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        String excelPath = "TestData/loginData.xlsx"; // relative to project root

        FileInputStream file = new FileInputStream(new File(excelPath));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0); // First sheet

        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Total Rows: " + rowCount);

        for (int i = 1; i < rowCount; i++) { // Start from 1 to skip header
            Row row = sheet.getRow(i);
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();
            System.out.println("Username: " + username + ", Password: " + password);
        }

        workbook.close();
        file.close();
    }
}
