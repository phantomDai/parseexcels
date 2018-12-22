package gui;

import sun.applet.Main;

/**
 * @author phantom
 * @Description 该类是gui的主界面
 * @date 2018/12/22/022
 */
public class MainPanel extends javax.swing.JPanel{

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;

    public MainPanel() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("学生信息");

        jButton2.setText("党派信息");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addGap(142, 142, 142)
                                .addComponent(jButton2)
                                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(24, 24, 24))
        );
    }


    public static void main(String[] args) {
        MainPanel mainPanel = new MainPanel();
    }
}
