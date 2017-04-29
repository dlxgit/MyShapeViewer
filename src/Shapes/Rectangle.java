package Shapes;


import java.awt.*;

public class Rectangle extends DrawableShape {
    Vector2 size;

    public Rectangle(Vector2 position, Vector2 size) {
        super(position, new Vector2(100, 100));
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect((int)position.getX(), (int) position.getY(), (int)(size.getX() * percentSize.getX() / 100), (int) (size.getY() * percentSize.getY() / 100));
    }

    @Override
    public void move(int x, int y) {
        position.setX(position.getX() + x);
        position.setY(position.getY() + y);
    }
}
