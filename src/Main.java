import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main (String[]args){
       JFrame frame = new JFrame();
       frame.setSize(500,500);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       JLabel label = new JLabel();
       label.setText("Hello, world!");
        frame.add(label);

    }

}