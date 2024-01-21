// This is a Constructor Swing 
import javax.swing.*;
public class SwingConStru
{
    JFrame f;

    SwingConStru()
    {
        f=new JFrame("this is Constructor Frame");
        JButton b=new JButton("Click here");
        b.setBounds(900,300,500,600);
        f.add(b);
        f.setSize(500,800);
        f.setVisible(true);
    }
public static void main(String args[])
{
    new SwingConStru();
}
}
