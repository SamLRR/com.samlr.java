package khasang.level1.abstr;

import javax.swing.*;
import java.awt.*;

public class ShapeFrame extends JFrame {

    public ShapeFrame()  {
        setLayout(new GridLayout(2,3));
        add(new Oval());
        setBounds(200, 200, 450, 350);
    }
}
