import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Signup extends JFrame implements ActionListener{
	
	JFrame Signup ;
	JPanel mainPane ;
	JLabel lblUser,  lblPhone , lblEmail , lblFullName , lblGender, lblNid, lblPass , lblConfirm, lblLogo;
	JTextField tUserName , tPhone, tEmail, tFullName, tDateOfBirth, tNid, tPass, tConfirm;
	JButton signupBtn , backBtn , b3;
	JRadioButton rsignupBtn, rbackBtn, rb3;
	
	public Signup(){
	
	
	super(" Sign Up ");
	this.setBounds(new Rectangle(00,00,540,420));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	mainPane = new JPanel();
	mainPane.setBounds(0,0,540,420);
	mainPane.setBackground(Color.decode("#D2EAF5"));
	mainPane.setLayout(null);
    this.add(mainPane);
	
	ImageIcon image = new ImageIcon("image/signup24.png");  //Create a image icon
	lblLogo = new JLabel();
	lblLogo.setText(" ");  
	lblLogo.setIcon(image);
	lblLogo.setOpaque(true);
	lblLogo.setBounds(170,5,200,120);
	mainPane.add(lblLogo);
	
	
	lblFullName = new JLabel("Full Name :");
    lblFullName.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblFullName.setForeground(Color.black);
	lblFullName.setBounds(100,125,150,20);
	mainPane.add(lblFullName);
	
	lblUser = new JLabel();
	lblUser.setText("User name :");  //set text of label
	lblUser.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblUser.setForeground(Color.black);
	lblUser.setBounds(100,150,150,20);
	mainPane.add(lblUser);
	
	
	lblPhone = new JLabel();
	lblPhone.setText("Phone Number :");  //set text of label
	lblPhone.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblPhone.setForeground(Color.black);
	lblPhone.setBounds(100,175,150,20);
	mainPane.add(lblPhone);
	
	
	lblEmail = new JLabel("Email :");
    lblEmail.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblEmail.setForeground(Color.black);
	lblEmail.setBounds(100,200,150,20);
	mainPane.add(lblEmail);
	
	lblGender = new JLabel("Gender :");
    lblGender.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblGender.setForeground(Color.black);
	lblGender.setBounds(100,225,150,20);
	mainPane.add(lblGender);
	
	lblNid = new JLabel("Nid No :");
    lblNid.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblNid.setForeground(Color.black);
	lblNid.setBounds(100,250,150,20);
	mainPane.add(lblNid);
	
	lblPass = new JLabel("New Password :");
    lblPass.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblPass.setForeground(Color.black);
	lblPass.setBounds(100,275,150,20);
	mainPane.add(lblPass);
	
	lblConfirm = new JLabel("Confirm Password :");
    lblConfirm.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblConfirm.setForeground(Color.black);
	lblConfirm.setBounds(100,300,150,20);
	mainPane.add(lblConfirm);
	
	
	
	tFullName = new JTextField();
	tFullName.setBounds(240,125,150,20);
	mainPane.add(tFullName);
	
	tUserName = new JTextField();
	tUserName.setBounds(240,150,150,20);
	mainPane.add(tUserName);

	tPhone = new JTextField();
	tPhone.setBounds(240,175,150,20);
	mainPane.add(tPhone); 
	
	tEmail = new JTextField();
	tEmail.setBounds(240,200,150,20);
	mainPane.add(tEmail);
	
	
	rsignupBtn=new JRadioButton("Male");    
    rsignupBtn.setBounds(240,225,60,20); 
    mainPane.add(rsignupBtn);	
	
    rbackBtn=new JRadioButton("Female");    
    rbackBtn.setBounds(310,225,70,20);
	mainPane.add(rbackBtn);
	
	rb3=new JRadioButton("Other");    
    rb3.setBounds(390,225,70,20);
	mainPane.add(rb3);
	
	ButtonGroup g1 = new ButtonGroup();
	g1.add(rsignupBtn);
	g1.add(rbackBtn);
	g1.add(rb3);
	
	/* tDateOfBirth = new JTextField();
	tDateOfBirth.setBounds(240,150,150,20);
	mainPane.add(tDateOfBirth); */
	
	tNid = new JTextField();
	tNid.setBounds(240,250,150,20);
	mainPane.add(tNid);
	
	tPass = new JTextField();
	tPass.setBounds(240,275,150,20);
	mainPane.add(tPass);
	
	tConfirm = new JTextField();
	tConfirm.setBounds(240,300,150,20);
	mainPane.add(tConfirm);


	
	signupBtn = new JButton(" Sign Up ");
	signupBtn.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	signupBtn.setForeground(Color.black);
	signupBtn.setBackground(Color.decode("#72ceed"));
	signupBtn.setBounds(190,350,125,25);
	signupBtn.setFocusable(false);
	signupBtn.setBorder(null);
	signupBtn.addActionListener(this);
	signupBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    signupBtn.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			signupBtn.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(signupBtn);
	
	
    backBtn = new JButton("Back");
	backBtn.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	backBtn.setForeground(Color.black);
	backBtn.setBackground(Color.decode("#72ceed"));
	backBtn.setBounds(5,350,125,25);
	backBtn.setFocusable(false);
	backBtn.setBorder(null);
	backBtn.addActionListener(this);
	backBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    backBtn.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			backBtn.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(backBtn);
	
	
	}
	
/* 	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==signupBtn)
			{
				String fullName = fn.getText();
                String Nid = Nid.getText();
                String userEmail = em.getText();
                String userName = un.getText();
                String userPassword = pw.getText();
                String userPasswordConfirm = cp.getText();
				
			}
			else if(ae.getSource()==backBtn){
				
				this.setVisible(false);
				Login l3 = new Login();
				l3.setVisible(true);
			}
			
			
			
		} */
	
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==signupBtn)
        {
            String fullName = tFullName.getText();
            String Nid = tNid.getText();
            String userEmail = tEmail.getText();
            String userName = tUserName.getText();
            String userPassword = tPass.getText();
            String userPasswordConfirm = tConfirm.getText();

            if(fullName.isEmpty() ||  Nid.isEmpty() || userEmail.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || userPasswordConfirm.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Fill your informations", "MISSING INFORMATION",JOptionPane.WARNING_MESSAGE);
            }
            else if(userPassword.equals(userPasswordConfirm))
            {
                CreateUserAccount cua1 = new CreateUserAccount(fullName, Nid, userEmail, userName, userPassword);
                cua1.addAccount();
                JOptionPane.showMessageDialog(this, "Account Added");
                tUserName.setText("");
                tNid.setText("");
                tEmail.setText("");
                tUserName.setText("");
                tPass.setText("");
                tConfirm.setText("");
				
				this.setVisible(false);
				Login l1 = new Login();
				l1.setVisible(true);
				
            }
            else{JOptionPane.showMessageDialog(this, "Check Password");}

            
        }
        else if(ae.getSource()==backBtn)
        {
            this.setVisible(false);
			Login l1 = new Login();
			l1.setVisible(true);
        }
    }
	
	
	
}
