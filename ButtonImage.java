import javax.swing.*;
import java.awt.*;

public class ButtonImage
{
    // JFrame f;
    ButtonImage()
    {
       JFrame f=new JFrame("Button image");
        JButton b=new JButton(new ImageIcon("C:\\Buttoncls.jpg"));
        b.setBounds(100,100,100,40);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]){
            new ButtonImage();
    }
}