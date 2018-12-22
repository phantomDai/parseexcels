package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author phantom
 * @Description
 * @date 2018/12/22/022
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame(){
        initComponents();
    }

    private void initComponents() {
        MainPanel mainPanel = new MainPanel();
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setResizable(false);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
