package data;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Write{
	public static void main(String[] args)throws Exception 
	{
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet= wb.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("username");
		sheet.getRow(0).createCell(1).setCellValue("sony");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("password");
		sheet.getRow(1).createCell(1).setCellValue("sony@123");
		System.out.println("success");
		File f=new File("C:\\Users\\smenda1\\Downloads\\Excelwrite.ods.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();

		}
}
