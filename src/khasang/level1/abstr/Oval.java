package khasang.level1.abstr;

import java.awt.*;

public class Oval extends Figure {
    @Override
    protected void paintShape(Graphics g) {
        g.drawOval(5,5,getWidth()-10,getHeight()-10);
    }
}
