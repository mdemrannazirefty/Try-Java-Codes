package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Payment extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 80);
	JPanel panel;
	JButton online,handcash;
	
	
	ImageIcon icon = new ImageIcon ("Image/hhh.jpg");
	ImageIcon icon1 = new ImageIcon ("Image/666.jpg");
	//ImageIcon icon2 = new ImageIcon ("666.jpg");
	
	
	public Payment ()
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
		
		online = new JButton("Online Payment");
		online.setBackground(Color.BLACK);
		online.setForeground(Color.WHITE);
		online.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		online.setBounds(800,180,300,100);
		online.setFocusPainted(false);
		online.addActionListener(this);
		panel.add(online);
		
		handcash = new JButton("Handcash Payment");
		handcash.setBackground(Color.BLACK);
		handcash.setForeground(Color.WHITE);
		handcash.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		handcash.setBounds(800, 380,300,100);
		handcash.setFocusPainted(false);
		handcash.addActionListener(this);
		panel.add(handcash);
		
		this.setVisible(true);
	}	
	
	public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource() == handcash)
			{
			    JOptionPane.showMessageDialog(this, "Thanks for your order our waiter will collect your bill in sort time", "Information",
				JOptionPane.INFORMATION_MESSAGE);
			}
			if (ae.getSource() == online)
			{
				OnlinePayment e = new OnlinePayment();
				this.setVisible(false);
				e.setVisible(true);
			}
		}
}