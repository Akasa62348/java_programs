import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calc extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5;
	JTextField t1,t2,t3;
	Calc(String title)
	{
		super(title);
		Container c=this.getContentPane();
		c.setBackground(Color.gray);
		c.setLayout(null);

		l1=new JLabel("First No:");
		l1.setBounds(50,50,100,40);
		c.add(l1);

		t1=new JTextField();
		t1.setBounds(120,50,150,30);
		c.add(t1);

		l2=new JLabel("Second No:");
		l2.setBounds(50,100,100,40);
		c.add(l2);

		t2=new JTextField();
		t2.setBounds(120,100,150,30);
		c.add(t2);

		l3=new JLabel("Result:");
		l3.setBounds(50,150,100,40);
		c.add(l3);

		t3=new JTextField();
		t3.setBounds(120,150,150,30);
		c.add(t3);

		b1=new JButton("SUM");
		b1.setBounds(50,200,80,40);
		c.add(b1);

		b2=new JButton("SUB");
		b2.setBounds(140,200,80,40);
		c.add(b2);

		b3=new JButton("MUL");
		b3.setBounds(230,200,80,40);
		c.add(b3);

		b4=new JButton("DIV");
		b4.setBounds(320,200,80,40);
		c.add(b4);

		b5=new JButton("MOD");
		b5.setBounds(410,200,80,40);
		c.add(b5);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	int n1,n2,r;
	String s;
	n1=Integer.parseInt(t1.getText());	
	n2=Integer.parseInt(t2.getText());
	if(ae.getSource()==b1){
		r=n1+n2;
		s=Integer.toString(r);
		t3.setText(s);
		}
	else if(ae.getSource()==b2)
	{
		r=n1-n2;
		t3.setText(Integer.toString(r));
	}
	else if(ae.getSource()==b3)
	{
		r=n1*n2;
		t3.setText(Integer.toString(r));
	}
	else if(ae.getSource()==b4)
	{
		r=n1/n2;
		t3.setText(Integer.toString(r));
	}
	else if(ae.getSource()==b5)
	{
		r=n1%n2;
		t3.setText(Integer.toString(r));
	}

	}
}
class simplecalc
{
	public static void main(String[] args) {
		Calc frm=new Calc("Calculator");
		frm.setSize(700,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}