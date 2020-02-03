package g_gui.swing;


import javax.swing.*;
import java.awt.*;

public class SwingMain {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window window = new Window();
                window.setVisible(true);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    }
}
