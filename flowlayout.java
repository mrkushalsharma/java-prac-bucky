import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class flowlayout extends JFrame{
    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;

    public flowlayout(){
        super("title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        lb = new JButton("left");
        add(lb);
        lb.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }

            }
        );

        cb = new JButton("center");
        add(cb);
        cb.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.CENTER);
                    layout.layoutContainer(container);
                }
                
            }
        );

        rb = new JButton("right");
        add(rb);
        rb.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.RIGHT);
                    layout.layoutContainer(container);
                }
                
            }
        );

    }

    public static void main(String[] args){
        flowlayout l = new flowlayout();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setSize(300,300);
        l.setVisible(true);
    }
}