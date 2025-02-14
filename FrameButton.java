import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
class MyButtonFrame extends JFrame{
    JButton b1,b2,b3;
    MyButtonFrame(String title){
        super(title);
        Container c = getContentPane();
        c.setBackground(Color.red);
        c.setLayout(null);
        //Adding Buttons
        b1 = new JButton("Hi");
        b1.setBounds(100,100,100,30);
        c.add(b1);
        b2 = new JButton("Hello");
        b2.setBounds(220,100,100,30);
        c.add(b2);
        b3 = new JButton("Greet");
        b3.setBounds(340,100,100,30);
        c.add(b3);
    }
}
public class FrameButton {
    public static void main(String[] args) {
        MyButtonFrame fm = new MyButtonFrame("My Button Frame");
        fm.setSize(400,400);
        fm.setVisible(true);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}