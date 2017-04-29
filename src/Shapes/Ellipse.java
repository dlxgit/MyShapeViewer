package Shapes;


import java.awt.*;

public class Ellipse extends DrawableShape {
    float radius;
    Vector2 position;

    public Ellipse(Vector2 position, float radius) {
        super(position, new Vector2(100, 100));
        this.radius = radius;
        this.position = position;
    }

    @Override
    public void draw(Graphics g) {
        //g.setColor(new Color(0, 255,0));
        int sizeX = (int)(radius * percentSize.getX() / 100);
        int sizeY = (int)(radius * percentSize.getY() / 100);

        g.drawOval((int)position.getX(), (int)position.getY(), sizeX, sizeY);
        //g.fill(int)(int)position.getX(), (int)position.getY(), (int)(radius * percentSize.getX() / 100), (int)(radius * percentSize.getY() / 100));
        //g.drawOval(0, 0, 500, 500);
//        g.setColor ( Color.RED );
//        g.fillOval ( moveXBy, RADIUS, X, Y ) ;
    }
}
