import Shapes.DrawableShape;
import Shapes.OnDrawCallback;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class DrawingPanel extends JPanel {
    ArrayList<DrawableShape> shapes;
    OnDrawCallback onDrawCallback;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        onDrawCallback.draw(g);

    }

    public DrawingPanel(ArrayList<DrawableShape> shapes, OnDrawCallback onDrawCallback) {
        super();
        this.shapes = shapes;
        this.onDrawCallback = onDrawCallback;
    }

    @Override
    public Dimension getPreferredSize () {
        return new Dimension ( 300, 200 );
    }
}
