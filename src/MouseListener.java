import Shapes.Math.Vector2;
import Shapes.OnMouseEventCallback;

import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class MouseListener implements MouseMotionListener, MouseInputListener {

    Vector2 mouseStartPos;
    OnMouseEventCallback mouseEventCallback;

    public MouseListener(OnMouseEventCallback mouseEventCallback) {
        this.mouseEventCallback = mouseEventCallback;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Vector2 mouseCurrentPosition = new Vector2(e.getX(), e.getY());

        Vector2 deltaDistance = new Vector2(mouseCurrentPosition.getX() - mouseStartPos.getX(), mouseCurrentPosition.getY() - mouseStartPos.getY());

        System.out.println("mouse-drag" + deltaDistance.toString());
        mouseEventCallback.onMouseDragged(deltaDistance);
        mouseStartPos = mouseCurrentPosition;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouse-moved");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse-clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseStartPos = new Vector2(e.getX(), e.getY());
        System.out.println("mouse-pressed");
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse-released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse-entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse-exited");
    }
}
