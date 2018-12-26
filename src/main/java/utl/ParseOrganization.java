package utl;

import java.io.File;
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

    }

    private void iniMap(){

        iniiniMinZuDangPaiZuZhiJiGou();

        iniMinZuDangPaiChengYuan();

        iniMinZuDangPaiZuZhiFaZhan();

        iniGaoJiZhiShi();

        iniShiZhiGanBu();

        iniDangWaiJuJi();


    }

    private void iniiniMinZuDangPaiZuZhiJiGou() {
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











}
