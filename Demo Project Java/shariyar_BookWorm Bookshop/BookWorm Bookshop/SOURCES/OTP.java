import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class OTP{
	Color BRAND_BLUE = new Color (13, 60, 251);
	Color BRAND_GREEN = new Color (19, 156, 126);
	Color Dark_Blue = new Color(0, 88, 175);
	Color Light_Blue = new Color(74, 164, 255);
	
	String otp;
	static int invalidCount=0;
	
	public OTP()
	{
		//Basic Frame Creation
		JFrame frame = new JFrame();
		frame.setSize(1000,600);
		frame.setLocationRelativeTo(null);
		frame.setTitle("OTP Verification");
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
///////////////////Enter Authentication Code////////////
		//Title
		JLabel enterOTP_Label = new JLabel("Enter Verification Code");
		enterOTP_Label.setBounds(405,60,190,20);
		enterOTP_Label.setFont(new Font("Ubuntu",Font.BOLD,14));
		enterOTP_Label.setForeground(BRAND_BLUE);
		panel.add(enterOTP_Label);
		
		//Text Field
		JTextField enterOTP_Field = new JTextField();
		enterOTP_Field.setBounds(444,90,80,30);
		new TextPrompt("OTP", enterOTP_Field);
		panel.add(enterOTP_Field);

	//Submit Button
		Font Submit_Font = new Font ("Ubuntu", Font.BOLD,15);//Font
		
		JButton Submit_Button = new JButton("Submit");
		Submit_Button.setBounds(443,130,90,25);
		Submit_Button.setFont(Submit_Font);
		Submit_Button.setFocusPainted(false);
		Submit_Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Submit_Button.setBackground(BRAND_BLUE);
		Submit_Button.setForeground(Color.WHITE);
		
	//Add hover in login button
		Submit_Button.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				Submit_Button.setBackground(BRAND_GREEN);
				Submit_Button.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				Submit_Button.setBackground(BRAND_BLUE);
				Submit_Button.setForeground(Color.WHITE);
			}
		});
		panel.add(Submit_Button);


	//Set Background Image
		ImageIcon OTP_Background = new ImageIcon("Image\\OTP_Background.jpg");
		
		JLabel bg_label = new JLabel(OTP_Background);
		bg_label.setBounds(0,0,986,563);
		panel.add(bg_label);





	//Submit Button Action Listener
		Submit_Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent u){
				
/////////////////////////////////
				String otp_provided=enterOTP_Field.getText();
				
				
				try{
					File otp_File = new File("TXT FILES\\OTP.txt");		
					Scanner scanFile = new Scanner(otp_File);//Scan File
						
					while(scanFile.hasNext()){
						otp=scanFile.next();
						break;
					}
					scanFile.close();
						
				}catch(Exception f){
					System.out.println("OTP File has problem in OTP Panel");
				}
				
				if(otp_provided.equals(otp))
				{
					
					frame.setVisible(false);
					new New_Password();
				}
				else{
					invalidCount++;
					
					if(invalidCount>5){
						JOptionPane.showMessageDialog(null,"You Have Entered wrong OTP more than 5 times.","WARNING",JOptionPane.WARNING_MESSAGE);
						System.exit(0);
					}
					else{
						JOptionPane.showMessageDialog(null,"Enter a valid OTP","Invalid OTP",JOptionPane.WARNING_MESSAGE);
					}
				}
				
				
/////////////////////////////////
			}
		});
		
		


//Set Frame as Visible
frame.setVisible(true);
	}
}