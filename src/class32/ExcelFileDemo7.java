package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelFileDemo7 {
    public static void main(String[] args) throws IOException {
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        int noOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        List<Map<String,String>> excelData=new ArrayList<>();
        for (int i = 1; i <noOfRows ; i++) {
            Row row=sheet2.getRow(i);
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
          rowMap.put("UserName",row.getCell(0).toString());
          rowMap.put("Password",row.getCell(1).toString());
          excelData.add(rowMap);
        }

        System.out.println(excelData);
    }
}
