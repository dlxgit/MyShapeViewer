
import Shapes.*;
import Shapes.Rectangle;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {

        ArrayList<DrawableShape> shapes = new ArrayList<>();


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DrawingPanel drawingPanel = new DrawingPanel(shapes);
                Vector2 windowSize = new Vector2(0, 0);

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout());
                frame.setSize(640, 480);
                frame.setVisible(true);

                JMenuBar jmb = new JMenuBar();

                JMenu jmFile = new JMenu("File");
                JMenu jmInsert = new JMenu("Insert");
                JMenu jmEdit = new JMenu("Edit");

                JMenuItem jmiNew = new JMenuItem("New");
                JMenuItem jmiOpen = new JMenuItem("Open");
                JMenuItem jmiClose = new JMenuItem("Close");
                JMenuItem jmiSave = new JMenuItem("Save");

                jmFile.add(jmiNew);
                jmFile.add(jmiOpen);
                jmFile.add(jmiClose);
                jmFile.add(jmiSave);

                JMenuItem jmiRectangle = new JMenuItem("Rectangle");
                jmiRectangle.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        shapes.add(new Rectangle(new Vector2(0,0), new Vector2(200, 100)));
                        drawingPanel.revalidate();
                        drawingPanel.updateUI();
                        frame.repaint();
                    }
                });

                JMenuItem jmiTriangle = new JMenuItem("Triangle");
                jmiTriangle.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ArrayList<Vector2> points = new ArrayList<>();
                        points.add(new Vector2(0, 200));
                        points.add(new Vector2(50,150));
                        points.add(new Vector2(100,200));
                        shapes.add(new Triangle(new Vector2(100, 100), points));
                        drawingPanel.revalidate();
                        drawingPanel.updateUI();
                        frame.repaint();
                    }
                });

                JMenuItem jmiEllipse = new JMenuItem("Ellipse");
                jmiEllipse.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        shapes.add(new Ellipse(new Vector2(0,0), 100));
                        //drawingPanel.revalidate();
                        //drawingPanel.updateUI();
                        frame.repaint();
                    }
                });
                jmInsert.add(jmiRectangle);
                jmInsert.add(jmiTriangle);
                jmInsert.add(jmiEllipse);

                JMenuItem jmiUndo = new JMenuItem("Undo");
                JMenuItem jmiRedo = new JMenuItem("Redo");

                jmEdit.add(jmiUndo);
                jmEdit.add(jmiRedo);

                jmb.add(jmFile);
                jmb.add(jmInsert);
                jmb.add(jmEdit);

                frame.setJMenuBar(jmb);



                //shapes.add(new Ellipse(new Vector2(0,0), 500));

                shapes.add(new Ellipse(new Vector2(0, 0), 100));
                frame.add(drawingPanel);


                drawingPanel.repaint();
                frame.repaint();
            }
        });
    }

}
