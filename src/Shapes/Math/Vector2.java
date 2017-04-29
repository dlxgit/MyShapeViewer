package Shapes.Math;


public class Vector2 {
    float x;
    float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "vector2[" + x + "," + y + "]";
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void reset() {
        this.x = 0;
        this.y = 0;
    }
}
