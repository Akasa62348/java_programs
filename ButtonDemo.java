import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemoFrame extends JFrame implements ActionListener {
    JButton b1, b2, b3;

    ButtonDemoFrame(String title) {
        super(title);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.RED); // Set background color to red
        c.setLayout(null); // Disable default layout for absolute positioning

        // Adding first button
        b1 = new JButton("Say Hello");
        b1.setBounds(100, 100, 150, 50);
        b1.addActionListener(this); // Add event listener
        c.add(b1);

        // Adding second button
        b2 = new JButton("Kya Hall Hai");
        b2.setBounds(100, 200, 150, 50);
        b2.addActionListener(this); // Add event listener
        c.add(b2);

        // Adding third button
        b3 = new JButton("Click Here");
        b3.setBounds(100, 300, 150, 50);
        b3.addActionListener(this); // Add event listener
        c.add(b3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check which button is clicked and show appropriate message
        if (e.getSource() == b1) {
            JOptionPane.showMessageDialog(this, "HelloButton is clicked");
        } else if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(this, "Kya Hall Hai button is clicked");
        } else if (e.getSource() == b3) {
            JOptionPane.showMessageDialog(this, "Click Here button is clicked");
        }
    }
}

public class ButtonDemo {
    public static void main(String[] args) {
        ButtonDemoFrame demoFrame = new ButtonDemoFrame("Button Demo");
        demoFrame.setVisible(true);
    }
}
