package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerInfo extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 25);
	JPanel panel;
	JLabel title1,title2,title3,title4,title5,title6,title7,title8;
	JTextField screen1,screen2,screen3,screen4;
	JButton next , v1;
	
	
	ImageIcon icon = new ImageIcon ("Image/4000.png");
	ImageIcon icon1 = new ImageIcon ("Image/ll.jpg");
	
	public CustomerInfo ()
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
		
		title1 = new JLabel("Name                  : ");
		title1.setBounds(70,150,380,25);
		title1.setFont(font);
		panel.add(title1);
		
		title2 = new JLabel("Email                  : ");
		title2.setBounds(70,210,380,25);
		title2.setFont(font);
		panel.add(title2);
		
		title3 = new JLabel("Contact Number : ");
		title3.setBounds(70,270,380,25);
		title3.setFont(font);
		panel.add(title3);
		
		title4 = new JLabel("Date                    : ");
		title4.setBounds(70,320,380,25);
		title4.setFont(font);
		panel.add(title4);
		
		
		title5 = new JLabel(".......................................");
		title5.setBounds(285,160,380,25);
		title5.setFont(font);
		panel.add(title5);
		
		title6 = new JLabel("......................................");
		title6.setBounds(285,220,380,25);
		title6.setFont(font);
		panel.add(title6);
		
		title7 = new JLabel(".......................................");
		title7.setBounds(285,280,380,25);
		title7.setFont(font);
		panel.add(title7);
		
		title8 = new JLabel(".......................................");
		title8.setBounds(285,330,380,25);
		title8.setFont(font);
		panel.add(title8);
		
		screen1 = new JTextField();
		screen1.setBounds(285,150,380,30);
		screen1.setFont(font);
		screen1.setBackground(new Color(200,200,200));
		screen1.setOpaque(false);
		screen1.setBorder(BorderFactory.createEmptyBorder());
		panel.add(screen1);
		
		screen2 = new JTextField();
		screen2.setBounds(285,210,380,30);
		screen2.setFont(font);
		screen2.setBackground(new Color(200,200,200));
		screen2.setOpaque(false);
		screen2.setBorder(BorderFactory.createEmptyBorder());
		panel.add(screen2);
		
		screen3 = new JTextField();
		screen3.setBounds(285,270,380,30);
		screen3.setFont(font);
		screen3.setBackground(new Color(200,200,200));
		screen3.setOpaque(false);
		screen3.setBorder(BorderFactory.createEmptyBorder());
		panel.add(screen3);
		
		screen4 = new JTextField();
		screen4.setBounds(285,320,380,30);
		screen4.setFont(font);
		screen4.setBackground(new Color(200,200,200));
		screen4.setOpaque(false);
		screen4.setBorder(BorderFactory.createEmptyBorder());
		panel.add(screen4);
		
		
		next = new JButton("Next");
		next.setBounds(20,570,170,50);
		next.setFocusPainted(false);
		next.setBorder(BorderFactory.createEmptyBorder());
		next.setFont(font);
		next.addActionListener(this);
		panel.add(next);
		
		v1 = new JButton("If don't want to fill this form");
		v1.setBounds(200,570,170,50);
		v1.setFocusPainted(false);
		v1.setBorder(BorderFactory.createEmptyBorder());
		//v1.setFont(font);
		v1.addActionListener(this);
		panel.add(v1);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(next == ae.getSource())
			{
			if(isAnyDataEmpty())
			{
				JOptionPane.showMessageDialog(this, "Please Provide All The necessary Information,If you provide you will get some discount from us", "Information",
						JOptionPane.INFORMATION_MESSAGE);
			}}
			
		    else if (v1 == ae.getSource())
			{
			    MenuCard menu = new MenuCard ();
			
				this.setVisible(false);
				menu.setVisible(true);
			}
			else {
				System.out.println("==========");
			}
		
		}
	public boolean isAnyDataEmpty(){
		return (screen1.getText().isEmpty() || 
			screen2.getText().isEmpty() ||
			screen3.getText().isEmpty() ||
			screen4.getText().isEmpty() );
	}

	
	
}