import javax.swing.*;
public class ExOfButton
{
public static void main(String args[])
{
	JFrame fr=new JFrame("Vijay Frame");
	JButton b1=new JButton("Click");
	
	b1.setBounds(300,500,600,800);
	fr.add(b1);
	fr.setVisible(true);
	fr.setSize(300,400);
}
}  