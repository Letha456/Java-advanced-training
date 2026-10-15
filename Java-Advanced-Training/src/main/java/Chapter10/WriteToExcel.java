package Chapter10;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/15/2026
 **/

public class WriteToExcel {
    public static void main(String[] args) {
        String filePath = "src/main/resources/Cities.xlsx";
        try {
            OutputStream fileWriter = new FileOutputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Cities");
            XSSFRow header = sheet.createRow(0);
            header.createCell(0).setCellValue("City");
            header.createCell(0).setCellValue("Population");

            XSSFRow row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Centurion");
            row1.createCell(1).setCellValue(500000);

            XSSFRow row2 = sheet.createRow(1);
            row2.createCell(0).setCellValue("Midrand");
            row2.createCell(1).setCellValue(150000);

            workbook.write(fileWriter);
            fileWriter.close();
            workbook.close();

        } catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
