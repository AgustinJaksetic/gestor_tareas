package com.pium.front;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(App.service.getTask(1).toString(), 100, 100);
    }
}
