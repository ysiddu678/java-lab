import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {

    String message = "";
    int x = 50, y = 100;

    public KeyEventDemo() {
        setTitle("AWT Key Event Demo");
        setSize(400, 200);

        addKeyListener(this);

        setFocusable(true);
        requestFocus();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true); // keep this last
    }

    public void keyPressed(KeyEvent ke) {
        message = "Key Pressed: " + ke.getKeyCode();
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        message = "Key Typed: " + ke.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        message = "Key Released: " + ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, x, y);
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
