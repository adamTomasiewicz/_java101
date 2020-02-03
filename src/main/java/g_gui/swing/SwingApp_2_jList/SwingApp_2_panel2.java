package g_gui.swing.SwingApp_2_jList;

import javax.swing.*;

public class SwingApp_2_panel2 extends JPanel {

    public SwingApp_2_panel2() {
        setLayout(null); // turning off default layout manager

        //textfield
        JTextField jTextField1 = new JTextField("JField record");
        jTextField1.setBounds(30, 100, 400, 50);
        add(jTextField1);

        // button submit
        JButton jButtonSubmit = new JButton("submit");
        jButtonSubmit.setBounds(460, 100, 100, 50);
        add(jButtonSubmit);


    }


}




