import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;

public class AdminPage extends JFrame implements ActionListener{
	
	JPanel mainPane, servicePane, serviceInfoPane;
	JLabel lbllogo, lblContact, lblSelect ;
	JMenu m1, m2, m3;
	JButton btnUserInfo, btnServiceInfo, btnBack, btnlogout;
	JTextArea textArea;
	
	
	public AdminPage(){
		
	super(" Admin Page ");
	this.setBounds(new Rectangle(00,00,540,420));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	
	
	mainPane = new JPanel();
	mainPane.setBounds(0,0,540,105);
	mainPane.setBackground(Color.decode("#D2EAF5"));
	mainPane.setLayout(null);
    this.add(mainPane);
	
	
	ImageIcon image = new ImageIcon("image/logo24.png");
	lbllogo = new JLabel();
	lbllogo.setText(" ");  //set text of label
	lbllogo.setIcon(image);
	lbllogo.setOpaque(true);
	lbllogo.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	lbllogo.setForeground(Color.white);
	lbllogo.setBounds(0,0,250,80);
	mainPane.add(lbllogo);
	
	
	/* lblContact = new JLabel();
	lblContact.setText("    Contact Us : 420");  //set text of label
	lblContact.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	lblContact.setOpaque(true);
	lblContact.setBackground(Color.blue);
	lblContact.setForeground(Color.white);
	lblContact.setBounds(250,0,290,80);
	mainPane.add(lblContact); */
	
	
	btnUserInfo = new JButton();
	btnUserInfo.setText("Users Info");
	btnUserInfo.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnUserInfo.setOpaque(true);
	btnUserInfo.setForeground(Color.black);
	btnUserInfo.setBackground(Color.decode("#72ceed"));
	btnUserInfo.setBounds(0,80,180,25);
	btnUserInfo.setBorder(null);
	btnUserInfo.setFocusable(false);
	btnUserInfo.addActionListener(this);
	btnUserInfo.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnUserInfo.setBackground(Color.decode("#0586f0"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			
			btnUserInfo.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(btnUserInfo);
	
	btnServiceInfo = new JButton("Service Info");
	btnServiceInfo.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnServiceInfo.setOpaque(true);
	btnServiceInfo.setForeground(Color.black);
	btnServiceInfo.setBackground(Color.decode("#72ceed"));
	btnServiceInfo.setBounds(180,80,180,25);
	btnServiceInfo.setBorder(null);
	btnServiceInfo.setFocusable(false);
	btnServiceInfo.addActionListener(this);
	btnServiceInfo.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnServiceInfo.setBackground(Color.decode("#0586f0"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			
			btnServiceInfo.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(btnServiceInfo);
	
	
	btnBack = new JButton("Back");
	btnBack.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	btnBack.setForeground(Color.black);
	btnBack.setBackground(Color.decode("#72ceed"));
	btnBack.setBounds(360,80,180,25);
	btnBack.setFocusable(false);
	btnBack.setBorder(null);
	btnBack.addActionListener(this);
	btnBack.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnBack.setBackground(Color.decode("#0586f0"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			
			btnBack.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(btnBack);
	
	
	
	btnlogout = new JButton("Log out");
	btnlogout.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	btnlogout.setForeground(Color.black);
	btnlogout.setBackground(Color.decode("#d44e4e"));
	btnlogout.setBounds(360,55,180,25);
	btnlogout.setFocusable(false);
	btnlogout.setBorder(null);
	btnlogout.addActionListener(this);
	btnlogout.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnlogout.setBackground(Color.decode("#9e2632"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			
			btnlogout.setBackground(Color.decode("#d44e4e")); 
			
		}
    });
	mainPane.add(btnlogout);
	
	
	
	servicePane = new JPanel();
	servicePane.setBounds(0,105,540,310);
	servicePane.setBackground(Color.decode("#129db3"));
	servicePane.setLayout(null);
	this.add(servicePane);
	
	
	
	
	textArea = new JTextArea();
        textArea.setBounds(5,5,510,300);
        
		    try{
            BufferedReader br=null;
            FileReader fr=null;
            fr=new FileReader("Data/Users.txt");
            br =new BufferedReader(fr);
            String a="",temp;
			
            while((temp=br.readLine())!=null) {
              a=a+temp+"\n"+"\r";
			  
              textArea.setText(a);
              textArea.setLineWrap(true);
            }
		    }  
        catch(Exception e)
        {
          e.printStackTrace();
        }
		
        servicePane.add(textArea);
	
	
	
	
	serviceInfoPane = new JPanel();
	serviceInfoPane.setBounds(0,105,540,310);
	serviceInfoPane.setBackground(Color.decode("#129db3"));
	serviceInfoPane.setLayout(null);
	this.add(serviceInfoPane);
	
	
	textArea = new JTextArea();
        textArea.setBounds(5,110,510,300);
		
		    try{
            BufferedReader br=null;
            FileReader fr=null;
            fr=new FileReader("Data/ServiceInfo.txt");
            br =new BufferedReader(fr);
            String a="",temp;
            while((temp=br.readLine())!=null) {
              a=a+temp+"\n"+"\r";
              textArea.setText(a);
              textArea.setLineWrap(true);
            }
		    }  
        catch(Exception e)
        {
          e.printStackTrace();
        }
		serviceInfoPane.add(textArea);
	
	
	}
	
	
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==btnUserInfo)
			{
			
			 serviceInfoPane.setVisible(false);
			 servicePane.setVisible(true);
			
			}
			
			else if(ae.getSource()==btnServiceInfo){
				
			    serviceInfoPane.setVisible(true);
			    servicePane.setVisible(false);				
			}
			
			else if(ae.getSource()==btnBack){
				
				this.setVisible(false);
				AdminLogin al1 = new AdminLogin();
				al1.setVisible(true);
				
			}
			else if(ae.getSource()==btnlogout){
				
				JOptionPane.showMessageDialog(this, "Log out Successfull");
				this.setVisible(false);
				Welcome w1 =new Welcome();
				w1.setVisible(true);
				
			}
			
			
			
		}
		
		
		
}
	


	
	
