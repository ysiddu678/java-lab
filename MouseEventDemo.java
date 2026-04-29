import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

    String message = "";
    int x = 50, y = 100;

    public MouseEventDemo() {
    
        setTitle("AWT Mouse Event Demo");
        setSize(400, 200);
        setVisible(true);

        addMouseListener(this);
        addMouseMotionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }


    
    public void mouseClicked(MouseEvent me) {
        message = "Mouse Clicked at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

   
    public void mousePressed(MouseEvent me) {
        message = "Mouse Pressed at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

  
    public void mouseReleased(MouseEvent me) {
        message = "Mouse Released at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }


    public void mouseEntered(MouseEvent me) {
        message = "Mouse Entered the Frame at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }


    public void mouseExited(MouseEvent me) {
        message = "Mouse Exited the Frame at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

  

 
    public void mouseDragged(MouseEvent me) {
        message = "Mouse Dragged at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }


    public void mouseMoved(MouseEvent me) {
        message = "Mouse Moved at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

  
    public void paint(Graphics g) {
        g.drawString(message, x, y);
    }

    
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}