package g_gui.swing.SwingApp_3_changePDFnameSWING;
import javax.swing.*;

public class SwingApp_1_Window extends JFrame {


    public SwingApp_1_Window() {
        setSize(600, 600);
        setLocation(50, 50);
        setTitle("registration form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        SwingApp_1_Panel swingApp_1_panel = new SwingApp_1_Panel();
        add(swingApp_1_panel);

    }
}

