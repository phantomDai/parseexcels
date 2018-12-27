package utl;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.io.File.separator;

/**
 * @author phantom
 * @Description
 * @date 2018/12/25/025
 */
public class Temp {

    public static void main(String[] args) {
//        String path = System.getProperty("user.dir") + separator + "学生信息" + separator + "2018" + separator + "33333.北京科技大学.xls";
//        File file = new File(path);
//        try {
//            Workbook workbook = Workbook.getWorkbook(file);
//            Sheet sheet = workbook.getSheet("在校学生");
//            for (int i = 1; i < 6; i++) {
//                System.out.println(sheet.getCell(i,5).getContents());
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//       } catch (BiffException e) {
//           e.printStackTrace();
//       }

//        ParseStudents parseStudents = new ParseStudents();
//        Map<String, String[]> map = parseStudents.getZaiXiaoData("2018", "北京科技大学");
//        for (Map.Entry<String, String[]> entry : map.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + " " + entry.getValue()[0] +
//                " " + entry.getValue()[1]+ " " + entry.getValue()[2]+ " " + entry.getValue()[3]+ " " + entry.getValue()[4]);
//        }

        ParseStudents parseStudents = new ParseStudents();
        List<String> tempList = parseStudents.getYears();
        for (int i = 0; i < tempList.size(); i++) {
            System.out.println(tempList.get(i));
        }
    }
}
