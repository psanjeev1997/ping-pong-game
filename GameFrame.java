import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame()
    {
        setTitle("Pong Game");
        //setLayout(null); --not required
        getContentPane().setBackground(Color.black);
        GamePanel panel=new GamePanel();
        add(panel);
        //setSize(1000,555); --not required as used in panel
        //setFocusable(true); --not required as used in panel
        pack();
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
    }
}