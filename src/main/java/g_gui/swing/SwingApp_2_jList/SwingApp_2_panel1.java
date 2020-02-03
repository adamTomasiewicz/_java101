package g_gui.swing.SwingApp_2_jList;
import javax.swing.*;

public class SwingApp_2_panel1 extends JPanel {

    public SwingApp_2_panel1() {
        setLayout(null); // wylacza domyslny zarzadca rozkladu

        // JList
        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        defaultListModel.addElement("Jan Kowalski Mezczyzna");
        defaultListModel.addElement("Jagoda Wscibska Kobieta");
        defaultListModel.addElement("Jan Maria Rokita Mezczyzna");
        defaultListModel.addElement("Jurek Ogorek Kielbasa i Sznurek Mezczyzna");

        JList<String> jList1 = new JList<>(defaultListModel);
        jList1.setBounds(50, 50, 400, 400);

        add(jList1);

        //textfield
        JTextField jTextField1 = new JTextField("type your login");
        jTextField1.setBounds(50, 500, 300, 50);
        add(jTextField1);

        // buttons +
        JButton jButtonPlus = new JButton("wipe form");
        jButtonPlus.setBounds(400, 500, 50, 50);
        add(jButtonPlus);

        // buttons -
        JButton jButtonMinus = new JButton("wipe form");
        jButtonMinus.setBounds(450, 500, 50, 50);
        add(jButtonMinus);
        // buttons pencil
        JButton jButtonPencil = new JButton("wipe form");
        jButtonPencil.setBounds(500, 500, 50, 50);
        add(jButtonPencil);


    }


}




