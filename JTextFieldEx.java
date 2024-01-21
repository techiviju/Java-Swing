import javax.swing.*;
public class JTextFieldEx {
    public static void main(String[] args) {
        JFrame f=new JFrame("Example JText");
        JTextField t1,t2;
        JButton b1=new JButton("Button");
        JLabel l1=new JLabel("Label");
        t1=new JTextField("First T Field");
        t1.setBounds(50,100,200,30);
        b1.setBounds(50,200,150,40);
        l1.setBounds(50,250,150,40);


        t2=new JTextField("Second T F");
        t2.setBounds(50,150,200,30);
        
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(l1);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
