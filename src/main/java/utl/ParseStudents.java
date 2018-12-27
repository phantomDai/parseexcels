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
 * @Description
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
        iniGangAoTai();
        iniHuaQiao();
        iniTaiWan();
        iniWaiGuo();
        iniShaoShuMinZu();
        iniShaoShuMinZuBan();
        iniZaiXiao();
    }

    private void iniZaiXiao() {
        zaixiao = new HashMap<String, String[]>();
        zaixiao.put("统计", new String[] {"0", "0", "0", "0", "0"});
    }

    private void iniShaoShuMinZuBan() {
        shaoshuminzuban = new HashMap<String, String[]>();
        shaoshuminzuban.put("回族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("满族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("蒙古族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("藏族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("维吾尔族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("哈萨克族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("壮族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("朝鲜族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("苗族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("其他少数民族", new String[] {"0", "0", "0", "0", "0","0","0","0"});
        shaoshuminzuban.put("总计", new String[] {"0", "0", "0", "0", "0","0","0","0"});
    }

    private void iniShaoShuMinZu() {
        shaoshuminzu = new HashMap<String, String[]>();
        shaoshuminzu.put("回族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("满族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("蒙古族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("藏族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("维吾尔族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("哈萨克族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("壮族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("朝鲜族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("苗族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("其他少数民族", new String[] {"0", "0", "0", "0", "0"});
        shaoshuminzu.put("总计", new String[] {"0", "0", "0", "0", "0"});
    }

    private void iniWaiGuo() {
        waiGuo = new HashMap<String, String[]>();
        waiGuo.put("博士研究生", new String[] {"0", "0"});
        waiGuo.put("硕士研究生", new String[] {"0", "0"});
        waiGuo.put("本科生", new String[] {"0", "0"});
        waiGuo.put("进修生", new String[] {"0", "0"});
        waiGuo.put("短期培训生", new String[] {"0", "0"});
        waiGuo.put("旁听生", new String[] {"0", "0"});
        waiGuo.put("补习生", new String[] {"0", "0"});
        waiGuo.put("预科生", new String[] {"0", "0"});
        waiGuo.put("其他", new String[] {"0", "0"});
        waiGuo.put("总计", new String[] {"0", "0"});
    }

    private void iniTaiWan() {
        taiWan = new HashMap<String, String[]>();
        taiWan.put("博士研究生", new String[] {"0", "0"});
        taiWan.put("硕士研究生", new String[] {"0", "0"});
        taiWan.put("本科生", new String[] {"0", "0"});
        taiWan.put("进修生", new String[] {"0", "0"});
        taiWan.put("短期培训生", new String[] {"0", "0"});
        taiWan.put("旁听生", new String[] {"0", "0"});
        taiWan.put("补习生", new String[] {"0", "0"});
        taiWan.put("预科生", new String[] {"0", "0"});
        taiWan.put("其他", new String[] {"0", "0"});
        taiWan.put("总计", new String[] {"0", "0"});
    }

    private void iniHuaQiao() {
        huaQiao = new HashMap<String, String[]>();
        huaQiao.put("博士研究生", new String[] {"0", "0"});
        huaQiao.put("硕士研究生", new String[] {"0", "0"});
        huaQiao.put("本科生", new String[] {"0", "0"});
        huaQiao.put("进修生", new String[] {"0", "0"});
        huaQiao.put("短期培训生", new String[] {"0", "0"});
        huaQiao.put("旁听生", new String[] {"0", "0"});
        huaQiao.put("补习生", new String[] {"0", "0"});
        huaQiao.put("预科生", new String[] {"0", "0"});
        huaQiao.put("其他", new String[] {"0", "0"});
        huaQiao.put("总计", new String[] {"0", "0"});
    }

    private void iniGangAoTai() {
        gangAoTai = new HashMap<String, String[]>();
        gangAoTai.put("博士研究生", new String[] {"0", "0"});
        gangAoTai.put("硕士研究生", new String[] {"0", "0"});
        gangAoTai.put("本科生", new String[] {"0", "0"});
        gangAoTai.put("进修生", new String[] {"0", "0"});
        gangAoTai.put("短期培训生", new String[] {"0", "0"});
        gangAoTai.put("旁听生", new String[] {"0", "0"});
        gangAoTai.put("补习生", new String[] {"0", "0"});
        gangAoTai.put("预科生", new String[] {"0", "0"});
        gangAoTai.put("其他", new String[] {"0", "0"});
        gangAoTai.put("总计", new String[] {"0", "0"});
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
    public Map<String, String[]> getGangAoTaiData(String year, String organization){
        /**Once invoke this method, we must initialise the gangAoTai map */
        iniGangAoTai();

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
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
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

    public Map<String, String[]> getHuaQiaoData(String year, String organization){
        /**Once invoke this method, we must initialise the gangAoTai map */
        iniHuaQiao();
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
                        calculateHuaQiao(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateHuaQiao(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateHuaQiao(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateHuaQiao(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return huaQiao;

    }

    private void calculateHuaQiao(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("华侨学生");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (huaQiao.containsKey(tempStr)){
                    String[] tempArray = huaQiao.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    huaQiao.put(tempStr,tempArray);
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

    public Map<String, String[]> getTaiWanData(String year, String organization){
        /**Once invoke this method, we must initialise the gangAoTai map */
        iniTaiWan();
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
                        calculateTaiWan(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateTaiWan(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateTaiWan(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateTaiWan(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return taiWan;

    }

    private void calculateTaiWan(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("台湾学生");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (taiWan.containsKey(tempStr)){
                    String[] tempArray = taiWan.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    taiWan.put(tempStr,tempArray);
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

    public Map<String, String[]> getWaiGuoData(String year, String organization){
        /**Once invoke this method, we must initialise the gangAoTai map */
        iniWaiGuo();
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
                        calculateWaiGuo(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateWaiGuo(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateWaiGuo(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateWaiGuo(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return waiGuo;

    }

    private void calculateWaiGuo(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("外国留学生");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (waiGuo.containsKey(tempStr)){
                    String[] tempArray = waiGuo.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    waiGuo.put(tempStr,tempArray);
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

    public Map<String, String[]> getShaoShuMinZuData(String year, String organization){
        /**Once invoke this method, we must initialise the gangAoTai map */
        iniShaoShuMinZu();
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
                        calculateShaoShuMinZu(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateShaoShuMinZu(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateShaoShuMinZu(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateShaoShuMinZu(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return shaoshuminzu;

    }

    private void calculateShaoShuMinZu(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("少数民族学生");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (shaoshuminzu.containsKey(tempStr)){
                    String[] tempArray = shaoshuminzu.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    shaoshuminzu.put(tempStr,tempArray);
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

    public Map<String, String[]> getShaoShuMinZuBanData(String year, String organization){
        /**Once invoke this method, we must initialise the gangAoTai map */
        iniShaoShuMinZuBan();
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
                        calculateShaoShuMinZuBan(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateShaoShuMinZuBan(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateShaoShuMinZuBan(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateShaoShuMinZuBan(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return shaoshuminzuban;

    }

    private void calculateShaoShuMinZuBan(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("少数民族班");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (shaoshuminzuban.containsKey(tempStr)){
                    String[] tempArray = shaoshuminzuban.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    shaoshuminzuban.put(tempStr,tempArray);
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

    public Map<String, String[]> getZaiXiaoData(String year, String organization){
        /**Once invoke this method, we must initialise the gangAoTai map */
        iniZaiXiao();
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
                        calculateZaiXiao(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateZaiXiao(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateZaiXiao(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateZaiXiao(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return zaixiao;

    }

    private void calculateZaiXiao(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("在校学生");
            String[] tempArray = zaixiao.get("统计");
            for (int i = 1; i < tempArray.length + 1; i++) {
                if (tempSheet.getCell(i,5).getContents().equals("")){
                    tempArray[i - 1] = String.valueOf(Integer.parseInt(tempArray[i - 1]) + 0);
                }else {
                    tempArray[i - 1] = String.valueOf(Integer.parseInt(tempArray[i - 1]) +
                            Integer.parseInt(tempSheet.getCell(i,5).getContents()));
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
        return years;
    }

    /**
     * get the set of names
     * @return the list of names
     */
    public Set<String> getNames() {
        return names;
    }

    public static void main(String[] args) {
        ParseStudents parseStudents = new ParseStudents();
    }
}
