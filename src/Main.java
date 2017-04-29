
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
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
                JMenuItem jmiTriangle = new JMenuItem("Triangle");
                JMenuItem jmiEllipse = new JMenuItem("Ellipse");

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

            }
        });
    }

}
