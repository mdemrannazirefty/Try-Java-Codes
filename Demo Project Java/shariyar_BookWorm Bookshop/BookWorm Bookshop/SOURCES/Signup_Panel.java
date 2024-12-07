import javax.swing.*;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

class Signup_Panel{

//Colors
	Color BRAND_BLUE = new Color (13, 60, 251);
	Color BRAND_GREEN = new Color (19, 156, 126);
	Color LIGHT_RED = new Color (255,102,102);
	Color LIGHT_BLUE = new Color (51,153,255);
	Color Dark_CYAN = new Color (14,161,177);
	
	int fileNo=1;
	
	public Signup_Panel()
	{
		//Basic Frame Creation
		JFrame frame = new JFrame();
		frame.setSize(1000,600);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Welcome to BookWorm");
		Image frame_icon = Toolkit.getDefaultToolkit().getImage("Image\\Logo.png");    
		frame.setIconImage(frame_icon);
		frame.setResizable(false);
		
		/////////////////////Frame Close Confirmation/////////////////////
		
		frame.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){

					int result = JOptionPane.showConfirmDialog (null,"Do you want to Exit?", "Exit Confirmation",JOptionPane.YES_NO_OPTION);

					if (result == JOptionPane.YES_OPTION){
						//////////////////////////////////////////
			/////////////////////Source Folder/////////////////////
			//////////////////////////////////////////
			
			//////////////////////////////////////////////////////////////////////////
			///////////////Change the path when you edit the code////////////////////
			//////////////Use double back slash (\\) before every folder name////////////
			/////////////////////////////////////////////////////////////////////////
						  File folder = new File("E:\\BookWorm Bookshop\\SOURCES");
							File fList[] = folder.listFiles();
						
							for (File f : fList) {
								if (f.getName().endsWith(".class")) {
									f.delete(); 
								}
							}

						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					}else{
						frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					}
				}
			}
		);
		
		
		
		//Container creation
		Container panel = new Container();
		panel=frame.getContentPane();
		panel.setLayout(null);
		
///////////////////////////////////////////////////////	
///////////////////////////////////////////////////////
//////////////////////////////////////////////////////

//Title
		JLabel title = new JLabel("Create an Account");
		title.setFont(new Font("Ubuntu", Font.BOLD, 30));
		title.setBounds(650,30,300,30);
		title.setForeground(BRAND_BLUE);
		panel.add(title);
		
//First Name
		//Title
		JLabel FirstName = new JLabel("First Name");
		FirstName.setFont(new Font("Ubuntu", Font.BOLD, 12));
		FirstName.setForeground(BRAND_GREEN);
		FirstName.setBounds(650,80,100,18);
		panel.add(FirstName);
		
		//Text Field
		JTextField firstName = new JTextField();
		firstName.setBounds(650,100,125,30);
		new TextPrompt("James", firstName);
		panel.add(firstName);
		
		
//Last Name
		//Title
		JLabel LastName = new JLabel("Last Name");
		LastName.setFont(new Font("Ubuntu", Font.BOLD, 12));
		LastName.setForeground(BRAND_GREEN);
		LastName.setBounds(780,80,100,18);
		panel.add(LastName);
		
		//Text Field
		JTextField lastName = new JTextField();
		lastName.setBounds(780,100,125,30);
		new TextPrompt("Gosling", lastName);
		panel.add(lastName);
//email
		//Title
		JLabel Email = new JLabel("Email Address");
		Email.setFont(new Font("Ubuntu", Font.BOLD, 12));
		Email.setForeground(BRAND_GREEN);
		Email.setBounds(650,140,100,20);
		panel.add(Email);
		
		//Text Field
		JTextField email_field = new JTextField();
		email_field.setBounds(650,160,255,30);
		new TextPrompt("jamesgosling@example.com", email_field);
		panel.add(email_field);
		
//Phone Number
		//Title
		JLabel Phone = new JLabel("Phone Number");
		Phone.setFont(new Font("Ubuntu", Font.BOLD, 12));
		Phone.setForeground(BRAND_GREEN);
		Phone.setBounds(650,200,100,20);
		panel.add(Phone);
		
		//Text Field
		JTextField phone_field = new JTextField();
		phone_field.setBounds(650,220,125,30);
		new TextPrompt("01*********", phone_field);
		panel.add(phone_field);
		
//Male-Female
		//Title
		JLabel Gender = new JLabel("Gender");
		Gender.setFont(new Font("Ubuntu", Font.BOLD, 12));
		Gender.setForeground(BRAND_GREEN);
		Gender.setBounds(650,260,100,20);
		panel.add(Gender);
		
		//Text Field
		JRadioButton male = new JRadioButton("Male");
		male.setFont(new Font("Ubuntu", Font.BOLD, 12));
		male.setForeground(BRAND_BLUE);
		male.setSelected(true);
		male.setFocusPainted(false);
		male.setBounds(650,285,60,20);
		male.setContentAreaFilled(false);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setFont(new Font("Ubuntu", Font.BOLD, 12));
		female.setForeground(BRAND_BLUE);
		female.setSelected(false);
		female.setFocusPainted(false);
		female.setBounds(720,285,80,20);
		female.setContentAreaFilled(false);
		panel.add(female);
		
		ButtonGroup gender_grp = new ButtonGroup();
		gender_grp.add(male);
		gender_grp.add(female);
		
//UserName
		//Title
		JLabel USERNAME = new JLabel("Username");
		USERNAME.setFont(new Font("Ubuntu", Font.BOLD, 12));
		USERNAME.setForeground(BRAND_GREEN);
		USERNAME.setBounds(650,315,100,18);
		panel.add(USERNAME);
		
		//Text Field
		JTextField user_field = new JTextField();
		user_field.setBounds(650,335,140,30);
		new TextPrompt("Only (a-z)", user_field);
		panel.add(user_field);

//Password
		//Title
		JLabel PASSWORD = new JLabel("Password");
		PASSWORD.setFont(new Font("Ubuntu", Font.BOLD, 12));
		PASSWORD.setForeground(BRAND_GREEN);
		PASSWORD.setBounds(650,375,100,18);
		panel.add(PASSWORD);
		
		//Text Field
		JTextField pass_field = new JTextField();
		pass_field.setBounds(650,395,140,30);
		new TextPrompt("Password (6-10)", pass_field);
		panel.add(pass_field);




/////////////////////////////////////////////Buttons////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Create Account Button
		Font createAccountFont = new Font ("Ubuntu", Font.BOLD,15);//Font
		
		JButton createAccount_Button = new JButton("Sign Up");
		createAccount_Button.setBounds(690,445,150,25);
		createAccount_Button.setFont(createAccountFont);
		createAccount_Button.setFocusPainted(false);
		createAccount_Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//createAccount_Button.setToolTipText("Create New Account");
		createAccount_Button.setBackground(BRAND_BLUE);
		createAccount_Button.setForeground(Color.WHITE);
		
	//Add hover in CREATE button
		createAccount_Button.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				createAccount_Button.setBackground(BRAND_GREEN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				createAccount_Button.setBackground(BRAND_BLUE);
			}
		});
		panel.add(createAccount_Button);
		
		//Back to Login Button
		//Title
		JLabel have_account = new JLabel("Already have an account?");
		have_account.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		have_account.setForeground(BRAND_GREEN);
		have_account.setBounds(655,480,180,20);
		panel.add(have_account);
		//Button
		Font login_font = new Font("Ubuntu", Font.BOLD,14);
		
		JButton backToLogin_Button = new JButton("Log In");
		backToLogin_Button.setBounds(808,480,80,17);
		//backToLogin_Button.setToolTipText("Enter to Log In");
		backToLogin_Button.setForeground(BRAND_BLUE);
		backToLogin_Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		backToLogin_Button.setFont(login_font);
		//Make Transparent Button
		backToLogin_Button.setContentAreaFilled(false);
		backToLogin_Button.setFocusPainted(false);
		backToLogin_Button.setBorderPainted(false);
		
	//Add hover in login button
		backToLogin_Button.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				backToLogin_Button.setForeground(BRAND_GREEN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				backToLogin_Button.setForeground(BRAND_BLUE);
			}
		});
		panel.add(backToLogin_Button);
		
		
//Set Background Image
		ImageIcon Sign_Up_Background = new ImageIcon("Image\\Sign_Up_Background.jpg");
		
		JLabel bg_label = new JLabel(Sign_Up_Background);
		bg_label.setBounds(0,0,986,563);
		panel.add(bg_label);
		





/////////////////////////////////////////////////Actions Listeners/////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Back to Login Button Action Listener
		backToLogin_Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent u){
				frame.setVisible(false);
				new Login_Panel();
			}
		});
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//Create Account Button Action Listener
		createAccount_Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent u){


//////////////////////////////////////////////////////////////Reading User File NO/////////////////////////////////////////////////////
				String filenumber="";
				try{
					File otp_File = new File("TXT FILES\\User_File_No.txt");		
					Scanner scanFile = new Scanner(otp_File);//Scan File
						
					while(scanFile.hasNext()){
						filenumber=scanFile.next();
						break;
					}
					scanFile.close();
					
					fileNo= Integer.parseInt(filenumber);
						
				}catch(Exception f)		{System.out.println("Running user file No Reading Problem in Signup Panel");}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				String username,password,email,phone,name,gender,balance;
				
			//Getting User Information
				username=user_field.getText();
				password=pass_field.getText();
				email=email_field.getText();
				phone=phone_field.getText();
				balance="0.00";
				name=firstName.getText()+" "+lastName.getText();
				if(male.isSelected()){gender="Male";}
				else {gender="Female";}
				
				int Username_Warning=5;
				int Username_Exist_Warning=5;
				int Phone_Warning=5;
				
				//Check Username ok or not
				for(int i=0; i<username.length(); i++)
				{
					if( (username.charAt(i)<97) || (username.charAt(i)>122) ){
						Username_Warning=1;
						break;
					}
				}
				
				//Check Phone Number ok or not
				for(int i=0; i<phone.length(); i++)
				{
					if( (phone.charAt(i)<48) || (phone.charAt(i)>57) ){
						Phone_Warning=1;
						break;
					}
				}
				
				
				//Check Username Exist or not			
					String username_exist="";
					for(int i=1; i<=(fileNo-1); i++)
					{
						String User_Information_File_Path="TXT FILES/User Information/User--"+i+".txt";
						
						try{
							File user_file = new File(User_Information_File_Path);		
							Scanner scanFile = new Scanner(user_file);//Scan File
							
							while(scanFile.hasNext()){
								username_exist=scanFile.next();
								break;
							}
							scanFile.close();
							
							
							if((username.equals(username_exist)))
							{
								Username_Exist_Warning+=1;
								break;
							}
						}catch(Exception f)		{System.out.println("User File Problem in Sigup Panel");}
					}
				
				
				
				
				
				if( (firstName.getText().isEmpty()) || (username.isEmpty()) || (password.isEmpty()) || (email.isEmpty()) || (phone.isEmpty()) || (lastName.getText().isEmpty()) )
				{
					if( firstName.getText().isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "First Name can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else if( lastName.getText().isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "Last Name can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else if( email.isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "Email can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else if( phone.isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "Phone Number can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else if( username.isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "Username can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Password can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
				else if(Email_Decision(email))
				{
					JOptionPane.showMessageDialog(null, "Enter a valid Email Address","Email Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if( (phone.length()<11) || (phone.length()>11) || Phone_Warning!=5)
				{
					JOptionPane.showMessageDialog(null, "Enter a valid Phone Number","Phone Number Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if(Username_Warning!=5)
				{
					JOptionPane.showMessageDialog(null, "Username contains small Alphabets only","Username Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if(Username_Exist_Warning!=5)
				{
					JOptionPane.showMessageDialog(null, "Username already exist. Try different One","Username Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if( (password.length()<6) || (password.length()>10) )
				{
					JOptionPane.showMessageDialog(null, "Password must be 6 to 10 character","Password Warning",JOptionPane.WARNING_MESSAGE);
				}
///////////////////////////////////////////////////////////User Information Written/////////////////////////////////////////////////////////////////////////////////////////
				else{
					try{
						String User_Information_File_Path="TXT FILES/User Information/User--"+fileNo+".txt";
						Formatter formatter=new Formatter(User_Information_File_Path);
						fileNo++;
						
						formatter.format("%s\r\n", username);
						formatter.format("%s\r\n", password);
						formatter.format("%s\r\n", email);
						formatter.format("%s\r\n", phone);
						formatter.format("%s\r\n", gender);
						formatter.format("%s\r\n", balance);
						formatter.format("%s\r\n", name);
						
						
						
						formatter.close();	
					}catch(Exception f)		{System.out.println(f);}
					
/////////////////////////////////////////////////////////////////////Writting Next User File Number////////////////////////////////////////////////////////////////////////
					try{
						Formatter formatter=new Formatter("TXT FILES\\User_File_No.txt");
							
							
						formatter.format("%s\r\n", fileNo);
						formatter.close();	
							
					}catch(Exception f)		{System.out.println(f);}
					
					JOptionPane.showMessageDialog(null, "Welcome to BookWorm Shop "+firstName.getText(),"Successfully Account Created",-1,new ImageIcon("Image\\Successful_Icon.png"));
					
					frame.setVisible(false);
					new Login_Panel();
				}

				
			}
		});

//Visibility Of frame
frame.setVisible(true);
	}

		
	private boolean Email_Decision(String email){
		
		String word=email;
		int countAt=0,countDot=0;
		
		
		
		for(int i=0; i<word.length();i++)
		{
			if(word.charAt(i)=='@')
			{
				countAt++;
			}if(countAt==1 && word.charAt(i)=='.')
			{
				countDot++;
			}
			
		}
		
		if(countAt==1 && countDot==1){
			return false;
		}
		else{
			return true;
		}
		
	}
}