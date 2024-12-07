import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;

public class Home extends JFrame implements ActionListener{
	
	JPanel mainPane, servicePane, userPane, advertisingPane;
	JLabel lbllogo, lblContact, lblSelect,  lblOurSer, lblOurSerr,  lblLocation, lblPhone, lblVehical,label1 ;
	JMenuBar mb1;
	JMenu m1, m2, m3;
	JButton btnService, btnPayment, btnBack, btnService1, btnService2, btnService3, btnProcess, btnLogOut;
	JList list;
	JComboBox c1;
	JTextArea textArea;
	JTextField tPhone,tVehical,tLocation;
	File file, file2;
	
	public Home(){
		
	super(" Home Page ");
	this.setBounds(new Rectangle(00,00,540,420));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	
	mainPane = new JPanel();
	mainPane.setBounds(0,0,540,105);
	mainPane.setBackground(Color.gray);
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
	
	
	lblContact = new JLabel("",JLabel.RIGHT);
	lblContact.setText("Contact Us: 420     ");  //set text of label
	lblContact.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
	lblContact.setOpaque(true);
	lblContact.setBackground(Color.decode("#D2EAF5"));
	lblContact.setForeground(Color.black);
	lblContact.setBounds(250,0,290,80);
	mainPane.add(lblContact);
	
	
	btnService = new JButton("Service");
	btnService.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnService.setForeground(Color.black);
	btnService.setBackground(Color.decode("#72ceed"));
	btnService.setBounds(0,80,180,25);
	btnService.setBorder(null);
	btnService.setFocusable(false);
	btnService.addActionListener(this);
	btnService.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnService.setBackground(Color.decode("#0586f0"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
		
			btnService.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(btnService);
	
	
	btnPayment = new JButton("Service info");
	btnPayment.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnPayment.setOpaque(true);
	btnPayment.setForeground(Color.black);
	btnPayment.setBackground(Color.decode("#72ceed"));
	btnPayment.setBounds(180,80,180,25);
	btnPayment.setBorder(null);
	btnPayment.setFocusable(false);
	btnPayment.addActionListener(this);
	btnPayment.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnPayment.setBackground(Color.decode("#0586f0"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			
			btnPayment.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	mainPane.add(btnPayment);
	
	btnLogOut = new JButton("Log out ");
	btnLogOut.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnLogOut.setOpaque(true);
	btnLogOut.setForeground(Color.black);
	btnLogOut.setBackground(Color.decode("#d44e4e")); //
	btnLogOut.setBounds(360,80,180,25);
	btnLogOut.setBorder(null);
	btnLogOut.setFocusable(false);
	btnLogOut.addActionListener(this);
	btnLogOut.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnLogOut.setBackground(Color.decode("#9e2632"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			
			btnLogOut.setBackground(Color.decode("#d44e4e")); 
			
		}
    });
	mainPane.add(btnLogOut);
	
	
	
	
	advertisingPane = new JPanel();
	advertisingPane.setBounds(0,105,540,310);
	advertisingPane.setBackground(Color.decode("#D2EAF5"));
	advertisingPane.setLayout(null);
    this.add(advertisingPane);
	
	try{
            BufferedReader b=null;
            FileReader f=null;
            f=new FileReader("Data/Temp.txt");
            b =new BufferedReader(f);
            //String temp;
			String a="",temp;
            while((temp=b.readLine())!=null) {     
			  lblOurSerr = new JLabel();	
			  lblOurSerr.setText(" Hello,"+ temp);
            }
		}  
        catch(Exception e)
        {
          e.printStackTrace();
        }
	
	lblOurSerr.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
	lblOurSerr.setOpaque(true);
	lblOurSerr.setForeground(Color.decode("#00558D"));
	lblOurSerr.setBackground(Color.decode("#D2EAF5"));
	lblOurSerr.setBounds(240,0,300,25);
	advertisingPane.add(lblOurSerr);
	
	
	lblOurSer = new JLabel();                               //text ALlignment in contructor
	lblOurSer.setText(" Our service: ");                       //set text of label
	lblOurSer.setFont(new Font("Cooper Black MS",Font.PLAIN,18));
	lblOurSer.setOpaque(true);                                       //for color.. paint
	lblOurSer.setForeground(Color.decode("#00558D"));
	lblOurSer.setBackground(Color.decode("#D2EAF5"));          //COlor decode for hex color
	lblOurSer.setBounds(0,0,200,25);
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
	
	
	
	servicePane = new JPanel();
	servicePane.setBounds(0,105,540,310);
	servicePane.setBackground(Color.decode("#129db3"));
	servicePane.setLayout(null);
	this.add(servicePane);
	
	lblSelect = new JLabel("Fill This  :");
	lblSelect.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
	lblSelect.setOpaque(true);
	lblSelect.setBackground(Color.decode("#D2EAF5"));
	lblSelect.setForeground(Color.black);
	lblSelect.setBounds(5,5,120,25);
    servicePane.add(lblSelect);
	
	
	lblPhone = new JLabel("Phone number :");
    lblPhone.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	lblPhone.setForeground(Color.black);
	lblPhone.setBounds(60,50,150,25);
	servicePane.add(lblPhone);
	
	lblVehical = new JLabel();
	lblVehical.setText("Vehical name :");  
	lblVehical.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	lblVehical.setForeground(Color.black);
	lblVehical.setBounds(60,80,150,25);
	servicePane.add(lblVehical);
	
	
	lblLocation = new JLabel();
	lblLocation.setText("Location :");  
	lblLocation.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	lblLocation.setForeground(Color.black);
	lblLocation.setBounds(60,110,150,25);
	servicePane.add(lblLocation);
	
	
	tPhone = new JTextField(); // 
	tPhone.setBounds(210,50,150,25);
	servicePane.add(tPhone);
	
	tVehical = new JTextField();
	tVehical.setBounds(210,80,150,25);
	servicePane.add(tVehical);

	tLocation = new JTextField();
	tLocation.setBounds(210,110,150,25);
	servicePane.add(tLocation); 
	
	
	btnProcess = new JButton(" Process ");
	btnProcess.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	btnProcess.setForeground(Color.black);
	btnProcess.setBackground(Color.decode("#72ceed"));
	btnProcess.setBounds(60,180,125,20);
	btnProcess.setBorder(null);
	btnProcess.setFocusable(false);
	btnProcess.addActionListener(this);
	btnProcess.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnProcess.setBackground(Color.decode("#1d91ad"));  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			btnProcess.setBackground(Color.decode("#72ceed")); 
			
		}
    });
	servicePane.add(btnProcess);
	
	/* DefaultListModel model = new DefaultListModel();
    model.addElement("one");
    model.addElement("two");
    model.addElement("three");

    list = new JList(model);
    servicePane.add(list);
	list.setBounds(0,30,100,100); */
	
	
	
	
	
	
	
	
	userPane = new JPanel();
	userPane.setBounds(0,105,540,310);
	userPane.setBackground(Color.decode("#129db3"));
	userPane.setLayout(null);
	this.add(userPane);
	
	
	textArea = new JTextArea();
        textArea.setBounds(10,110,500,310);
		
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
		userPane.add(textArea);
		

	

	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==btnService)
			{
			
			 advertisingPane.setVisible(false);
			 userPane.setVisible(false);
			 servicePane.setVisible(true);
			
			
			}
			
			else if(ae.getSource()==btnPayment)
			{
				
			    advertisingPane.setVisible(false);	
			    userPane.setVisible(true);
			    servicePane.setVisible(false); 
			
			}
			else if(ae.getSource()==btnLogOut){
				
				Welcome w1 = new Welcome();
			    this.setVisible(false);
			    w1.setVisible(true);
				String path ="Data/Temp.txt";
				file = new File(path);
				if(file.exists()){
					file.delete();						
				}
			}
			else if(ae.getSource()==btnProcess){
				
				String phoneNumber = tPhone.getText();
                String vehicalName = tVehical.getText();
                String location = tLocation.getText();
				
				if(phoneNumber.isEmpty() ||  vehicalName.isEmpty() || location.isEmpty())
				{
                JOptionPane.showMessageDialog(this, "Fill your informations", "Alert",JOptionPane.WARNING_MESSAGE);
				}else{
					ServiceInfo si1 = new ServiceInfo(phoneNumber, vehicalName, location);
                    si1.addService();
					

					JOptionPane.showMessageDialog(this, "Request Done", "Service",JOptionPane.INFORMATION_MESSAGE);
					
                    tPhone.setText("");
                    tVehical.setText("");
                    tLocation.setText("");
				}
				
			}
			
			
		}
		
	
}