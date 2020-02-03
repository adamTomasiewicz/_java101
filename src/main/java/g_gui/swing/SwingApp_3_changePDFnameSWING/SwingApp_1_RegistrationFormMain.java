package g_gui.swing.SwingApp_3_changePDFnameSWING;

import javax.swing.*;
import java.awt.*;

public class SwingApp_1_RegistrationFormMain {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingApp_1_Window swingApp_1_window = new SwingApp_1_Window();
                swingApp_1_window.setVisible(true);
                swingApp_1_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    }
}

