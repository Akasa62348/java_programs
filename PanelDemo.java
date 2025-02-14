import java.awt.*;
import javax.swing.*;

// Custom Panel Class
class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Refresh the panel

        // Set font and draw text
        Font fnt = new Font("arial", Font.BOLD, 60);
        g.setFont(fnt);
        
        g.setColor(Color.BLUE);
        g.drawString("I am Akash Singh", 100, 100);
        
        g.setColor(Color.RED);
        g.drawString("I live in Daltonganj", 100, 200);
        g.drawString("PROGRAMMING CLASSES", 100, 300);

        // Draw a rectangle using lines
        g.setColor(Color.BLACK); // Set color for rectangle
        g.drawLine(50, 50, 200, 50); // Top side
        g.drawLine(50, 50, 50, 200); // Left side
        g.drawLine(200, 50, 200, 200); // Right side
        g.drawLine(50, 200, 200, 200); // Bottom side
    }
}

// Custom Frame Class
class MyFrame extends JFrame {
    MyFrame(String str) {
        super(str); // Set title of the frame
        Container c = getContentPane();
        MyPanel p = new MyPanel(); // Create custom panel
        c.add(p); // Add panel to frame
    }
}

// Main Class
public class PanelDemo {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame("My Panel Intro"); // Create frame
        mf.setSize(800, 500); // Set frame size
        mf.setVisible(true); // Make frame visible
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
    }
}
