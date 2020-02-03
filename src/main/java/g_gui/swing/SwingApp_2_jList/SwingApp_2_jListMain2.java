package g_gui.swing.SwingApp_2_jList;
import javax.swing.*;
import java.awt.*;

public class SwingApp_2_jListMain2 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingApp_2_window2 swingApp_2_window2 = new SwingApp_2_window2();
                swingApp_2_window2.setVisible(true);
                swingApp_2_window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    }
}

