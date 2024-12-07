import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30; 
		JPanel p1,p2;
		
	public Calculator()
	{
		super(" Calculator ");
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(400,200));
		p1.setBackground(Color.white);
		p1.setLayout(null);
		
		l1 = new JLabel(" Standard ");
		l1.setFont(new Font("Arial",Font.BOLD,20));
		l1.setForeground(Color.black);
		l1.setBounds(30,20,140,350);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(400,300));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
		
		b1 = new JButton("1");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,10));
		b1.setForeground(Color.green);
		b1.setBounds(0,300,90,50);
		//b1.addActionListener(this); 
		p2.add(b1);
		
		b2 = new JButton("2");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.green);
		b2.setBounds(100,300,90,50);
		//b2.addActionListener(this);
		p2.add(b2);
		
		b3 = new JButton("3");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.green);
		b3.setBounds(2000,300,90,50);
		//b3.addActionListener(this);
		p2.add(b3);
		
		b4 = new JButton("4");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.green);
		b4.setBounds(3000,300,90,50);
		//b4.addActionListener(this);
		p2.add(b4);
		
		b1.addActionListener(this); 
		b2.addActionListener(this);  
		b3.addActionListener(this);  
		b4.addActionListener(this);
	}
}