import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse_key_event extends JFrame implements KeyListener, MouseListener {
    private JLabel keyLabel, mouseLabel;

    public Mouse_key_event() {
        setTitle("Key and Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        keyLabel = new JLabel("Press any key", JLabel.CENTER);
        keyLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(keyLabel, BorderLayout.NORTH);

        mouseLabel = new JLabel("Perform mouse actions", JLabel.CENTER);
        mouseLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(mouseLabel, BorderLayout.SOUTH);

        addKeyListener(this);
        addMouseListener(this);

        setFocusable(true);
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        keyLabel.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyLabel.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyLabel.setText("Key Released: " + e.getKeyChar());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseLabel.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseLabel.setText("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseLabel.setText("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseLabel.setText("Mouse Entered the window");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseLabel.setText("Mouse Exited the window");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Mouse_key_event demo = new Mouse_key_event();
            demo.setVisible(true);
        });
    }
}
