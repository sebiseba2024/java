package ro.ulbs.paradigme.lab8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.TreeMap;

public class Scriere {
    public static void main(String[] args) {
        XSSFWorkbook workbook2 = new XSSFWorkbook();
        XSSFSheet sheet2 = workbook2.createSheet();
        XSSFCellStyle greenCellStyle = workbook2.createCellStyle();
        greenCellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        greenCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        Row row = sheet2.createRow(0);
        row.createCell(0).setCellValue("Name");
        row.getCell(0).setCellStyle(greenCellStyle);
        row.createCell(1).setCellValue("Surname");
        row.getCell(1).setCellStyle(greenCellStyle);
        row.createCell(2).setCellValue("Grade 1");
        row.getCell(2).setCellStyle(greenCellStyle);
        row.createCell(3).setCellValue("Grade 2");
        row.getCell(3).setCellStyle(greenCellStyle);
        row.createCell(4).setCellValue("Grade 3");
        row.getCell(4).setCellStyle(greenCellStyle);
        row.createCell(5).setCellValue("Grade 4");
        row.getCell(5).setCellStyle(greenCellStyle);
        row.createCell(6).setCellValue("Max");
        row.getCell(6).setCellStyle(greenCellStyle);
        row.createCell(7).setCellValue("Average");
        row.getCell(7).setCellStyle(greenCellStyle);

        // Create a map to hold the data
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("2", new Object[] {"Amit", "Shukla", 9,8,7,5});
        data.put("3", new Object[] {"Lokesh", "Gupta", 8,9,6,7});
        data.put("4", new Object[] {"John", "Adwards", 8,8,7,6 });
        data.put("5", new Object[] {"Brian", "Schultz", 7,6,8,9});

        // Iterate over the map and create rows in the sheet
        int rownum = 1;
        for (Map.Entry<String, Object[]> entry : data.entrySet()) {
            Row row2 = sheet2.createRow(rownum++);
            Object[] objArr = entry.getValue();
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row2.createCell(cellnum++);
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer) obj);
                }
            }
        }
        // Calculate max and average
        XSSFFont font = workbook2.createFont();
        for (int i = 1; i <= data.size(); i++) {
            Row row3 = sheet2.getRow(i);
            int max = Math.max(Math.max(Math.max((int) row3.getCell(2).getNumericCellValue(),
                    (int) row3.getCell(3).getNumericCellValue()),
                    (int) row3.getCell(4).getNumericCellValue()),
                    (int) row3.getCell(5).getNumericCellValue());
            double average = ((int) row3.getCell(2).getNumericCellValue() +
                    (int) row3.getCell(3).getNumericCellValue() +
                    (int) row3.getCell(4).getNumericCellValue() +
                    (int) row3.getCell(5).getNumericCellValue()) / 4.0;
            row3.createCell(6).setCellValue(max);
            row3.createCell(7).setCellValue(average);
        }

        try {
            FileOutputStream out = new FileOutputStream("laborator8_output.xlsx");
            workbook2.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
