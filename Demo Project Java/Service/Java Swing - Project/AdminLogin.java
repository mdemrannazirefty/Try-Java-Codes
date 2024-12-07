import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("deprecation")
public class AdminLogin extends JFrame implements ActionListener{
	
	
	
	JFrame AdminLogin ;
	JPanel mainPane ;
	JLabel lblUser, lblPass, lblAdminLogo;
	JTextField ut , pt;
	JButton btnLogin , b2 , btnBack;
	JPasswordField pf;
	
	public AdminLogin(){
	
	
	super(" Admin-Login ");
	this.setBounds(new Rectangle(00,00,540,420));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	
	
	mainPane = new JPanel();
	mainPane.setBounds(0,0,540,420);
	mainPane.setBackground(Color.decode("#D2EAF5"));
	mainPane.setLayout(null);
    this.add(mainPane);
	
	
	lblUser = new JLabel();
	lblUser.setText("User name");  //set text of label
	lblUser.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
	lblUser.setOpaque(false);
	lblUser.setForeground(Color.blue);
	lblUser.setBounds(150,150,90,20);
	mainPane.add(lblUser);
	
	
	lblPass = new JLabel();
	lblPass.setText("Password");  //set text of label
	lblPass.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
	lblPass.setOpaque(false);
	lblPass.setForeground(Color.blue);
	lblPass.setBounds(150,175,90,20);
	mainPane.add(lblPass);
	
	
	ImageIcon image = new ImageIcon("image/Adminlogin2424.png"); 
	
	lblAdminLogo = new JLabel();
	lblAdminLogo.setText(" ");  //set text of label
	lblAdminLogo.setIcon(image);
	lblAdminLogo.setOpaque(true);
	lblAdminLogo.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	lblAdminLogo.setForeground(Color.white);
	lblAdminLogo.setBounds(170,20,200,120);
	mainPane.add(lblAdminLogo);
	
	ut = new JTextField();
	ut.setBounds(250,150,120,20);
	mainPane.add(ut);

	
	pf = new JPasswordField();
	pf.setBounds(ut.getX(), lblPass.getY(), 120, lblUser.getHeight()); //getting bounds using .get method
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
	
	
	
	btnBack = new JButton("Back");
	btnBack.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	btnBack.setForeground(Color.black);
	btnBack.setBackground(Color.decode("#72ceed"));
	btnBack.setBounds(10,340,120,25);
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
			

        String userValue = ut.getText();
		String passValue = pf.getText();

			if(ae.getSource()==btnLogin)
			{
				if(userValue.equals("admin420") && passValue.equals("admin420")){
			
     			AdminPage a1 = new AdminPage();
			    this.setVisible(false);
			    a1.setVisible(true);
				}
				
				else{JOptionPane.showMessageDialog(this, "Invalid user name or password","Invalid",JOptionPane.WARNING_MESSAGE);
				
				}
			
			}
			else if(ae.getSource()==btnBack){
				
				this.setVisible(false);
				Welcome w1 = new Welcome();
				w1.setVisible(true);
				
			}
		}
}
