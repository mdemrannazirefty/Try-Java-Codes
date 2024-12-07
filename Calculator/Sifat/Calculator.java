import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator  extends JFrame implements ActionListener
{
		JLabel l1,l2;
		
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20; 
		JPanel p1,p2,p3;
		
	public Calculator()
	{
		super(" Calculator ");
		this.setSize(350,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(350,50));
		p1.setBackground(Color.WHITE);
		p1.setLayout(null);
		
		l1 = new JLabel("Standard");
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setForeground(Color.WHITE);
		l1.setBounds(30,5,100,30);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(350,150));
		p2.setBackground(Color.WHITE);
		p2.setLayout(null);
	    
		l2 = new JLabel("0");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBounds(280,70,30,40);
		p2.add(l2);
		
		p3 = new JPanel();
		p3.setSize(new Dimension(350,450));
		p3.setBackground(Color.WHITE);
		p3.setLayout(null);
	    
				b5 = new JButton("7");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.black);
		b5.setBounds(0,200,85,50);
		b5.addActionListener(this);
		p3.add(b5);
				b6 = new JButton("8");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b6.setForeground(Color.black);
		b6.setBounds(85,200,85,50);
		b6.addActionListener(this);
		p3.add(b6);
				b7 = new JButton("9");
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b7.setForeground(Color.black);
		b7.setBounds(170,200,85,50);
		b7.addActionListener(this);
		p3.add(b7);
				b8 = new JButton("*");
		b8.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b8.setForeground(Color.black);
		b8.setBounds(255,200,85,50);
		b8.addActionListener(this);
		p3.add(b8);		b9 = new JButton("4");
		
		b9.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b9.setForeground(Color.black);
		b9.setBounds(0,250,85,50);
		b9.addActionListener(this);
		p3.add(b9);
		
				b10 = new JButton("5");
		b10.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b10.setForeground(Color.black);
		b10.setBounds(85,250,85,50);
		b10.addActionListener(this);
		p3.add(b10);
		
				b11 = new JButton("6");
		b11.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b11.setForeground(Color.black);
		b11.setBounds(170,250,85,50);
		b11.addActionListener(this);
		p3.add(b11);
		
				b12 = new JButton("-");
		b12.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b12.setForeground(Color.black);
		b12.setBounds(255,250,85,50);
		b12.addActionListener(this);
		p3.add(b12);
		
				b13 = new JButton("1");
		b13.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b13.setForeground(Color.black);
		b13.setBounds(0,300,85,50);
		b13.addActionListener(this);
		p3.add(b13);
		
				b14 = new JButton("2");
		b14.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b14.setForeground(Color.black);
		b14.setBounds(85,300,85,50);
		b14.addActionListener(this);
		p3.add(b14);
		
		
				b15 = new JButton("3");
		b15.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b15.setForeground(Color.black);
		b15.setBounds(170,300,85,50);
		b15.addActionListener(this);
		p3.add(b15);
		
		
		
		
		
				b16 = new JButton("+");
		b16.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b16.setForeground(Color.black);
		b16.setBounds(255,300,85,50);
		b16.addActionListener(this);
		p3.add(b16);
		
		
		
		
				b17 = new JButton("%");
		b17.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b17.setForeground(Color.black);
		b17.setBounds(0,350,85,50);
		b17.addActionListener(this);
		p3.add(b17);
		
		
		
		
				b18 = new JButton("0");
		b18.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b18.setForeground(Color.black);
		b18.setBounds(85,350,85,50);
		b18.addActionListener(this);
		p3.add(b18);
		
		
		
		
				b19 = new JButton(".");
		b19.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b19.setForeground(Color.green);
		b19.setBounds(170,350,85,50);
		b19.addActionListener(this);
		p3.add(b19);
		
		
		
		
				b20 = new JButton("=");
		b20.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b20.setForeground(Color.black);
		b20.setBounds(255,350,85,50);
		b20.addActionListener(this);
		p3.add(b20);
		
		
		
		
		
        this.add(p1);		
        this.add(p2);
		this.add(p3);
	}

		
public void actionPerformed(ActionEvent ae){}
}
