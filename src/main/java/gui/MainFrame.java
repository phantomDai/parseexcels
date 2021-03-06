package gui;

import utl.ParseOrganization;
import utl.ParseStudents;

import javax.swing.table.TableColumn;
import java.util.*;

/**
 * @author phantom
 * @Description
 * @date 2018/12/22/022
 */
public class MainFrame extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable dangwaijuji;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JTable gangaoxuesehng;
    private javax.swing.JTable gangaoxuesehng1;
    private javax.swing.JTable gaojizhishi;
    private javax.swing.JTable huaqiaoxuesheng;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable minzhudangpai;
    private javax.swing.JTable minzudangpaizuzhi;
    private javax.swing.JTable minzudangpaizuzhichengyuan;
    private javax.swing.JPanel oJPanelStep;
    private javax.swing.JLabel organazationorgination;
    private javax.swing.JButton orginationUpdate;
    private javax.swing.JButton orginationoutput;
    private javax.swing.JButton orginationsearch;
    private javax.swing.JLabel orginationyear2;
    private javax.swing.JComboBox<String> orginationyearBox1;
    private javax.swing.JTabbedPane orgjTabbedPane;
    private javax.swing.JComboBox<String> orgnazationBox2;
    private javax.swing.JLabel ostep10;
    private javax.swing.JLabel ostep6;
    private javax.swing.JLabel ostep7;
    private javax.swing.JLabel ostep8;
    private javax.swing.JLabel ostep9;
    private javax.swing.JPanel schoolChoose;
    private javax.swing.JLabel schoolOrganizations;
    private javax.swing.JComboBox<String> schoolOrganizationsjComboBox2;
    private javax.swing.JButton schoolOutput;
    private javax.swing.JButton schoolSearch;
    private javax.swing.JButton schoolUpdate;
    private javax.swing.JComboBox<String> schoolYearjComboBox1;
    private javax.swing.JTabbedPane schooleTabbedPanel;
    private javax.swing.JLabel schoolyear;
    private javax.swing.JTable shaoshuxuesheng;
    private javax.swing.JTable shizhiganbu;
    private javax.swing.JLabel sstep1;
    private javax.swing.JLabel sstep2;
    private javax.swing.JLabel sstep3;
    private javax.swing.JLabel sstep4;
    private javax.swing.JLabel sstep5;
    private javax.swing.JTable taiwanxuesheng;
    private javax.swing.JTable waiguoxuesheng;
    private javax.swing.JTable zaixiaoxuesheng;
    private javax.swing.JTabbedPane zuzhijigou;

    private ParseStudents parseStudents;

    private ParseOrganization parseOrganization;


    Map<String,String[]> minzudangpaizuzhijigou;


    Map<String,String[]> minzudangpaichengyuan;


    Map<String,String[]> minzudangpaizuzhifazhan;

    Map<String,String[]> gaojizhishifenzi;
    Map<String,String[]> shizhiganbushuju;

    List<List<String>> dangwaijujishuju;

    Map<String,String[]> gangaotai;
    Map<String,String[]> huaqiao;
    Map<String,String[]> taiwan;
    Map<String,String[]> waiguo;
    Map<String,String[]> shaoshuminzu;
    Map<String,String[]> shaoshuminzuban;
    Map<String,String[]> zaixiao;


    public MainFrame() {
        initComponents();
        inischool();
        parseStudents = new ParseStudents();
        parseOrganization = new ParseOrganization();
        iniorganization();
    }

    private void iniorganization(){
        Map<String,String[]> minzudangpaizuzhijigou = new HashMap<String, String[]>();


        Map<String,String[]> minzudangpaichengyuan = new HashMap<String, String[]>();


        Map<String,String[]> minzudangpaizuzhifazhan = new HashMap<String, String[]>();

        Map<String,String[]> gaojizhishifenzi = new HashMap<String, String[]>();

        Map<String,String[]> shizhiganbushuju = new HashMap<String, String[]>();

        List<List<String>> dangwaijujishuju = new ArrayList<List<String>>();
    }


    private void inischool(){
        Map<String,String[]> gangaotai = new HashMap<String, String[]>();
        Map<String,String[]> huaqiao = new HashMap<String, String[]>();
        Map<String,String[]> taiwan = new HashMap<String, String[]>();
        Map<String,String[]> waiguo = new HashMap<String, String[]>();
        Map<String,String[]> shaoshuminzu = new HashMap<String, String[]>();
        Map<String,String[]> shaoshuminzuban = new HashMap<String, String[]>();
        Map<String,String[]> zaixiao = new HashMap<String, String[]>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        orgjTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0),
                new java.awt.Dimension(32767, 32767));
        sstep1 = new javax.swing.JLabel();
        sstep2 = new javax.swing.JLabel();
        sstep3 = new javax.swing.JLabel();
        sstep4 = new javax.swing.JLabel();
        sstep5 = new javax.swing.JLabel();
        schoolChoose = new javax.swing.JPanel();
        schoolOrganizations = new javax.swing.JLabel();
        schoolYearjComboBox1 = new javax.swing.JComboBox<String>();
        schoolyear = new javax.swing.JLabel();
        schoolOrganizationsjComboBox2 = new javax.swing.JComboBox<String>();
        schoolSearch = new javax.swing.JButton();
        schoolOutput = new javax.swing.JButton();
        schoolUpdate = new javax.swing.JButton();
        schooleTabbedPanel = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        huaqiaoxuesheng = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taiwanxuesheng = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        waiguoxuesheng = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        shaoshuxuesheng = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        zaixiaoxuesheng = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        gangaoxuesehng = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        gangaoxuesehng1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        orginationyear2 = new javax.swing.JLabel();
        orginationyearBox1 = new javax.swing.JComboBox<String>();
        organazationorgination = new javax.swing.JLabel();
        orgnazationBox2 = new javax.swing.JComboBox<String>();
        orginationsearch = new javax.swing.JButton();
        orginationoutput = new javax.swing.JButton();
        orginationUpdate = new javax.swing.JButton();
        zuzhijigou = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        minzudangpaizuzhichengyuan = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        minzudangpaizuzhi = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        gaojizhishi = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        shizhiganbu = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        dangwaijuji = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        minzhudangpai = new javax.swing.JTable();
        oJPanelStep = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0),
                new java.awt.Dimension(32767, 32767));
        ostep6 = new javax.swing.JLabel();
        ostep7 = new javax.swing.JLabel();
        ostep8 = new javax.swing.JLabel();
        ostep9 = new javax.swing.JLabel();
        ostep10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("信息管理系统");

        orgjTabbedPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("操作步骤"));

        sstep1.setText("步骤1：点击“刷新”按钮");

        sstep2.setText("步骤2：选择年度");

        sstep3.setText("步骤3：选择学校");

        sstep4.setText("步骤4：点击“查询”按钮");

        sstep5.setText("步骤5：点击选项卡查看信息");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sstep1)
                                        .addComponent(sstep2)
                                        .addComponent(sstep3)
                                        .addComponent(sstep4)
                                        .addComponent(sstep5))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sstep1)
                                .addGap(18, 18, 18)
                                .addComponent(sstep2)
                                .addGap(18, 18, 18)
                                .addComponent(sstep3)
                                .addGap(18, 18, 18)
                                .addComponent(sstep4)
                                .addGap(18, 18, 18)
                                .addComponent(sstep5)
                                .addGap(351, 351, 351)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        schoolChoose.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        schoolOrganizations.setFont(new java.awt.Font("宋体", 0, 15)); // NOI18N
        schoolOrganizations.setText("单位：");

        schoolYearjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "全部"}));

        schoolyear.setFont(new java.awt.Font("宋体", 0, 15)); // NOI18N
        schoolyear.setText("年度：");

        schoolOrganizationsjComboBox2.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "全部"}));

        schoolSearch.setText("查询");
        schoolSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolSearchActionPerformed(evt);
            }
        });

        schoolOutput.setText("导出");
        schoolOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolOutputActionPerformed(evt);
            }
        });

        schoolUpdate.setText("刷新");

        schoolUpdate.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                schoolUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout schoolChooseLayout = new javax.swing.GroupLayout(schoolChoose);
        schoolChoose.setLayout(schoolChooseLayout);
        schoolChooseLayout.setHorizontalGroup(
                schoolChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(schoolChooseLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(schoolYearjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(schoolOrganizations)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schoolOrganizationsjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(schoolUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(schoolSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(schoolOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                        .addGroup(schoolChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(schoolChooseLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(schoolyear)
                                        .addContainerGap(795, Short.MAX_VALUE)))
        );
        schoolChooseLayout.setVerticalGroup(
                schoolChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(schoolChooseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(schoolChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(schoolOrganizations, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                        .addComponent(schoolYearjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(schoolOrganizationsjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(schoolSearch)
                                        .addComponent(schoolOutput)
                                        .addComponent(schoolUpdate))
                                .addContainerGap())
                        .addGroup(schoolChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(schoolChooseLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(schoolyear, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        schooleTabbedPanel.setForeground(new java.awt.Color(51, 51, 255));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        huaqiaoxuesheng.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null}
                },
                new String [] {
                        "类别", "招生数目", "现在校总数"
                }
        ));
        huaqiaoxuesheng.setRowHeight(35);
        jScrollPane6.setViewportView(huaqiaoxuesheng);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        schooleTabbedPanel.addTab("华侨学生人数统计", jPanel5);

        taiwanxuesheng.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null}
                },
                new String [] {
                        "类别", "招生数目", "现在校总数"
                }
        ));
        taiwanxuesheng.setRowHeight(35);
        jScrollPane3.setViewportView(taiwanxuesheng);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        schooleTabbedPanel.addTab("台湾学生人数统计", jPanel6);

        waiguoxuesheng.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null}
                },
                new String [] {
                        "类别", "招生数目", "现在校总数"
                }
        ));
        waiguoxuesheng.setRowHeight(35);
        jScrollPane8.setViewportView(waiguoxuesheng);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        schooleTabbedPanel.addTab("外国留学生人数统计", jPanel7);

        shaoshuxuesheng.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {"", null, null, null, null, null}
                },
                new String [] {
                        "民族", "研究生（男）", "研究生（女）", "本专科生（男）", "本专科生（女）", "合计"
                }
        ));
        shaoshuxuesheng.setRowHeight(35);
        jScrollPane9.setViewportView(shaoshuxuesheng);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        schooleTabbedPanel.addTab("少数民族人数统计", jPanel8);

        zaixiaoxuesheng.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", null, null, null, null}
                },
                new String [] {
                        "研究生（男）", "研究生（女）", "本专科生（男）", "本专科生（女", "总计"
                }
        ));
        zaixiaoxuesheng.setRowHeight(35);
        jScrollPane10.setViewportView(zaixiaoxuesheng);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        schooleTabbedPanel.addTab("在校学生统计", jPanel9);

        gangaoxuesehng.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null},
                        {"", null, null}
                },
                new String [] {
                        "类别", "招生数", "现在校总数"
                }
        ));
        gangaoxuesehng.setRowHeight(35);
        jScrollPane11.setViewportView(gangaoxuesehng);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        schooleTabbedPanel.addTab("港澳学生人数统计", jPanel10);

        gangaoxuesehng1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {"", null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "民族", "研究生（班数）", "研究生（人数）", "本专科生（班数）", "本专科生（人数）", "预科班（班数）", "预科班（人数）", "总计（班数）", "总计（人数）"
                }
        ));
        gangaoxuesehng1.setRowHeight(35);
        gangaoxuesehng1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < 9; i++) {
            TableColumn co = gangaoxuesehng1.getColumnModel().getColumn(i);
            co.setPreferredWidth(130);
        }
        jScrollPane12.setViewportView(gangaoxuesehng1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        schooleTabbedPanel.addTab("少数民族班人数统计", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(schoolChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(schooleTabbedPanel))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(schoolChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(schooleTabbedPanel)))
                                .addGap(0, 66, Short.MAX_VALUE))
        );

        orgjTabbedPane.addTab("北京高校学生信息统计", jPanel1);

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.setPreferredSize(new java.awt.Dimension(875, 61));

        orginationyear2.setFont(new java.awt.Font("宋体", 0, 15)); // NOI18N
        orginationyear2.setText("年度：");

        orginationyearBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "全部" }));

        organazationorgination.setFont(new java.awt.Font("宋体", 0, 15)); // NOI18N
        organazationorgination.setText("单位：");

        orgnazationBox2.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "全部" }));

        orginationsearch.setText("查询");
        orginationsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orginationsearchActionPerformed(evt);
            }
        });

        orginationoutput.setText("导出");
        orginationoutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orginationoutputActionPerformed(evt);
            }
        });

        orginationUpdate.setText("刷新");
        orginationUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orginationUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(orginationyear2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(orginationyearBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(organazationorgination)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(orgnazationBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(orginationUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orginationsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(orginationoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
        );
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(orginationyear2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                        .addComponent(orginationyearBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(organazationorgination, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                        .addComponent(orgnazationBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orginationsearch)
                                        .addComponent(orginationoutput)
                                        .addComponent(orginationUpdate))
                                .addContainerGap())
        );

        zuzhijigou.setForeground(new java.awt.Color(0, 51, 255));

        minzudangpaizuzhichengyuan.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"民革", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"民盟", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"民建", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"民进", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"农工", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"致公党", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"九三", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"台盟", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"总计", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "党派名称", "成员（总数）", "成员（男）", "成员（女）", "职称（高级）", "职称（中级）", "职称（初级）", "职称（无）", "年龄（29岁以下）", "年龄（30-39）", "年龄（40-49）", "年龄（50-59）", "年龄（60岁以上）", "离退休", "交叉党员（总数）", "交叉党员（在职数）", "党派市委委员以上", "党派中央委员以上", "担任处级职务", "担任局级以上领导职务", "变化情况（调入）", "变化情况（调出）", "变化情况（退出）", "变化情况（死亡）"
                }
        ));
        minzudangpaizuzhichengyuan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        minzudangpaizuzhichengyuan.setRowHeight(41);
        for (int i = 0; i < 24; i++) {
            TableColumn co = minzudangpaizuzhichengyuan.getColumnModel().getColumn(i);
            co.setPreferredWidth(150);
        }
        

        jScrollPane26.setViewportView(minzudangpaizuzhichengyuan);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        zuzhijigou.addTab("民族党派组织成员状况", jPanel20);

        minzudangpaizuzhi.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"民革", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"民盟", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"民建", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"民进", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"农工", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"致公党", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"九三", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"台盟", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"总计", null, null, null, null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "党派名称", "新建组织（委员会数）", "新建组织（总支数）", "新建组织（支部数）", "新建组织（小组数）", "发展成员数量", "高级职称", "中级职称", "低级职称", "无职称", "年龄（29岁以下）", "年龄（30-39岁）", "年龄（40-49岁）", "年龄（50-59岁）", "年龄（60岁以上）"
                }
        ));
        minzudangpaizuzhi.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        minzudangpaizuzhi.setRowHeight(41);

        for (int i = 0; i < 15; i++) {
            TableColumn co = minzudangpaizuzhi.getColumnModel().getColumn(i);
            co.setPreferredWidth(150);
        }
        
        
        jScrollPane25.setViewportView(minzudangpaizuzhi);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        zuzhijigou.addTab("民族党派组织发展状况", jPanel21);

        gaojizhishi.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"29岁以下", null, null, null, null, null, null, null, null, null, null, null},
                        {"30-39岁", null, null, null, null, null, null, null, null, null, null, null},
                        {"40-49岁", null, null, null, null, null, null, null, null, null, null, null},
                        {"50-59岁", null, null, null, null, null, null, null, null, null, null, null},
                        {"60岁以上", null, null, null, null, null, null, null, null, null, null, null},
                        {"总计", null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "年龄段", "党外（总数）", "党外正高级（男）", "党外正高级（女）", "党外副高级（男）", "党外副高级（女）", "高级（总数）", "高级（男）", "高级（女）", "教职工（总数）", "教职工（男）", "教职工（女）"
                }
        ));
        gaojizhishi.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        gaojizhishi.setRowHeight(41);

        for (int i = 0; i < 12; i++) {
            TableColumn co = gaojizhishi.getColumnModel().getColumn(i);
            co.setPreferredWidth(150);
        }

        jScrollPane24.setViewportView(gaojizhishi);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        zuzhijigou.addTab("高级知识分子状况", jPanel22);

        shizhiganbu.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"担任处级职务", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"担任局级以上", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {"总计", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "类别", "党外（总数）", "党外（男）", "党外（女）", "党外（高级职称）", "党外（中级职称）", "党外（低级职称）", "党外（无级职称）", "党外（29岁以下）", "党外（30-39岁）", "党外（40-49岁）", "党外（50-59岁）", "党外（60岁以上）", "党外（少数民族）", "党外（民主党派）", "实职干部总数"
                }
        ));
        shizhiganbu.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        shizhiganbu.setRowHeight(41);

        for (int i = 0; i < 16; i++) {
            TableColumn co = shizhiganbu.getColumnModel().getColumn(i);
            co.setPreferredWidth(150);
        }
        
        jScrollPane23.setViewportView(shizhiganbu);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        zuzhijigou.addTab("实职干部安排状况", jPanel23);

        dangwaijuji.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "序号", "姓名", "单位", "现任职务", "出生年月", "籍贯", "党派", "学历", "职称", "任职时间"
                }
        ));
        dangwaijuji.setRowHeight(41);
        jScrollPane22.setViewportView(dangwaijuji);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        zuzhijigou.addTab("党外局级以上领导干部（实职）情况", jPanel24);

        minzhudangpai.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"民革", null, null, null, null, null, null},
                        {"民盟", null, null, null, null, null, null},
                        {"民建", null, null, null, null, null, null},
                        {"民进", null, null, null, null, null, null},
                        {"农工", null, null, null, null, null, null},
                        {"致公党", null, null, null, null, null, null},
                        {"九三", null, null, null, null, null, null},
                        {"台盟", null, null, null, null, null, null},
                        {"总计", null, null, null, null, null, null}
                },
                new String [] {
                        "党派名称", "委员会数", "总支数", "支部数", "小组数", "总人数", "联合组织数"
                }
        ));
        minzhudangpai.setRowHeight(41);
        jScrollPane21.setViewportView(minzhudangpai);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        zuzhijigou.addTab("民族党派组织机构状况", jPanel25);

        oJPanelStep.setBorder(javax.swing.BorderFactory.createTitledBorder("操作步骤"));

        ostep6.setText("步骤1：点击“刷新”按钮");

        ostep7.setText("步骤2：选择年度");

        ostep8.setText("步骤3：选择学校");

        ostep9.setText("步骤4：点击“查询”按钮");

        ostep10.setText("步骤5：点击选项卡查看信息");

        javax.swing.GroupLayout oJPanelStepLayout = new javax.swing.GroupLayout(oJPanelStep);
        oJPanelStep.setLayout(oJPanelStepLayout);
        oJPanelStepLayout.setHorizontalGroup(
                oJPanelStepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(oJPanelStepLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(oJPanelStepLayout.createSequentialGroup()
                                .addGroup(oJPanelStepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ostep6)
                                        .addComponent(ostep7)
                                        .addComponent(ostep8)
                                        .addComponent(ostep9)
                                        .addComponent(ostep10))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        oJPanelStepLayout.setVerticalGroup(
                oJPanelStepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(oJPanelStepLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ostep6)
                                .addGap(18, 18, 18)
                                .addComponent(ostep7)
                                .addGap(18, 18, 18)
                                .addComponent(ostep8)
                                .addGap(18, 18, 18)
                                .addComponent(ostep9)
                                .addGap(18, 18, 18)
                                .addComponent(ostep10)
                                .addGap(351, 351, 351)
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(oJPanelStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(zuzhijigou)
                                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zuzhijigou))
                        .addComponent(oJPanelStep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        orgjTabbedPane.addTab("北京高校民主党派信息统计", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(orgjTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(orgjTabbedPane)
        );

        pack();
    }// </editor-fold>

    private void schoolUpdateActionPerformed(java.awt.event.ActionEvent evt){
        List<String> tempListYears = parseStudents.getYears();
        String[] tempArrayYears = new String[tempListYears.size() + 1];
        for (int i = 0; i < tempArrayYears.length; i++) {
            if (i == 0){
                tempArrayYears[0] = "全部";
            }else {
                tempArrayYears[i] = tempListYears.get(i - 1);
            }
        }
        Set<String> tempListschools = parseStudents.getNames();
        String[] tempArrayschools = new String[tempListschools.size() + 1];
        Iterator it = tempListschools.iterator();
        tempArrayschools[0] = "全部";
        int count = 1;
        while(it.hasNext()){
            tempArrayschools[count] = (String) it.next();
            count++;
        }

        schoolOrganizationsjComboBox2.setModel(new javax.swing.DefaultComboBoxModel<String>(tempArrayschools));
        schoolYearjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(tempArrayYears));
    }

    private void schoolSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // get the selected year
        String selectedYear = (String) schoolYearjComboBox1.getSelectedItem();
        //get the selected name
        String selectedSchool = (String) schoolOrganizationsjComboBox2.getSelectedItem();
        //get data
        gangaotai = parseStudents.getGangAoTaiData(selectedYear,selectedSchool);
        huaqiao = parseStudents.getHuaQiaoData(selectedYear,selectedSchool);
        taiwan = parseStudents.getTaiWanData(selectedYear,selectedSchool);
        waiguo = parseStudents.getWaiGuoData(selectedYear,selectedSchool);
        shaoshuminzu = parseStudents.getShaoShuMinZuData(selectedYear,selectedSchool);
        shaoshuminzuban = parseStudents.getShaoShuMinZuBanData(selectedYear,selectedSchool);
        zaixiao = parseStudents.getZaiXiaoData(selectedYear,selectedSchool);

        gangaoxuesehng.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(gangaotai),
                new String [] {
                        "类别", "招生数", "现在校总数"
                }));

        gangaoxuesehng1.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(shaoshuminzuban),
                new String [] {
                        "民族", "研究生（班数）", "研究生（人数）", "本专科生（班数）", "本专科生（人数）", "预科班（班数）", "预科班（人数）", "总计（班数）", "总计（人数）"
                }));

        zaixiaoxuesheng.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(zaixiao),
                new String [] {
                        "研究生（男）", "研究生（女）", "本专科生（男）", "本专科生（女", "总计"
                }));

        shaoshuxuesheng.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(shaoshuminzu),
                new String [] {
                        "民族", "研究生（男）", "研究生（女）", "本专科生（男）", "本专科生（女）", "合计"
                }));

        waiguoxuesheng.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(waiguo),
                new String [] {
                        "类别", "招生数", "现在校总数"
                }));

        taiwanxuesheng.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(taiwan),
                new String [] {
                        "类别", "招生数", "现在校总数"
                }));

        huaqiaoxuesheng.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(huaqiao),
                new String [] {
                        "类别", "招生数", "现在校总数"
                }));
    }

    private String[][] turnMapToMatrix(Map<String,String[]> map){
        String[][] result = new String[map.size()][map.entrySet().iterator().next().getValue().length + 1];
        int count = 0;
        for (Map.Entry<String,String[]> entry : map.entrySet()) {
            result[count][0] = entry.getKey();
            for (int i = 0; i < entry.getValue().length; i++) {
                result[count][i + 1] = entry.getValue()[i];
            }
            count++;
        }
        return result;
    }

    /**
     * 学校信息导出
     * @param evt
     */
    private void schoolOutputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void orginationsearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String selectedYear = (String) orginationyearBox1.getSelectedItem();

        String selectedSchool = (String) orgnazationBox2.getSelectedItem();

        minzudangpaizuzhijigou =
                parseOrganization.getMinzudangpaizuzhijigouData(selectedYear,selectedSchool);

        minzudangpaichengyuan =
                parseOrganization.getMinzudangpaichengyuanData(selectedYear,selectedSchool);

        minzudangpaizuzhifazhan =
                parseOrganization.getMinzudangpaizuzhifazhanData(selectedYear,selectedSchool);

        gaojizhishifenzi =
                parseOrganization.getGaojizhishiData(selectedYear,selectedSchool);
        shizhiganbushuju =
                parseOrganization.getShiZhiGanBuData(selectedYear,selectedSchool);

        dangwaijujishuju =
                parseOrganization.getDangwaijujiData(selectedYear,selectedSchool);






        minzudangpaizuzhichengyuan.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(minzudangpaichengyuan),
                new String [] {
                        "党派名称", "成员（总数）", "成员（男）", "成员（女）", "职称（高级）", "职称（中级）", "职称（初级）", "职称（无）", "年龄（29岁以下）", "年龄（30-39）", "年龄（40-49）", "年龄（50-59）", "年龄（60岁以上）", "离退休", "交叉党员（总数）", "交叉党员（在职数）", "党派市委委员以上", "党派中央委员以上", "担任处级职务", "担任局级以上领导职务", "变化情况（调入）", "变化情况（调出）", "变化情况（退出）", "变化情况（死亡）"
                }));

        minzudangpaizuzhi.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(minzudangpaizuzhifazhan),
                new String [] {
                        "党派名称", "新建组织（委员会数）", "新建组织（总支数）", "新建组织（支部数）", "新建组织（小组数）", "发展成员数量", "高级职称", "中级职称", "低级职称", "无职称", "年龄（29岁以下）", "年龄（30-39岁）", "年龄（40-49岁）", "年龄（50-59岁）", "年龄（60岁以上）"
                }));

        gaojizhishi.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(gaojizhishifenzi),
                new String [] {
                        "年龄段", "党外（总数）", "党外正高级（男）", "党外正高级（女）", "党外副高级（男）", "党外副高级（女）", "高级（总数）", "高级（男）", "高级（女）", "教职工（总数）", "教职工（男）", "教职工（女）"
                }));

        shizhiganbu.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(shizhiganbushuju),
                new String [] {
                        "类别", "党外（总数）", "党外（男）", "党外（女）", "党外（高级职称）", "党外（中级职称）", "党外（低级职称）", "党外（无级职称）", "党外（29岁以下）", "党外（30-39岁）", "党外（40-49岁）", "党外（50-59岁）", "党外（60岁以上）", "党外（少数民族）", "党外（民主党派）", "实职干部总数"
                }));

        dangwaijuji.setModel(new javax.swing.table.DefaultTableModel(turnListToMatrix(dangwaijujishuju),
                new String [] {
                        "序号", "姓名", "单位", "现任职务", "出生年月", "籍贯", "党派", "学历", "职称", "任职时间"
                }));

        minzhudangpai.setModel(new javax.swing.table.DefaultTableModel(turnMapToMatrix(minzudangpaizuzhijigou),
                new String [] {
                        "党派名称", "委员会数", "总支数", "支部数", "小组数", "总人数", "联合组织数"
                }));
    }

    private String[][] turnListToMatrix (List<List<String>> list){
        String[][] result = new String[list.size()][list.get(0).size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                result[i][j] = list.get(i).get(j);
            }
        }
        return result;
    }


    /**
     * 党派组织信息导出
     * @param evt
     */
    private void orginationoutputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


    }

    private void orginationUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        List<String> tempListYears = parseOrganization.getYears();
        String[] tempArrayYears = new String[tempListYears.size() + 1];
        for (int i = 0; i < tempArrayYears.length; i++) {
            if (i == 0){
                tempArrayYears[0] = "全部";
            }else {
                tempArrayYears[i] = tempListYears.get(i - 1);
            }
        }
        Set<String> tempListschools = parseOrganization.getNames();
        String[] tempArrayschools = new String[tempListschools.size() + 1];
        Iterator it = tempListschools.iterator();
        tempArrayschools[0] = "全部";
        int count = 1;
        while(it.hasNext()){
            tempArrayschools[count] = (String) it.next();
            count++;
        }
        orginationyearBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(tempArrayYears));
        orgnazationBox2.setModel(new javax.swing.DefaultComboBoxModel<String>(tempArrayschools));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }




}
