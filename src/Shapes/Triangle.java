package Shapes;


import java.awt.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Triangle extends DrawableShape {
    ArrayList<Vector2> points;

    public Triangle (Vector2 position, ArrayList<Vector2> points) {
        super(position, new Vector2(100, 100));

        if(points.size() != 3) {
            throw(new IllegalArgumentException("Triangle point list size is not 3"));
        }
            this.points = points;
    }

    private void drawLine(Graphics g, Vector2 p1, Vector2 p2) {
        g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());
    }

    @Override
    public void draw(Graphics g) {
        Vector2 p1 = points.get(0);
        Vector2 p2 = points.get(1);
        Vector2 p3 = points.get(2);
        drawLine(g, p1, p2);
        drawLine(g, p2, p3);
        drawLine(g, p1, p3);
    }
}
