import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Welcome extends JFrame implements ActionListener{
	
	JFrame Welcome ;
	JPanel mainPane , advertisingPane ,btnPane;
	JLabel lbllogo, lblwelcome, lblContact,  lblOurSer ;
	JButton LoginBtn , signUpBtn, adminBtn, btnService1, btnService2, btnService3;
	
	
	public Welcome() {
	
	
	super(" Welcome ");
	this.setBounds(new Rectangle(00,00,540,420));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.setResizable(false); //prevent from being resize
	
	mainPane = new JPanel();
	mainPane.setBounds(0,0,540,160);
	mainPane.setBackground(Color.decode("#D2EAF5"));
	mainPane.setLayout(null);
    this.add(mainPane);
	
	
	
	
	
	ImageIcon image = new ImageIcon("image/logo24.png");  //Create a image icon
	
	
	lbllogo = new JLabel();
	lbllogo.setText(" "); 
	
	lbllogo.setIcon(image);
	
	lbllogo.setOpaque(true);
	lbllogo.setBounds(0,0,250,130);
	mainPane.add(lbllogo);
	
	
	
	
	
	
	lblContact = new JLabel("   ",JLabel.RIGHT);                               //text ALlignment in contructor
	lblContact.setText(" Contact Us: 420  ");                       //set text of label
	lblContact.setFont(new Font("Cooper Black MS",Font.PLAIN,18));
	lblContact.setOpaque(true);                                       //for color.. paint
	lblContact.setForeground(Color.decode("#00558D"));
	lblContact.setBackground(Color.decode("#D2EAF5"));          //COlor decode for hex color
	lblContact.setBounds(250,0,280,130);
	mainPane.add(lblContact);
	

    lblwelcome = new JLabel("", JLabel.CENTER);
	lblwelcome.setText("Welcome to 24/7 Mechanics ");  //set text of label
	lblwelcome.setFont(new Font("Californian FB MS",Font.PLAIN,17));
	lblwelcome.setOpaque(true);
	lblwelcome.setForeground(Color.decode("#00558D"));
	lblwelcome.setBackground(Color.decode("#129db3")); 
	lblwelcome.setBounds(0,130,540,30);
	mainPane.add(lblwelcome);
	
	
	
	advertisingPane = new JPanel();
	advertisingPane.setBounds(0,160,540,180);
	advertisingPane.setBackground(Color.decode("#D2EAF5"));
	advertisingPane.setLayout(null);
    this.add(advertisingPane);
	
	lblOurSer = new JLabel();                               //text ALlignment in contructor
	lblOurSer.setText(" Our Services :  ");                       //set text of label
	lblOurSer.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblOurSer.setOpaque(true);                                       //for color.. paint
	lblOurSer.setForeground(Color.decode("#00558D"));
	lblOurSer.setBackground(Color.decode("#D2EAF5"));          //COlor decode for hex color
	lblOurSer.setBounds(0,0,540,25);
	advertisingPane.add(lblOurSer);
	
	
	
	ImageIcon imageD = new ImageIcon("image/Diagnosis24.png"); 
	
	btnService1 = new JButton();
	btnService1.setText(" ");  //set text of label
	btnService1.setIcon(imageD);
	btnService1.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	btnService1.setForeground(Color.white);
	btnService1.setBounds(0,25,290,80);
	btnService1.setFocusable(false);
	btnService1.setBorder(null);
	btnService1.setContentAreaFilled(false); //for remove 3d / or making flat
	btnService1.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
            btnService1.setIcon(new ImageIcon("image/HighlightLogo/Diagnosis24H.png"));
		   
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			btnService1.setIcon(new ImageIcon("image/Diagnosis24.png"));
			
		}
    });
		
    btnService1.addActionListener(this);
	advertisingPane.add(btnService1);
	
	
	
	ImageIcon imageB = new ImageIcon("image/Bikewash24.png");
	btnService2 = new JButton();
	btnService2.setText(" ");  //set text of label
	btnService2.setIcon(imageB);
	btnService2.setOpaque(true);
	btnService2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	btnService2.setForeground(Color.white);
	btnService2.setBounds(250,25,290,80);
	btnService2.setBounds(250,25,290,80);
	btnService2.setFocusable(false);
	btnService2.setBorder(null);
	btnService2.setContentAreaFilled(false);  //for remove 3d / or making flat
	btnService2.addMouseListener(new MouseAdapter() {    
		@Override
	    public void mouseEntered(java.awt.event.MouseEvent evt){
			
			btnService2.setIcon(new ImageIcon("image/HighlightLogo/Bikewash24H.png"));
		}
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt){
			
            btnService2.setIcon(new ImageIcon("image/Bikewash24.png"));
		}
		
	});
		
    btnService2.addActionListener(this);
	advertisingPane.add(btnService2);
	
	
	
	ImageIcon imageE = new ImageIcon("image/Emergancy24.png");
	btnService3 = new JButton();
	btnService3.setText(" ");  //set text of label
	btnService3.setIcon(imageE);
	btnService3.setOpaque(true);
	btnService3.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	btnService3.setForeground(Color.white);
	btnService3.setBounds(5,110,515,65);
	btnService3.setFocusable(false);
	btnService3.setBorder(null);
	btnService3.setContentAreaFilled(false);  //for remove 3d / or making flat
	btnService3.addMouseListener(new MouseAdapter(){    
		@Override
	    public void mouseEntered(java.awt.event.MouseEvent evt){
			
			btnService3.setIcon(new ImageIcon("image/HighlightLogo/Emergancy24H.png"));
			
            }
        
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt){
			
            btnService3.setIcon(new ImageIcon("image/Emergancy24.png"));
			
            }
    });
	btnService3.addActionListener(this);
	advertisingPane.add(btnService3);
	
	
	
	
	btnPane = new JPanel();
	btnPane.setBounds(0,335,540,50);
	btnPane.setBackground(Color.decode("#0586f0"));
	btnPane.setLayout(null);
    this.add(btnPane);
	
	
	adminBtn = new JButton("Admin Login");
	adminBtn.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	adminBtn.setForeground(Color.black);
	adminBtn.setBackground(Color.decode("#72ceed"));
	adminBtn.setBounds(20,10,135,30);
	adminBtn.setBorder(null);
	adminBtn.setFocusable(false);
	adminBtn.addActionListener(this);
	adminBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    adminBtn.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			adminBtn.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	btnPane.add(adminBtn);
	
	
	signUpBtn = new JButton("Sign Up");
	signUpBtn.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	signUpBtn.setForeground(Color.black);
	signUpBtn.setBackground(Color.decode("#72ceed"));
	signUpBtn.setBounds(180,10,135,30);
	signUpBtn.setBorder(null);
	signUpBtn.setFocusable(false);
	signUpBtn.addActionListener(this);
	signUpBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    signUpBtn.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			signUpBtn.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	btnPane.add(signUpBtn);
	
	
	LoginBtn = new JButton("Login");
	LoginBtn.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	LoginBtn.setForeground(Color.black);
	LoginBtn.setBackground(Color.decode("#72ceed"));
	LoginBtn.setBounds(340,10,135,30); 
	LoginBtn.setBorder(null);
	LoginBtn.setFocusable(false);
	LoginBtn.addActionListener(this);
	LoginBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    LoginBtn.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			LoginBtn.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	btnPane.add(LoginBtn);
	
	
	
	
	}
	
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==btnService1){
				
				this.setVisible(false);
			    Login l1 = new Login();
			    l1.setVisible(true);
				
				JOptionPane.showMessageDialog(l1, "Login Or Sign up","ERROR",JOptionPane.ERROR_MESSAGE); 
			}
			
			else if(ae.getSource()==btnService2){
				
				this.setVisible(false);
				Login l1 = new Login();
				l1.setVisible(true);
				
				JOptionPane.showMessageDialog(l1, "Login Or Sign up","ERROR",JOptionPane.ERROR_MESSAGE); 
			}
			
			else if(ae.getSource()==btnService3){
				
				this.setVisible(false);
				Login l1 = new Login();
				l1.setVisible(true);
				
				JOptionPane.showMessageDialog(l1, "Login Or Sign up","ERROR",JOptionPane.ERROR_MESSAGE); 
			}
			
			else if(ae.getSource()== adminBtn){
				
				this.setVisible(false);
				AdminLogin a1 = new AdminLogin();
				a1.setVisible(true);
				
				
			}
			else if(ae.getSource()== signUpBtn){
				
				this.setVisible(false);
				Signup s1 = new Signup();
				s1.setVisible(true);
				
			}
			else if(ae.getSource()== LoginBtn){
				
				this.setVisible(false);
				Login l1 = new Login ();  
				l1.setVisible(true);
				
			}
			
			
			
		}
		
		
}