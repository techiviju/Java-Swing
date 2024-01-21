import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex_of_Label {
    public static void main(String[] args) {
        JFrame f =new JFrame("Frame of Label");

        JLabel l=new JLabel("vijay");
        JLabel l2=new JLabel("Label 2");
              

        l.setBounds(50,50,100,30);
       l2.setBounds(50,100,100, 30);


        f.add(l);
        f.add(l2);
       
        f.setSize(300,300);
        f.setVisible(true);
        // f.setLayout(null);

    }
}
