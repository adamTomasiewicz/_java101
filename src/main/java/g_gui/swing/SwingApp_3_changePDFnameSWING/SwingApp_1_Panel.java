package g_gui.swing.SwingApp_3_changePDFnameSWING;

import javax.swing.*;
import java.awt.*;

public class SwingApp_1_Panel extends JPanel {

    public SwingApp_1_Panel() {
        setLayout(null); // wylacza domyslny zarzadca rozkladu

        //JTabbedPane  - zakladki SignIn SignUp
        // panel title
        JLabel jLabel0 = new JLabel("SingUp");
        jLabel0.setBounds(250, 30, 100, 50);
        jLabel0.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        add(jLabel0);
        jLabel0.setForeground(Color.red);

        //login
        JLabel jLabel1 = new JLabel("login:");
        jLabel1.setBounds(100, 100, 100, 30);
        add(jLabel1);

        JTextField jTextField1 = new JTextField("type your login");
        jTextField1.setBounds(300, 100, 150, 30);
        add(jTextField1);
        // password
        JLabel jLabel2 = new JLabel("password:");
        jLabel2.setBounds(100, 140, 100, 30);
        add(jLabel2);

        JTextField jTextField2 = new JTextField("type your password");
        jTextField2.setBounds(300, 140, 150, 30);
        add(jTextField2);
        //password 2
        JLabel jLabel3 = new JLabel("re-enter password:");
        jLabel3.setBounds(80, 180, 200, 30);
        add(jLabel3);

        JTextField jTextField3 = new JTextField("re-enter your password");
        jTextField3.setBounds(300, 180, 150, 30);
        add(jTextField3);

        //JSplitPane - spit pane
        // create a splitpane
        //JSplitPane jSplitPane = new JSplitPane(SwingConstants.HORIZONTAL, );
        // add panel

        JSeparator jSeparator = new JSeparator();
        jSeparator.setBounds(10, 230, 560, 20);
        jSeparator.setBackground(Color.black);
        add(jSeparator);

        //sex
        JLabel jLabel4 = new JLabel("sex:");
        jLabel4.setBounds(100, 260, 100, 30);
        add(jLabel4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        JRadioButton jRadioButton1 = new JRadioButton("Man");
        jRadioButton1.setText("Man");
        jRadioButton1.setBounds(90, 300, 120, 20);
        buttonGroup1.add(jRadioButton1);
        add(jRadioButton1);

        JRadioButton jRadioButton2 = new JRadioButton("Woman");
        jRadioButton2.setText("Woman");
        jRadioButton2.setBounds(190, 300, 120, 20);
        buttonGroup1.add(jRadioButton2);
        add(jRadioButton2);

        JRadioButton jRadioButton3 = new JRadioButton("Other");
        jRadioButton3.setText("Other");
        jRadioButton3.setBounds(290, 300, 120, 20);
        buttonGroup1.add(jRadioButton3);
        add(jRadioButton3);


        //interests

        JLabel jLabel5 = new JLabel("interests:");
        jLabel5.setBounds(100, 350, 100, 30);
        add(jLabel5);

        CheckboxGroup checkboxGroup1 = new CheckboxGroup();
        //https://stackoverflow.com/questions/26241488/java-swing-group-of-checkbox-multiple-selection-handler
        JCheckBox jCheckBox1 = new JCheckBox("trips");
        jCheckBox1.setBounds(90, 400, 100, 30);

        add(jCheckBox1);

        JCheckBox jCheckBox2 = new JCheckBox("movies");
        jCheckBox2.setBounds(190, 400, 100, 30);
        //checkboxGroup1.add(jCheckBox2);
        add(jCheckBox2);

        JCheckBox jCheckBox3 = new JCheckBox("fishing");
        jCheckBox3.setBounds(290, 400, 100, 30);
        //checkboxGroup1.add(jCheckBox3);
        add(jCheckBox3);

        JCheckBox jCheckBox4 = new JCheckBox("drinking");
        jCheckBox4.setBounds(390, 400, 100, 30);
        // checkboxGroup1.add(jCheckBox4);
        add(jCheckBox4);

        // buttons
        //clean
        JButton jButton1 = new JButton("wipe form");
        jButton1.setBounds(150, 440, 150, 50);
        add(jButton1);
        //register
        JButton jButton2 = new JButton("register");
        jButton2.setBounds(350, 440, 150, 50);
        add(jButton2);

    }


}




