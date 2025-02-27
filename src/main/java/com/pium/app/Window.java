package com.pium.app;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
Toolkit toolkit = Toolkit.getDefaultToolkit();
Dimension screenSize = toolkit.getScreenSize();
Image icon = toolkit.getImage("src/main/java/com/pium/app/imagenes/pium.png");
    public Window() {
        setBounds(screenSize.width/4, screenSize.height/4, 1200, 800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Panel());

    }
}
