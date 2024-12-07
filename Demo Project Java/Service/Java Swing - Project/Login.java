import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("deprecation")
public class Login extends JFrame implements ActionListener{
	
	JFrame Login ;
	JPanel mainPane  ;
	JLabel lblUser, lblPass, lblLogo;
	JTextField ut , pt;
	JButton btnLogin , btnSignup , btnBack;
	JPasswordField pf;
	public static String Un;
	
	public Login(){
	
	
	super(" Login ");
	this.setBounds(new Rectangle(00,00,540,420));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.setResizable(false);

	
	mainPane = new JPanel();
	mainPane.setBounds(0,0,540,420);
	mainPane.setBackground(Color.decode("#D2EAF5"));
	mainPane.setLayout(null);
    this.add(mainPane);
	
	
	ImageIcon image = new ImageIcon("image/userLogin24.png");  //Create a image icon
	lblLogo = new JLabel();
	lblLogo.setText(" ");  
	lblLogo.setIcon(image);
	lblLogo.setOpaque(true);
	lblLogo.setBounds(170,20,200,120);
	mainPane.add(lblLogo);
	
	
	lblUser = new JLabel();
	//ImageIcon lbl_login = new ImageIcon();
	lblUser.setText("User name");  //set text of label
	//lblUser.setIcon();
	lblUser.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
	lblUser.setForeground(Color.black);
	lblUser.setBounds(150,150,90,20);
	mainPane.add(lblUser);
	
	
	lblPass = new JLabel();
	lblPass.setText("Password");  //set text of label
	lblPass.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	lblPass.setForeground(Color.black);
	lblPass.setBounds(150,175,90,20);
	mainPane.add(lblPass);
	
	
	ut = new JTextField();
	ut.setBounds(250,150,120,20);
	mainPane.add(ut);
	
	
	pf = new JPasswordField();
	pf.setBounds(ut.getX(), lblPass.getY(), 120, lblUser.getHeight());		
	mainPane.add(pf);

	
	btnLogin = new JButton("Login");
	btnLogin.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnLogin.setForeground(Color.black);
	btnLogin.setBackground(Color.decode("#72ceed"));
	btnLogin.setBounds(190,220,125,25);
	btnLogin.setFocusable(false);
	btnLogin.setBorder(null);
	btnLogin.addActionListener(this);
	btnLogin.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnLogin.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			btnLogin.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(btnLogin);
	
	
	btnSignup = new JButton("Sign Up");
	btnSignup.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnSignup.setForeground(Color.black);
	btnSignup.setBackground(Color.decode("#72ceed"));
	btnSignup.setBounds(135,340,125,25);
	btnSignup.setFocusable(false);
	btnSignup.setBorder(null);
	btnSignup.addActionListener(this);
	btnSignup.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnSignup.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			btnSignup.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(btnSignup);
	
	
	
	btnBack = new JButton(" Back ");
	btnBack.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	btnBack.setForeground(Color.black);
	btnBack.setBackground(Color.decode("#72ceed"));
	btnBack.setBounds(5,340,125,25);
	btnBack.setFocusable(false);
	btnBack.setBorder(null);
	btnBack.addActionListener(this);
	btnBack.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnBack.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			btnBack.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(btnBack);
	
	
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==btnLogin){
				
		        String userName = ut.getText();
			    String userPassword = pf.getText();
			    CreateUserAccount cua1 = new CreateUserAccount();
				ServiceInfo s1 = new ServiceInfo();
				
				if(cua1.getAccount(userName, userPassword)){
					JOptionPane.showMessageDialog(this,"Login Successful");
					Home h1 = new Home();
					//s1.addService(userName);
					this.setVisible(false);
					h1.setVisible(true);
					
				}
				else{JOptionPane.showMessageDialog(this, "Invalid UserName/Password", "INVALID", JOptionPane.WARNING_MESSAGE);}
			}
			else if(ae.getSource()==btnBack){
				this.setVisible(false);
				Welcome w1 = new Welcome();
				w1.setVisible(true);
				
			}
			else if(ae.getSource()==btnSignup){
				this.setVisible(false);
				Signup s1 = new Signup();
				s1.setVisible(true);
				
			}
			
			
			
			
		}
		
		
}
