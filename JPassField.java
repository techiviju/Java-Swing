import javax.swing.*;

public class JPassField {
    public static void main(String[] args) {
        JFrame f=new JFrame("Pass Field");
        JPasswordField value=new JPasswordField();
        JButton b=new JButton("Click");
        JLabel l1=new JLabel("password");

        value.setBounds(100,100,100,30);
        l1.setBounds(20, 100, 80, 30);
        b.setBounds(10, 150, 60, 30);

        f.add(l1);
        f.add(b);
        f.add(value);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
