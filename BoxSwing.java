import javax.swing.*;
import java.awt.*;

public class BoxSwing extends JFrame
{
    JFrame jf;
    BoxSwing(){
         jf=new JFrame("Frame");
        JButton b=new JButton("Click");
        b.setBounds(30,200,400,50);
        

        add(b);
        // jf.add(b1);
        setSize(300,500);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new BoxSwing();
    }
}