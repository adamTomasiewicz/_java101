package g_gui.swing;

import javax.swing.*;

public class Window extends JFrame {

    public Window() {
        setSize(500, 500);
        setLocation(50, 50);
        setTitle("my first GUI app");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Panel panel1 = new Panel();
        add(panel1);

    }
}
