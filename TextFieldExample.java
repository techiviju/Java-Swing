import javax.swing.*;
import java.awt.event.*;
public class TextFieldExample implements ActionListener{
    JFrame f=new JFrame("Ex Of Text F");
    JTextField t1,t2,t3;
    JButton b1,b2;
    TextFieldExample(){
    
    
    
     t1=new JTextField();
    t1.setBounds(50,50,150,20);
    t2=new JTextField();
    t2.setBounds(50,100,150,20);

    t3=new JTextField();
    t3.setBounds(50,150,10,20);

    b1=new JButton("B1");
    b1.setBounds(50,200,50,50);

    b2=new JButton("B2");
    b2.setBounds(120,200,50,50);

    b1.addActionListener(this);
    b2.addActionListener(this);

    f.add(t1);f.add(t2);f.add(t3);
    f.add(b1);f.add(b2);

    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);


}
public void actionPerformed(ActionEvent e)
{
    String s1=t1.getText();
    String s2=t2.getText();

    int a=Integer.parseInt(s1);
    int b=Integer.parseInt(s2);

    int c=0;

    if(e.getSource()==b1)
    {
        c=a+b;
    }
    else if(e.getSource()==b2)
    {
        c=a-b;
    }
    String result=String.valueOf(c);
    
    t3.setText(result);
}
public static void main(String[] args) {
    new TextFieldExample();
}
}