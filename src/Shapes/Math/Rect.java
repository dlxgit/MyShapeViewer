package Shapes.Math;


import Shapes.Rectangle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Rect {
    Vector2 pos;
    Vector2 size;

    public Rect(Vector2 pos, Vector2 size) {
        this.pos = pos;
        this.size = size;
    }

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
    }

    public Vector2 getSize() {
        return size;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public HashSet<Vector2> getCorners() {
        HashSet<Vector2> corners = new HashSet<>();
        corners.add(new Vector2(pos.getX(), pos.getY()));
        corners.add(new Vector2(pos.getX() + size.getX(), pos.getY()));
        corners.add(new Vector2(pos.getX(), pos.getY() + size.getY()));
        corners.add(new Vector2(pos.getX() + size.getX(), pos.getY() + size.getX()));

        return corners;
    }
}
