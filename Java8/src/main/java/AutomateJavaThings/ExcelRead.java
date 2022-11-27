package AutomateJavaThings;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
  public static void main(String[] args) {

    FileInputStream file;

    {
      try {
        file = new FileInputStream("C:\\Users\\KuldeepB\\ExcelRead.xlsx");

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

        Iterator<Row> rowIterator = xssfSheet.iterator();

        while (rowIterator.hasNext()) {
          Row row = rowIterator.next();
          Iterator<Cell> cellIterator = row.cellIterator();

          while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();

            switch (cell.getCellType()) {
              case Cell.CELL_TYPE_STRING:
                System.out.println(cell.getStringCellValue() + "\t");
                break;
            }
          }
          System.out.println();
        }
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}