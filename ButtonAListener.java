import javax.swing.*;
import java.awt.event.*;

public class ButtonAListener
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Listener Frame");
        final JTextField tf=new JTextField();
        JButton b=new JButton("Click here");
        tf.setBounds(50,50,150,20);
        b.setBounds(50,100,95,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Hello vijay");
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}