package utl;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

import static java.io.File.separator;

/**
 * @author phantom
 * @Description
 * @date 2018/12/25/025
 */
public class Temp {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + separator + "学生信息" + separator + "2018" + separator + "学生统报数据查看.xls";
        File file = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet("港澳台学生");
            for (int i = 0; i < sheet.getRows(); i++) {
                System.out.println(sheet.getCell(0,i).getContents());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

}
