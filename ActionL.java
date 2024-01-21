import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
public class ActionL{
    
    public static void main(String[] args) {
      
        JFrame f=new JFrame("Example Of Listener");
        final   JTextField tf=new JTextField();
        tf.setBounds(50,50,200,40);
        JButton b=new JButton("Click");
        b.setBounds(50, 100, 80, 20);

        JLabel l=new JLabel();
        l.setBounds(50,110,100,80);
        
        f.add(b);f.add(tf);f.add(l);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String s=tf.getText();
                l.setText(s);

            }
        });

    }
    // public void actionPerformed(ActionEvent e)
    // {
    //     tf.setText("welcome to vijay");
    // }
}
