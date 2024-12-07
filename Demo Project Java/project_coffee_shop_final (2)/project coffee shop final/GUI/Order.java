package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Order extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 80);
	JPanel panel;
	JButton next;
	
	
	ImageIcon icon = new ImageIcon ("Image/coffee.jpg");
	ImageIcon icon1 = new ImageIcon ("ee.jpg");
	
	public Order ()
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
		
		//JLabel background = new JLabel(icon1);
		//background.setBounds(0,0,1200,675);
	    //this.add(background);
		
		next = new JButton("NEXT..");
		next.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		next.setBounds(1030,590,130,30);
		next.setFocusPainted(false);
		next.addActionListener(this);
		panel.add(next);
		
		this.setVisible(true);
	}
	
		public void actionPerformed(ActionEvent ae)
		{
			
			if(next == ae.getSource())
			{
			    Payment f = new Payment ();
				this.setVisible(false);
				f.setVisible(true);

				//System.exit(0);
			}
}
}