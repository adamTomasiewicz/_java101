package g_gui.swing;

import javax.swing.*;

public class Panel extends JPanel {

    public Panel() {
        setLayout(null); // wylacza domyslny zarzadca rozkladu
        for (int i = 0; i < 10; i++) {
            JButton jButton = new JButton("jButton");
            jButton.setBounds(10, 50 * i + 10, 150, 40);
            add(jButton);
        }
        JCheckBox jCheckBox = new JCheckBox("is Human");
        jCheckBox.setBounds(300, 300, 150, 40);
        add(jCheckBox);

        JLabel jLabel = new JLabel("jLabel");
        jLabel.setBounds(230, 50, 70, 30);
        add(jLabel);

        //JTabbedPane  - zakladki
        //JSplitPane - spit pane
        JTextField jTextField = new JTextField("jTextField");
        jTextField.setBounds(150, 150, 300, 40);
        add(jTextField);
    }


}
