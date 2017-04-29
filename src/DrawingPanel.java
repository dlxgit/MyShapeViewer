import Shapes.DrawableShape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class DrawingPanel extends JPanel {
    ArrayList<DrawableShape> shapes;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(DrawableShape shape : shapes) {
            shape.draw(g);
        }
    }

    public DrawingPanel(ArrayList<DrawableShape> shapes) {
        super();
        this.shapes = shapes;
    }


    @Override
    public Dimension getPreferredSize () {
        return new Dimension ( 300, 200 );
    }
}
