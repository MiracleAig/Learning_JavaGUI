import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame   {

    JButton button;
    MyFrame(){
        ImageIcon icon = new ImageIcon("PeakImage.png");


        button = new JButton();
        button.setBounds(200, 100, 200, 200);
        button.addActionListener(e -> System.out.println("foo"));
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);
    }


}
