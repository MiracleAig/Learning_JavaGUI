import javax.swing.*;
import java.awt.*;

public class LearningAboutPanels {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("PeakImage.png");


        JLabel label = new JLabel();
        label.setText("This is the peak!");
        label.setIcon(icon);
       //label.setVerticalAlignment(JLabel.CENTER);
       //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 75,75);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 350, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 350, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 600, 250);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }

}
