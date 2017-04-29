package Shapes;

public abstract class DrawableShape implements Drawable{

    protected Vector2 position;
    protected Vector2 percentSize;

    DrawableShape(Vector2 position, Vector2 percentSize) {
        this.percentSize = percentSize;
        this.position = position;
    }

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
}
