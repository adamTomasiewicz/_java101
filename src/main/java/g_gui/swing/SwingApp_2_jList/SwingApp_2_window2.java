package g_gui.swing.SwingApp_2_jList;
import javax.swing.*;

public class SwingApp_2_window2 extends JFrame {


    public SwingApp_2_window2() {
        setSize(600, 300);
        setLocation(350, 350);
        setTitle("JList edit");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        SwingApp_2_panel2 swingApp_2_panel2 = new SwingApp_2_panel2();
        add(swingApp_2_panel2);

    }
}

