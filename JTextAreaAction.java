import javax.swing.*;
import java.awt.event.*;
public class JTextAreaAction implements ActionListener{
    JLabel l1,l2;
    JTextArea area;
    JButton b;
    JTextAreaAction()
    {
        JFrame f=new JFrame("JText Area Frame");
        l1=new JLabel();
        l1.setBounds(50,25,100,30);

        l2=new JLabel();
        l2.setBounds(160,25,100,30);

        area=new JTextArea();
        area.setBounds(20,75,250,200);

        b=new JButton("COunt Word");
        b.setBounds(100,300,120,30);

        b.addActionListener(this);  

        f.add(l1);f.add(l2);f.add(area);f.add(b);

        f.setSize(500,500);
      f.setLayout(null);
        f.setVisible(true);
      

    }
    public void actionPerformed(ActionEvent e)
    {
        String text=area.getText();
        String word[]=text.split("\\s");
        l1.setText("word : " +word.length);
        l2.setText("Character : "+text.length());
    }
    public static void main(String[] args) {
        new JTextAreaAction();
    }
}
