import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class guiMouse extends JFrame{
    private JPanel mousePanel;
    private JLabel statusBar;

    public guiMouse(){
        super("title");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel,BorderLayout.CENTER);

        statusBar = new JLabel("default");
        add(statusBar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);

    }

    private class HandlerClass implements MouseListener, MouseMotionListener{
        public void mouseClicked(MouseEvent event){
            statusBar.setText(String.format("clicked at %d %d", event.getX(),event.getY()));
        }
        public void mousePressed(MouseEvent event){
            statusBar.setText("mouse pressed");
        }
        public void mouseReleased(MouseEvent event){
            statusBar.setText("mouse released");
        }
        public void mouseEntered(MouseEvent event){
            statusBar.setText("entered area");
            mousePanel.setBackground(Color.RED);
        }
        public void mouseExited(MouseEvent event){
            statusBar.setText("mouse exited");
            mousePanel.setBackground(Color.WHITE);
        }
        public void mouseDragged(MouseEvent event){
            statusBar.setText("mouse dragged");

        }
        public void mouseMoved(MouseEvent event){
            statusBar.setText("moved mouse");
        }
    }
}