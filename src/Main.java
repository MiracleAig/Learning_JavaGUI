import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main (String[]args){


        ImageIcon image = new ImageIcon("PeakImage.png");
        Border border = BorderFactory.createLineBorder(Color.RED,5);

       JLabel label = new JLabel();
       label.setText("This is the peak");
       label.setBackground(Color.BLACK);
       label.setForeground(Color.WHITE); // set font color of text
       label.setFont(new Font("Verdana",Font.BOLD,20));// set font of text
       label.setHorizontalTextPosition(JLabel.CENTER); // set the text LCR of image icon
       label.setIcon(image); // set the icon of the text using an image
       label.setIconTextGap(-45); // set the gap of the text from the image can be +,-
       label.setVerticalTextPosition(JLabel.TOP); // set the vertical position of text to the top
       label.setBorder(border);
       label.setVerticalAlignment(JLabel.CENTER);
       label.setHorizontalAlignment(JLabel.CENTER);
       //label.setBounds(0, 0, 250, 250); // set X,Y positions within the frame as well as dimentions
       label.setOpaque(true);

       JFrame frame = new JFrame("Java GUI");
       //frame.setSize(500,500);
       //frame.setLayout(null);
       frame.setVisible(true);
       frame.add(label);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.pack();


    }

}
