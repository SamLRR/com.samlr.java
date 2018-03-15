package khasang.level1.abstr;

import javax.swing.*;
import java.awt.*;

public abstract class Figure extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintShape(g);
    }

    protected abstract void paintShape(Graphics g);
}
