import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class gui extends JFrame{

    // private JLabel item1;

    // public gui(){
    //     super("title bar");
    //     setLayout(new FlowLayout());

    //     item1 = new JLabel("this si a sentence");
    //     item1.setToolTipText("show on hove");
    //     add(item1);
    // }
    public static void main(String[] args){
        // String fn = JOptionPane.showInputDialog("Enter first number");
        // String sn = JOptionPane.showInputDialog("Enter second number");
        
        // int num1 = Integer.parseInt(fn);
        // int num2 = Integer.parseInt(sn);
        // int sum = num1 + num2;

        // JOptionPane.showMessageDialog(null,"ans is " +sum,"the title", JOptionPane.PLAIN_MESSAGE);
        
        // gui kus = new gui();
        // kus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // kus.setSize(275,180);
        // kus.setVisible(true);

        tuna kus = new tuna();
        kus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kus.setSize(275,180);
        kus.setVisible(true);
    }
}