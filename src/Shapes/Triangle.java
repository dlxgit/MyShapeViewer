package Shapes;


import Shapes.Math.Rect;
import Shapes.Math.Vector2;

import java.awt.*;
import java.util.ArrayList;

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
        g.drawLine((int)(p1.getX() + position.getX()), (int)(p1.getY() + position.getY()), (int)(p2.getX() + position.getX()), (int)(p2.getY() + position.getX()));
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

    @Override
    public Rect getBoundingRectangle() {

//                (Point (p) (minimum [y1, y2, y3]))
//        (Point (maximum [x1, x2, x3]) (maximum [y1, y2, y3]))

        float posX = points.stream().min((p1, p2)-> Float.compare(p1.getX(), p2.getX())).get().getX();
        float posY = points.stream().min((p1, p2)-> Float.compare(p1.getY(), p2.getY())).get().getY();

        float width = points.stream().max((p1, p2)-> Float.compare(p1.getX(), p2.getX())).get().getX();
        float height = points.stream().max((p1, p2)-> Float.compare(p1.getY(), p2.getY())).get().getY();


        return new Rect(new Vector2(posX, posY), new Vector2(width, height));
    }
}
