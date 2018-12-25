package utl;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.io.File.separator;

/**
 * @author phantom
 * @Description 解析学生信息文件下的数据
 * @date 2018/12/23/023
 */
public class ParseStudents {

    private String studentDataPath;

    /**List of storage years information*/
    private List<String> years;

    /**set of names*/
    private Set<String> names;

    /**the information of gangAoTai students*/
    private Map<String,String[]> gangAoTai;

    /**the information of huaQiao students*/
    private Map<String,String[]> huaQiao;

    /**the information of TaiWan students*/
    private Map<String,String[]> taiWan;

    /**the information of waiGuo students*/
    private Map<String,String[]> waiGuo;

    /**the information of shaoshuminzu students*/
    private Map<String,String[]> shaoshuminzu;

    /**the information of shaoshuminzuban students*/
    private Map<String,String[]> shaoshuminzuban;

    /**the information of zaixiao students*/
    private Map<String,String[]> zaixiao;


    public ParseStudents(){
        years = parseExcelsGetYears();
        names = parseExcelsGetNames();
        initiaMap();
    }

    private void initiaMap(){
        String[] tempArray = {"0", "0"};
        String[] tempArray2 = {"0", "0", "0", "0", "0"};
        String[] tempArray3 = {"0", "0", "0", "0", "0","0","0","0"};
        gangAoTai = new HashMap<String, String[]>();
        gangAoTai.put("博士研究生", tempArray);
        gangAoTai.put("硕士研究生", tempArray);
        gangAoTai.put("本科生", tempArray);
        gangAoTai.put("进修生", tempArray);
        gangAoTai.put("短期培训生", tempArray);
        gangAoTai.put("旁听生", tempArray);
        gangAoTai.put("补习生", tempArray);
        gangAoTai.put("预科生", tempArray);
        gangAoTai.put("其他", tempArray);
        gangAoTai.put("总计", tempArray);
        huaQiao = new HashMap<String, String[]>();
        huaQiao.put("博士研究生", tempArray);
        huaQiao.put("硕士研究生", tempArray);
        huaQiao.put("本科生", tempArray);
        huaQiao.put("进修生", tempArray);
        huaQiao.put("短期培训生", tempArray);
        huaQiao.put("旁听生", tempArray);
        huaQiao.put("补习生", tempArray);
        huaQiao.put("预科生", tempArray);
        huaQiao.put("其他", tempArray);
        huaQiao.put("总计", tempArray);
        taiWan = new HashMap<String, String[]>();
        taiWan.put("博士研究生", tempArray);
        taiWan.put("硕士研究生", tempArray);
        taiWan.put("本科生", tempArray);
        taiWan.put("进修生", tempArray);
        taiWan.put("短期培训生", tempArray);
        taiWan.put("旁听生", tempArray);
        taiWan.put("补习生", tempArray);
        taiWan.put("预科生", tempArray);
        taiWan.put("其他", tempArray);
        taiWan.put("总计", tempArray);
        waiGuo = new HashMap<String, String[]>();
        waiGuo.put("博士研究生", tempArray);
        waiGuo.put("硕士研究生", tempArray);
        waiGuo.put("本科生", tempArray);
        waiGuo.put("进修生", tempArray);
        waiGuo.put("短期培训生", tempArray);
        waiGuo.put("旁听生", tempArray);
        waiGuo.put("补习生", tempArray);
        waiGuo.put("预科生", tempArray);
        waiGuo.put("其他", tempArray);
        waiGuo.put("总计", tempArray);
        shaoshuminzu = new HashMap<String, String[]>();
        shaoshuminzu.put("回族", tempArray2);
        shaoshuminzu.put("满族", tempArray2);
        shaoshuminzu.put("蒙古族", tempArray2);
        shaoshuminzu.put("藏族", tempArray2);
        shaoshuminzu.put("维吾尔族", tempArray2);
        shaoshuminzu.put("哈萨克族", tempArray2);
        shaoshuminzu.put("壮族", tempArray2);
        shaoshuminzu.put("朝鲜族", tempArray2);
        shaoshuminzu.put("苗族", tempArray2);
        shaoshuminzu.put("其他少数民族", tempArray2);
        shaoshuminzu.put("总计", tempArray2);
        shaoshuminzuban = new HashMap<String, String[]>();
        shaoshuminzuban.put("回族", tempArray3);
        shaoshuminzuban.put("满族", tempArray3);
        shaoshuminzuban.put("蒙古族", tempArray3);
        shaoshuminzuban.put("藏族", tempArray3);
        shaoshuminzuban.put("维吾尔族", tempArray3);
        shaoshuminzuban.put("哈萨克族", tempArray3);
        shaoshuminzuban.put("壮族", tempArray3);
        shaoshuminzuban.put("朝鲜族", tempArray3);
        shaoshuminzuban.put("苗族", tempArray3);
        shaoshuminzuban.put("其他少数民族", tempArray3);
        shaoshuminzuban.put("总计", tempArray3);
        zaixiao = new HashMap<String, String[]>();
        zaixiao.put("统计", tempArray2);
    }


    /**
     * get years by parsing excels
     * @return the list of years
     */
    private List<String> parseExcelsGetYears(){
        studentDataPath = System.getProperty("user.dir") + separator + "学生信息";
        File studentDir = new File(studentDataPath);
        return Arrays.asList(studentDir.list());
    }

    /**
     * get names of schools
     * @return the list of names
     */
    private Set<String> parseExcelsGetNames(){
        Set<String> tempSet = new HashSet<String>();
        /**traverse the list of years*/
        for (int i = 0; i < years.size(); i++) {
            String yearsPath = studentDataPath + separator + years.get(i);
            File tempDir = new File(yearsPath);
            String[] tempFiles = tempDir.list();
            for (int j = 0; j < tempFiles.length; j++) {
                String[] tempStr = tempFiles[j].split("\\.");
                tempSet.add(tempStr[1]);
            }
        }
        return tempSet;
    }


    /**
     * get the information of GangaoTai students according to selected year and organization
     * @param year selected year
     * @param organization selected organization
     * @return a map that includes the information of GangaoTai students
     */
    public Map<String, String[]> getGangAoTaiInfo(String year, String organization){
        /**Once invoke this method, we must initialise the gangAoTai map */
        gangAoTai.clear();

        String dir = "";
        boolean isAllYears = false;
        boolean isAllNames = false;
        /**decide the number of dirs that are going to traverse*/
        if (year.equals("全部")){
            isAllYears = true;
            dir = studentDataPath;
        }else {
            dir = studentDataPath + separator + year;
        }

        if (organization.equals("全部")){
            isAllNames = true;
        }
        if (isAllYears){
            for (int i = 0; i < years.size(); i++) {
                String tempYearDir = studentDataPath + separator + years.get(i);
                String[] schoolsInfoFileNames = new File(tempYearDir).list();
                if (isAllNames){
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        calculateGangAoTai(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateGangAoTai(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateGangAoTai(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateGangAoTai(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return gangAoTai;
    }

    /**
     * calculate the data of GangAoTai
     * @param path path of files
     */
    private void calculateGangAoTai(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("港澳台学生");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (gangAoTai.containsKey(tempStr)){
                    String[] tempArray = gangAoTai.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                    }
                    gangAoTai.put(tempStr,tempArray);
                }else {
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }


    /**
     * get the list of years
     * @return the list
     */
    public List<String> getYears() {
        years.add("全部");
        return years;
    }

    /**
     * get the set of names
     * @return the list of names
     */
    public Set<String> getNames() {
        names.add("全部");
        return names;
    }

    public static void main(String[] args) {
        ParseStudents parseStudents = new ParseStudents();
    }
}
