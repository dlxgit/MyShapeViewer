package Shapes;


import Shapes.Math.Rect;
import Shapes.Math.Vector2;

import java.awt.*;
import java.util.HashSet;

public class ShapeSelectionArea implements Drawable{
    private static float CORNER_CIRCLE_RADIUS = 10;

    Rectangle rectangle;
    HashSet<Ellipse> circles;

    public ShapeSelectionArea (Rect rect) {
        this.rectangle = new Rectangle(rect.getPos(), rect.getSize());

        rect.getCorners().forEach(corner -> circles.add(new Ellipse(
                new Vector2(corner.getX() - CORNER_CIRCLE_RADIUS / 2, corner.getY() - CORNER_CIRCLE_RADIUS / 2),
                CORNER_CIRCLE_RADIUS))) ;
    }


    @Override
    public void draw(Graphics g) {
        rectangle.draw(g);

        circles.forEach(e -> e.draw(g));

    }
}
