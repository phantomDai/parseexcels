package utl;

import jxl.Workbook;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static java.io.File.separator;

/**
 * describe:
 *
 * @author phantom
 * @date 2018/12/28
 */
public class OutPutExcel {
    private String outDir;

    private static final String[] NAMESOFORGANIZATION = {"民族党派组织成员状况","民族党派组织发展状况","高级知识分子状况",
            "实职干部安排状况","党外局级以上领导干部（实职）情况","民族党派组织机构状况"};

    public void OutPutExcel(){
        outDir = System.getProperty("user.dir") + separator + "导出文件";
    }

    public void outputFile(Map<String,String[]> minzudangpaizuzhijigou,Map<String,String[]> minzudangpaichengyuan,
                           Map<String,String[]> minzudangpaizuzhifazhan,Map<String,String[]> gaojizhishifenzi,Map<String,String[]> shizhiganbushuju,
                           List<List<String>> dangwaijujishuju){


        long time = System.currentTimeMillis();
        String path = outDir + separator + "党派组织信息_" + String.valueOf(time);
        File file = new File(path);

        try {
            WritableWorkbook writableWorkbook = Workbook.createWorkbook(file);



        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
