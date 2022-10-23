package Base;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ToolsExcelReader {
    File file;
    FileInputStream fis;
    XSSFWorkbook wd;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    public ToolsExcelReader(String filePath) throws IOException {
        file = new File(filePath);
        fis = new FileInputStream(file);
        wd = new XSSFWorkbook(fis);
    }

    public String getStringData (String sheetName, int rowNumber, int cellNumber) {
        sheet = wd.getSheet(sheetName);
        row = sheet.getRow(rowNumber);
        cell = row.getCell(cellNumber);
        return cell.getStringCellValue();
    }

    public int getIntegerData (String sheetName, int rowNumber, int cellNumber) {
        sheet = wd.getSheet(sheetName);
        row = sheet.getRow(rowNumber);
        cell = row.getCell(cellNumber);
        return (int) cell.getNumericCellValue();
    }

    public int getLastRow(String sheet) {
        this.sheet = wd.getSheet(sheet);
        return this.sheet.getLastRowNum();
    }
}
