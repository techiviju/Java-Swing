import javax.swing.*;
public class ExOfB
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Welcome to my Frmae");
        JButton b1=new JButton("click here");
        JButton b=new JButton("Okay");
        
        b.setBounds(60,300,500,90);
        b1.setBounds(90,500,300,60);
        f.add(b1);
        f.add(b);
        f.setSize(600,400);
        f.setVisible(true);
        f.setVisible(true);

    }
}