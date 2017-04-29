package Shapes;

import Shapes.Math.Rect;
import Shapes.Math.Vector2;

import java.awt.geom.Rectangle2D;

public abstract class DrawableShape implements Drawable, Movable, Resizable{

    protected Vector2 position;
    protected Vector2 percentSize;

    DrawableShape(Vector2 position, Vector2 percentSize) {
        this.percentSize = percentSize;
        this.position = position;
    }

    public abstract Rect getBoundingRectangle();

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Vector2 getPercentSize() {
        return percentSize;
    }

    public void setPercentSize(Vector2 percentSize) {
        this.percentSize = percentSize;
    }


    @Override
    public void move(int x, int y) {
        position.setX(position.getX() + x);
        position.setY(position.getY() + y);
    }

    @Override
    public void resize(int w, int h) {
        percentSize.setX(percentSize.getX() + w);
        percentSize.setY(percentSize.getY() + h);
    }
}
