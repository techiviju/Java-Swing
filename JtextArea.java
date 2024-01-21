import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JtextArea {
    public static void main(String[] args) {
        JFrame f=new JFrame("Text area");

        JTextArea ta=new JTextArea("Welcome to the java");
        // JButton b=new JButton("Click here");

        ta.setBounds(10,30,200,200);
        // b.setBounds(50,200,50,50);

        f.add(ta);
        // f.add(b);

        f.setSize(400,400);
        // f.setLayout(null); //not in there
        f.setVisible(true);
    }
    
}
