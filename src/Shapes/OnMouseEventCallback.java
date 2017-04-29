package Shapes;


import Shapes.Math.Vector2;

public interface OnMouseEventCallback {
    void onMouseDragged(Vector2 distance);
    void onMouseClick();
    void onMouseRelease();
}
