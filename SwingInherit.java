import javax.swing.*;
public class SwingInherit extends JFrame
{
    JFrame f;
    SwingInherit()
    {
        //f =new JFrame("this is Inheritance Frame Swing ");
        JButton b = new JButton("Inherit");
        b.setBounds(900,600.800,600);
        add(b);
        setSize(600,800);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new SwingInherit();

    }
}