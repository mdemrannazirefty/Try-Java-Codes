package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class OnlinePayment extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 80);
	JPanel panel;
	JButton b1,b2,b3;
	
	
	ImageIcon icon = new ImageIcon ("Image/4000.png");
	ImageIcon icon1 = new ImageIcon ("Image/5555.jpg");
	ImageIcon icon2 = new ImageIcon ("Image/tty1.jpg");
	ImageIcon icon3 = new ImageIcon ("Image/nn1.png");
	ImageIcon icon4 = new ImageIcon ("Image/ii1.jpg");
	
	
	public OnlinePayment ()
	{
		super("My Coffee Shop");
		this.setSize(1200,675);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setIconImage(icon.getImage());
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,0,1200,675);
		panel.setOpaque(false);
		this.add(panel);
		this.setLayout(null);
		
		JLabel background = new JLabel(icon1);
		background.setBounds(0,0,1200,675);
		this.add(background);
		
		b1 = new JButton("Rocket");
		b1.setIcon(icon2);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		b1.setBounds(200,200,195,200);
		b1.setFocusPainted(false);
		b1.addActionListener(this);
		panel.add(b1);
		
		b2 = new JButton("Nagad");
		b2.setIcon(icon3);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b1.setOpaque(false);
		b2.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		b2.setBounds(500,200,200,200);
		b2.setFocusPainted(false);
		b2.addActionListener(this);
		panel.add(b2);
		
		b3 = new JButton("Bikash");
		b3.setIcon(icon4);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		b3.setBounds(800,200,180,198);
		b3.setFocusPainted(false);
		b3.addActionListener(this);
		panel.add(b3);
		
		
		
		this.setVisible(true);
		
}
	public void actionPerformed(ActionEvent ae)
	{
		if(b1 == ae.getSource())
		{
			LastPage t = new LastPage();
			
			this.setVisible(false);
			t.setVisible(true);
		}
		
		else if(b2 == ae.getSource())
		{
			LastPage t = new LastPage();
			
			this.setVisible(false);
			t.setVisible(true);
		}
		
		else if(b3 == ae.getSource())
		{
			LastPage t = new LastPage();
			
			this.setVisible(false);
			t.setVisible(true);
		}
		
	}
}