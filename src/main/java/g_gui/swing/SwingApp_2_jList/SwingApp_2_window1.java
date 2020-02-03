package g_gui.swing.SwingApp_2_jList;
import javax.swing.*;

public class SwingApp_2_window1 extends JFrame {


    public SwingApp_2_window1() {
        setSize(600, 600);
        setLocation(50, 50);
        setTitle("JList window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        SwingApp_2_panel1 swingApp_2_panel1 = new SwingApp_2_panel1();
        add(swingApp_2_panel1);

    }
}

