import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUIFrames implements ActionListener {
    JFrame f1, f2;
    JLabel l1, l2;
    JButton b1, b2;

    public GUIFrames() {
        // Initialize frames
        f1 = new JFrame("Frame1");
        f2 = new JFrame("Frame2");

        // Initialize labels
        l1 = new JLabel("Welcome to the first frame");
        l2 = new JLabel("Welcome to the second frame");

        // Initialize buttons
        b1 = new JButton("Next");
        b2 = new JButton("Previous");

        // Set frame properties
        f1.setSize(500, 500);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        f2.setSize(500, 500);
        f2.setLayout(new FlowLayout());
        f2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Add components to frame 1
        f1.add(l1);
        f1.add(b1);

        // Add components to frame 2
        f2.add(l2);
        f2.add(b2);

        // Add action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Make frame 1 visible initially, frame 2 invisible
        f1.setVisible(true);
        f2.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f1.setVisible(false);
            f2.setVisible(true);
        } else if (e.getSource() == b2) {
            f2.setVisible(false);
            f1.setVisible(true);
        }
    }
}

public class FrameSwitchFromOneToAnother {
    public static void main(String[] args) {
        // Create the GUIFrames instance to show the GUI
        //SwingUtilities.invokeLater(GUIFrames::new);
        new GUIFrames();
    }
}
