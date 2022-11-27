package AutomateJavaThings;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

//  XSSFWorkbook workbook = new XSSFWorkbook();
//  XSSFSheet xssfSheet = workbook.createSheet("Empoloyee Details");
//
//  Map<String ,Object[]> data = new TreeMap<String, Object[]>();

  public static void main(String[] args) {
    Random random = new Random();
    for(int i = 1; i < 10 ; i++){
      long number = (long) Math. floor(Math. random() * 9_000_000_000L) + 1_000_000_000L;
      System.out.println("r = " + number);
    }
  }
}
