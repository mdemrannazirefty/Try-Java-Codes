package GUI;
import Employeee.*;
import java.lang.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import Employeee.*;
import java.util.*;

public class ChefInfo extends JFrame implements MouseListener, ActionListener 
{
	Manager m = new Manager(15);
	
	Color color = new Color(195,195,195);
	Font font = new Font("cambria", Font.PLAIN, 26);
	JPanel panel;
	JLabel title;
	DefaultTableModel model;
	JTable table;
	
	ImageIcon icon = new ImageIcon ("Image/4000.png");
	JTextField  name, nid, address,contactNumber;
	JButton addData, clrData, removeData, finish , back;
		
	public ChefInfo ()
	{
		super("Information");
		this.setSize(1200,675);
		this.m = m;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setIconImage(icon.getImage());
		
	    panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,0,1200,675);
		panel.setBackground(color);
		this.add(panel);
		
		initializeForm();
		createTable();

	    this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		if(back == ae.getSource())
			{
			    Admin1st first = new Admin1st ();
			
				this.setVisible(false);
				first.setVisible(true);
			}
			else {
				System.out.println("==========");
			}
			
		String textfield1=name.getText();
		String textfield2=nid.getText();
		String textfield3=address.getText();
		String textfield4=contactNumber.getText();
		if (ae.getSource() == addData) {
			
		if(!isAnyDataEmpty() && !isAllDataEmpty()){
			if(m.getEmployeeLeft() > 0){
				
				Chef c1=new Chef(textfield1,textfield2,textfield3,textfield4);
				m.addEmployee(c1);
				model.addRow(new Object[] { textfield1,textfield2,textfield3,textfield4 });
				clearAll();
			}else{
				JOptionPane.showMessageDialog(this, "Max Account Limit Reached.", "Error",
						JOptionPane.WARNING_MESSAGE);
			}
		}else{
				JOptionPane.showMessageDialog(this, "Please Provide All The necessary Information", "Warning",
						JOptionPane.WARNING_MESSAGE);
		}	
		} else if (ae.getSource() == clrData) {
			clearAll();
		} else if (ae.getSource() == removeData) {
			int selectedRows[] = table.getSelectedRows();
			
			if(selectedRows.length >=1){
				Arrays.sort(selectedRows);
				
				for (int i = selectedRows.length - 1; i >= 0; i--) {
					
					String Name = (table.getModel().getValueAt(selectedRows[i], 0).toString());
					//Employee a = m.getEmployeeByEmployeeNID(textfield2);
					//if (a != null) {
						model.removeRow(selectedRows[i]);
						//m.removeEmployee(a);
					//}else{
						//System.out.println("jfahdkfajlfasfldlsafsds");
					//}

					if (i == 0) {
					JOptionPane.showMessageDialog(this, "Successfully Deleted.");
					}
				}
			}
			else{
				JOptionPane.showMessageDialog(this, "Please Select Rows to Delete. ", "Warining",
						JOptionPane.WARNING_MESSAGE);
			}
		} else if (finish == ae.getSource()) {
			this.setVisible(false);
			//this.dispose();
		}

	}
	public boolean isAllDataEmpty(){
		return (name.getText().isEmpty() && 
			nid.getText().isEmpty() &&
			address.getText().isEmpty() &&
			contactNumber.getText().isEmpty() );
	}
	public boolean isAnyDataEmpty(){
		return (name.getText().isEmpty() || 
			nid.getText().isEmpty() ||
			address.getText().isEmpty() ||
			contactNumber.getText().isEmpty() );
	}

	public void clearAll() {
		name.setText("");
		nid.setText("");
		address.setText("");
		contactNumber.setText("");
		
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == addData)
		{
			addData.setBackground(Color.BLUE);
			addData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == removeData)
		{
			removeData.setBackground(Color.BLUE);
			removeData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == clrData)
		{
			clrData.setBackground(Color.BLUE);
			clrData.setForeground(Color.WHITE);
		}else if(me.getSource() == finish)
		{
			finish.setBackground(Color.BLUE);
			finish.setForeground(Color.WHITE);
		}
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == addData)
		{
			addData.setBackground(new Color(0, 4, 122));
			addData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == removeData)
		{
			removeData.setBackground(new Color(200, 0, 0));
			removeData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == clrData)
		{
			clrData.setBackground(new Color(150, 0, 200));
			clrData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == finish)
		{
			finish.setBackground(new Color(200, 0, 100));
			finish.setForeground(Color.WHITE);
		}
		else{}
	}
	
	
	
	 public void initializeForm() {

		title = new JLabel("Chef's Information");
		title.setBounds(450, 30, 380, 25);
		title.setFont(new Font("cambria", Font.BOLD, 35));
		panel.add(title);
		
		JSeparator j = new JSeparator();
		j.setBounds(405, 70, 380, 25);
		panel.add(j);
		
		///////////////////////////////////////////////////////////////////////

		JLabel name1 = new JLabel("Chef's Name: ");
		name1.setFont(font);
		name1.setBounds(125, 100, 180, 25);
		panel.add(name1);
		
		name = new JTextField();
		name.setFont(font);
		name.setBounds(300, 100, 180, 25);
		panel.add(name);
		
		///////////////////////////////////////////////////////////////////////

		JLabel nid1 = new JLabel("Chef's NID: ");
		nid1.setFont(font);
		nid1.setBounds(142, 150, 150, 25);
		panel.add(nid1);
		
		nid = new JTextField();
		nid.setFont(font);
		nid.setBounds(300, 150, 180, 25);
		panel.add(nid);

		///////////////////////////////////////////////////////////////////////////////////
		
		JLabel address1 = new JLabel("Address: ");
		address1.setFont(font);
		address1.setBounds(170, 200, 150, 25);
		panel.add(address1);
		
		address = new JTextField();
		address.setFont(font);
		address.setBounds(300, 200, 180, 25);
		panel.add(address);

		////////////////////////////////////////////////////////////////////////////
		
		JLabel contactNumber1 = new JLabel("Contact Number:");
		contactNumber1.setFont(font);
		contactNumber1.setBounds(80, 250, 200, 25);
		panel.add(contactNumber1);
		
		contactNumber = new JTextField();
		contactNumber.setFont(font);
		contactNumber.setBounds(300, 250, 180, 25);
		panel.add(contactNumber);
		
		/////////////////////////////////////////////////////////////////////////

		addData = new JButton("Add Chef");
		addData.setFont(new Font("cambria", Font.BOLD, 15));
		addData.setBounds(180,350,140,60);
		addData.setFocusPainted(false);
		addData.addMouseListener(this);
		addData.setBackground(new Color(50, 130, 246));
		addData.setForeground(new Color(255, 255, 255));
		addData.addActionListener(this);
		panel.add(addData);
		
		//////////////////////////////////////////////////////////////////////////

        removeData = new JButton("Delete");
		removeData.setFont(new Font("cambria", Font.BOLD, 15));
		removeData.setBounds(400, 350, 140, 60);
		removeData.setFocusPainted(false);
		removeData.addMouseListener(this);
		removeData.setBackground(new Color(200, 0, 0));
		removeData.setForeground(new Color(255, 255, 255));
		removeData.addActionListener(this);
		panel.add(removeData);
		
		//////////////////////////////////////////////////////////////////////////
		
		clrData = new JButton("Clear Info");
		clrData.setFont(new Font("cambria", Font.BOLD, 15));
		clrData.setBounds(180, 450, 140, 60);
		clrData.setFocusPainted(false);
		clrData.addMouseListener(this);
		clrData.setBackground(new Color(150, 0, 200));
		clrData.setForeground(new Color(255, 255, 255));
		clrData.addActionListener(this);
		panel.add(clrData);
		
        //////////////////////////////////////////////////////////////////////////

		finish = new JButton("Finish");
		finish.setFont(new Font("cambria", Font.BOLD, 15));
		finish.setBounds(400, 450, 140, 60);
		finish.setFocusPainted(false);
		finish.addMouseListener(this);
		finish.setBackground(new Color(200, 0, 100));
		finish.setForeground(new Color(255, 255, 255));
		finish.addActionListener(this);
		panel.add(finish);
		
		/////////////////////////////////////////////////////////////////////////////////
		
		back = new JButton("Back..");
		back.setFont(new Font("Speak pro Light" , Font.PLAIN , 15));
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(30,580,130,40);
		back.setFocusPainted(false);
		back.addActionListener(this);
		panel.add(back);

	}

	public void createTable() {
		
		model = new DefaultTableModel();
		table = new JTable(model);
		
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		table.setBackground(new Color(255, 234, 10));
		//table.setShowGrid(true);
		table.setSelectionBackground(new Color(255, 153, 51));
		table.setBounds(650, 100, 500, 400);
		
		model.addColumn("Name");
		model.addColumn("NID");
		model.addColumn("Address");
		model.addColumn("Contact Number");

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(650, 100, 500, 400);
		panel.add(scrollPane);
	}
}