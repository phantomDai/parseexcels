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
 * @Description get data of organizations
 * @date 2018/12/26/026
 */
public class ParseOrganization {

    private String studentDataPath;

    /**List of storage years information*/
    private List<String> years;

    /**set of names*/
    private Set<String> names;

    private Map<String,String[]> minzudangpaizuzhijigou;

    private Map<String,String[]> minzudangpaichengyuan;

    private Map<String,String[]> minzudangpaizuzhifazhan;

    private Map<String,String[]> gaojizhishi;

    private Map<String,String[]> shizhiganbu;

    private List<List<String>> dangwaijuji;


    public ParseOrganization(){
        iniMap();
        years = parseExcelsGetYears();
        names = parseExcelsGetNames();
    }

    private void iniMap(){

        iniMinZuDangPaiZuZhiJiGou();

        iniMinZuDangPaiChengYuan();

        iniMinZuDangPaiZuZhiFaZhan();

        iniGaoJiZhiShi();

        iniShiZhiGanBu();

        iniDangWaiJuJi();


    }

    private void iniMinZuDangPaiZuZhiJiGou() {
        minzudangpaizuzhijigou = new HashMap<String, String[]>();
        minzudangpaizuzhijigou.put("民革", new String[] {"0","0","0","0","0","0"});
        minzudangpaizuzhijigou.put("民盟", new String[] {"0","0","0","0","0","0"});
        minzudangpaizuzhijigou.put("民建", new String[] {"0","0","0","0","0","0"});
        minzudangpaizuzhijigou.put("民进", new String[] {"0","0","0","0","0","0"});
        minzudangpaizuzhijigou.put("农工", new String[] {"0","0","0","0","0","0"});
        minzudangpaizuzhijigou.put("致公党", new String[] {"0","0","0","0","0","0"});
        minzudangpaizuzhijigou.put("九三", new String[] {"0","0","0","0","0","0"});
        minzudangpaizuzhijigou.put("台盟", new String[] {"0","0","0","0","0","0"});
        minzudangpaizuzhijigou.put("总计", new String[] {"0","0","0","0","0","0"});
    }

    private void iniMinZuDangPaiChengYuan() {
        minzudangpaichengyuan = new HashMap<String, String[]>();
        minzudangpaichengyuan.put("民革", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaichengyuan.put("民盟", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaichengyuan.put("民建", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaichengyuan.put("民进", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaichengyuan.put("农工", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaichengyuan.put("致公党", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaichengyuan.put("九三", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaichengyuan.put("台盟", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaichengyuan.put("总计", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
    }

    private void iniMinZuDangPaiZuZhiFaZhan() {
        minzudangpaizuzhifazhan = new HashMap<String, String[]>();

        minzudangpaizuzhifazhan.put("民革", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaizuzhifazhan.put("民盟", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaizuzhifazhan.put("民建", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaizuzhifazhan.put("民进", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaizuzhifazhan.put("农工", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaizuzhifazhan.put("致公党", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaizuzhifazhan.put("九三", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaizuzhifazhan.put("台盟", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        minzudangpaizuzhifazhan.put("总计", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
    }

    private void iniGaoJiZhiShi() {
        gaojizhishi = new HashMap<String, String[]>();

        gaojizhishi.put("29岁以下", new String[] {"0","0","0","0","0","0","0","0","0","0","0"});
        gaojizhishi.put("30--39岁", new String[] {"0","0","0","0","0","0","0","0","0","0","0"});
        gaojizhishi.put("40—49岁", new String[] {"0","0","0","0","0","0","0","0","0","0","0"});
        gaojizhishi.put("50—59岁", new String[] {"0","0","0","0","0","0","0","0","0","0","0"});
        gaojizhishi.put("60岁以上", new String[] {"0","0","0","0","0","0","0","0","0","0","0"});
        gaojizhishi.put("总计", new String[] {"0","0","0","0","0","0","0","0","0","0","0"});
    }

    private void iniShiZhiGanBu() {
        shizhiganbu = new HashMap<String, String[]>();
        shizhiganbu.put("担任处级职务", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        shizhiganbu.put("担任局级以上领导职务", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
        shizhiganbu.put("总计", new String[] {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"});
    }

    private void iniDangWaiJuJi() {
        dangwaijuji = new ArrayList<List<String>>();
    }


    /**
     * get years by parsing excels
     * @return the list of years
     */
    private List<String> parseExcelsGetYears(){
        studentDataPath = System.getProperty("user.dir") + separator + "党组织信息";
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


    public Map<String, String[]> getMinzudangpaizuzhijigouData(String year, String organization){
        iniMinZuDangPaiZuZhiJiGou();

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
                        calculateMinzudangpaizuzhijigou(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateMinzudangpaizuzhijigou(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateMinzudangpaizuzhijigou(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateMinzudangpaizuzhijigou(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return minzudangpaizuzhijigou;
    }

    private void calculateMinzudangpaizuzhijigou(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("民主党派组织机构状况");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (minzudangpaizuzhijigou.containsKey(tempStr)){
                    String[] tempArray = minzudangpaizuzhijigou.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    minzudangpaizuzhijigou.put(tempStr,tempArray);
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

    public Map<String, String[]> getMinzudangpaichengyuanData(String year, String organization){
        iniMinZuDangPaiChengYuan();

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
                        calculateMinzudangpaichengyuan(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateMinzudangpaichengyuan(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateMinzudangpaichengyuan(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateMinzudangpaichengyuan(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return minzudangpaichengyuan;
    }

    private void calculateMinzudangpaichengyuan(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("民主党派成员状况");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (minzudangpaichengyuan.containsKey(tempStr)){
                    String[] tempArray = minzudangpaichengyuan.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    minzudangpaichengyuan.put(tempStr,tempArray);
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

    public Map<String, String[]> getMinzudangpaizuzhifazhanData(String year, String organization){
        iniMinZuDangPaiZuZhiFaZhan();

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
                        calculateMinzudangpaizuzhifazhan(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateMinzudangpaizuzhifazhan(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateMinzudangpaizuzhifazhan(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateMinzudangpaizuzhifazhan(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return minzudangpaizuzhifazhan;
    }

    private void calculateMinzudangpaizuzhifazhan(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("民主党派组织发展状况");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (minzudangpaizuzhifazhan.containsKey(tempStr)){
                    String[] tempArray = minzudangpaizuzhifazhan.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    minzudangpaizuzhifazhan.put(tempStr,tempArray);
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

    public Map<String, String[]> getGaojizhishiData(String year, String organization){
        iniGaoJiZhiShi();

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
                        calculateGaojizhishi(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateGaojizhishi(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateGaojizhishi(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateGaojizhishi(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return gaojizhishi;
    }

    private void calculateGaojizhishi(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("高级知识分子状况");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (gaojizhishi.containsKey(tempStr)){
                    String[] tempArray = gaojizhishi.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    gaojizhishi.put(tempStr,tempArray);
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

    public Map<String, String[]> getShiZhiGanBuData(String year, String organization){
        iniShiZhiGanBu();

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
                        calculateShizhiganbu(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateShizhiganbu(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateShizhiganbu(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateShizhiganbu(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return shizhiganbu;
    }

    private void calculateShizhiganbu(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("实职干部安排状况");
            for (int i = 0; i < tempSheet.getRows(); i++) {
                String tempStr = tempSheet.getCell(0,i).getContents();
                if (shizhiganbu.containsKey(tempStr)){
                    String[] tempArray = shizhiganbu.get(tempStr);
                    for (int j = 0; j < tempArray.length; j++) {
                        if (tempSheet.getCell(j + 1,i).getContents().equals("")){
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) + 0);
                        }else {
                            tempArray[j] = String.valueOf(Integer.parseInt(tempArray[j]) +
                                    Integer.parseInt(tempSheet.getCell(j + 1,i).getContents()));
                        }
                    }
                    shizhiganbu.put(tempStr,tempArray);
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

    public List<List<String>> getDangwaijujiData(String year, String organization){
        iniDangWaiJuJi();

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
                        calculateDangwaijuji(tempYearDir + separator + schoolsInfoFileNames[j]);
                    }
                }else {
                    String targeFile = "";
                    for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                        if (schoolsInfoFileNames[j].contains(organization)){
                            targeFile = schoolsInfoFileNames[j];
                            calculateDangwaijuji(tempYearDir + separator + targeFile);
                            break;
                        }
                    }
                }
            }
        }else {
            String[] schoolsInfoFileNames = new File(dir).list();
            if (isAllNames){
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    calculateDangwaijuji(dir + separator + schoolsInfoFileNames[j]);
                }
            }else {
                String targeFile = "";
                for (int j = 0; j < schoolsInfoFileNames.length; j++) {
                    if (schoolsInfoFileNames[j].contains(organization)){
                        targeFile = schoolsInfoFileNames[j];
                        calculateDangwaijuji(dir + separator + targeFile);
                        break;
                    }
                }
            }

        }
        return dangwaijuji;
    }

    private void calculateDangwaijuji(String path){
        File tempFile = new File(path);
        try {
            Workbook workbook = Workbook.getWorkbook(tempFile);
            Sheet tempSheet = workbook.getSheet("党外局级以上领导干部（实职）情况");
            int tempColumn = tempSheet.getColumns();
            for (int i = 3; i < tempSheet.getRows(); i++) {
                List<String> tempList = new ArrayList<String>();
                for (int j = 0; j < tempColumn; j++) {
                    if (tempSheet.getCell(j,i).getContents().equals("")){
                        tempList.add("NULL");
                    }else {
                        tempList.add(tempSheet.getCell(j,i).getContents());
                    }
                }
                dangwaijuji.add(tempList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    public List<String> getYears() {
        return years;
    }

    public Set<String> getNames() {
        return names;
    }
}
