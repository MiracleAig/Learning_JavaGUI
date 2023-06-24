import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){

        this.setTitle("Java GUI"); // sets the title of the frame
        this.setSize(500,500); // sets the size of the frame
        this.setResizable(false); // stops frame from being resized
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes application when frame is closed
        this.setVisible(true); // makes the fame visible

        ImageIcon AppIcon = new ImageIcon("AppLogoNew.png"); // creates an icon image
        this.setIconImage(AppIcon.getImage()); // changes icon of the frame
        this.getContentPane().setBackground(Color.ORANGE); // changes color of the background
    }

}
