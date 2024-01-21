import javax.swing.*;
public class Label
{
    public static void main(String[] args) {
        JFrame f=new JFrame("Ex of Frame");
        JLabel l1=new JLabel("first Label");
        l1.setBounds(50,50,100,30);

        JLabel l2=new JLabel("Second Label");
        l2.setBounds(50,100,100,50); 

        f.add(l1);
        f.add(l2);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}