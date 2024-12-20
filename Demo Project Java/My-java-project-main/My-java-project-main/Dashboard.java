
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.*;

public class Dashboard implements ActionListener {

	//---------frame------
	JFrame frame;

	//------ Buttons--------
	JButton insertBtn, deleteBtn, dispBtn, searchBtn, logoutBtn, lcUser, proceedInsert, proceedDelete, proceedDisplay,
			proceedSearch;

	// --------labels---------
	JLabel lano, lbalance, opName;

	// ------textfields--------
	JTextField accNo, balance;

	// ------textarea----------
	JTextArea display;

	// --------imageIcon-----------
	ImageIcon i1;

	// -----for table----
	JTable jt;

	// ------Accounts------
	Account[] accounts = new Account[100];

	// -------------Parameter Constractor--------------------------

	Dashboard(String user) {
		// create frame
		frame = new JFrame("Dashboard");

		//---------------- adjust size and set layout----------------------
		// frame.setBounds(350,90,900,650);
		frame.setBounds(10, 10, 800, 650);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setResizable(false);
		frame.setVisible(true);

		//------- construct components-------------
		lano = new JLabel("Product Name");
		lano.setForeground(Color.BLACK);

		lbalance = new JLabel("Price");
		lbalance.setForeground(Color.BLACK);

		opName = new JLabel("Default!");
		opName.setForeground(Color.BLACK);

		accNo = new JTextField(5);
		balance = new JTextField(5);

		display = new JTextArea(5, 5);

		//------------ Insert Button----------------
		insertBtn = new JButton("Include");
		proceedInsert = new JButton("Update");
		frame.add(insertBtn);
		frame.add(proceedInsert);
		insertBtn.setBounds(35, 130, 120, 30);
		insertBtn.setBackground(Color.decode("#f5f5f5"));
		insertBtn.setForeground(Color.decode("#030202"));

		proceedInsert.setBounds(555, 170, 120, 30);
		proceedInsert.setBackground(Color.decode("#5b7ccf"));
		proceedInsert.setForeground(Color.white);
		proceedInsert.setVisible(false);
		insertBtn.addActionListener(this);
		proceedInsert.addActionListener(this);

		// -----------------Delete Button----------------
		deleteBtn = new JButton("Delete");
		proceedDelete = new JButton("Update");
		frame.add(deleteBtn);
		frame.add(proceedDelete);
		deleteBtn.setBounds(35, 190, 120, 30);
		deleteBtn.setBackground(Color.WHITE);
		deleteBtn.setForeground(Color.BLACK);
		proceedDelete.setVisible(false);
		proceedDelete.addActionListener(this);
		proceedDelete.setBackground(Color.decode("#5b7ccf"));
		proceedDelete.setBounds(519, 150, 120, 30);
		proceedDelete.setForeground(Color.white);
		deleteBtn.addActionListener(this);

		// ------------------Display-------------
		dispBtn = new JButton("Display");
		proceedDisplay = new JButton("Show");
		proceedDisplay.setBounds(555, 170, 120, 30);
		frame.add(dispBtn);
		frame.add(proceedDisplay);
		display.setBounds(270, 300, 280, 35);
		dispBtn.setBounds(35, 250, 120, 30);
		dispBtn.setBackground(Color.WHITE);
		dispBtn.setForeground(Color.BLACK);
		proceedDisplay.setBounds(350, 200, 120, 30);
		proceedDisplay.setForeground(Color.white);
		proceedDisplay.setBackground(Color.decode("#5b7ccf"));
		display.setVisible(false);
		proceedDisplay.setVisible(false);
		proceedDisplay.addActionListener(this);
		frame.add(display);

		// -------------------Search----------------
		proceedSearch = new JButton("Find");
		searchBtn = new JButton("🔍 Search");
		searchBtn.setBackground(Color.decode("#3399ff"));
		searchBtn.setForeground(Color.black);
		frame.add(searchBtn);
		frame.add(proceedSearch);
		proceedSearch.setBounds(390, 110, 120, 30);
		proceedSearch.setBackground(Color.decode("#5b7ccf"));
		searchBtn.setBounds(655, 0, 120, 30);
		proceedSearch.setVisible(false);

		// -------------------Log Out ---------------
		logoutBtn = new JButton("⬅ Logout");
		frame.add(logoutBtn);
		logoutBtn.setBounds(350, 450, 120, 30);
		logoutBtn.addActionListener(this);
		logoutBtn.setBackground(Color.decode("#f53131"));
		logoutBtn.setForeground(Color.black);

		//---------- User Name Showing Button----------
		lcUser = new JButton(user);

		//------- table--------------
		jt = new JTable();

		// ---------add components------------
		frame.add(lano);
		frame.add(lbalance);
		frame.add(accNo);
		frame.add(opName);
		frame.add(balance);

		frame.add(lcUser);
		frame.add(jt);

		//---------- Set Bounce----------
		lano.setBounds(200, 150, 200, 25);
		lano.setFont(new Font("Default", Font.BOLD, 15));
		lbalance.setBounds(200, 200, 100, 25);
		lbalance.setFont(new Font("Default", Font.BOLD, 15));
		// opName.setBounds (500, 80, 140, 30);
		accNo.setBounds(320, 150, 200, 30);
		balance.setBounds(320, 200, 200, 30);

		// -------User name showing Button----------
		lcUser.setBounds(300, 5, 100, 30);
		lcUser.setBackground(Color.WHITE);
		lcUser.setForeground(Color.BLACK);


		// Set Method
		lano.setVisible(false);
		lbalance.setVisible(false);
		opName.setVisible(false);
		accNo.setVisible(false);
		balance.setVisible(false);

		// addActionListener
		lcUser.addActionListener(this);
		dispBtn.addActionListener(this);
		searchBtn.addActionListener(this);

		// adjust size and set layout
		frame.setBounds(350, 90, 800, 650);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(i1.getImage());
		frame.setResizable(false);
		frame.setVisible(true);

	}

	// Accunt adding array
	public void addAccount(Account a) {
		int count = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = a;
				count++;
				break;
			}
		}
		if (count == 0) {
			display.setText("Product can not be added.");
			display.setFont(new Font("Default", Font.BOLD, 17));
		} else {
			display.setText("Product added successfully.");
			display.setFont(new Font("Default", Font.BOLD, 20));
		}
	}

	//searching an account
	public Account searchAccount(String accNo)
	{
		Account a = null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccNo().equals(accNo)) {
					a = accounts[i];
					break;
				}
			}
		}
		return a;
	}

	//-*--------deleting an account------------
	public boolean deleteAccount(String accNo)
	{
		boolean test = false;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccNo().equals(accNo)) {
					accounts[i] = null;
					test = true;
					break;
				}
			}
		}
		return test;
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == logoutBtn) {
			new LogInPage();
			frame.setVisible(false);
			// System.exit(0);
		} else if (e.getSource() == lcUser) {
			String user = lcUser.getText();
			new Profile(user);
			frame.setVisible(false);
		} else if (e.getSource() == insertBtn) {
			lano.setVisible(true);
			lbalance.setVisible(true);
			opName.setText("Operation: Update");
			opName.setVisible(true);
			accNo.setVisible(true);
			accNo.setText(null);
			balance.setVisible(true);
			balance.setText(null);
			display.setText(null);
			display.setVisible(true);
			proceedInsert.setVisible(true);
			proceedDelete.setVisible(false);
			proceedDisplay.setVisible(false);
			proceedSearch.setVisible(false);
		} 
		
		else if (e.getSource() == deleteBtn) 
		{
			lano.setVisible(true);
			accNo.setVisible(true);
			accNo.setText(null);
			display.setVisible(true);
			display.setText(null);
			proceedInsert.setVisible(false);
			proceedDelete.setVisible(true);
			proceedDisplay.setVisible(false);
			proceedSearch.setVisible(false);

			opName.setText("Operation: Delete");
			opName.setVisible(true);
			lbalance.setVisible(false);
			balance.setVisible(false);
		} else if (e.getSource() == dispBtn) {
			lano.setVisible(true);
			accNo.setVisible(true);
			accNo.setText(null);
			display.setVisible(true);
			display.setText(null);
			proceedInsert.setVisible(false);
			proceedDelete.setVisible(false);
			proceedDisplay.setVisible(true);
			proceedSearch.setVisible(false);

			opName.setText("Operation: Display");
			opName.setVisible(true);
			lbalance.setVisible(false);
			balance.setVisible(false);
		} else if (e.getSource() == searchBtn) {
			lano.setVisible(true);
			accNo.setVisible(true);
			accNo.setText(null);
			display.setVisible(true);
			display.setText(null);
			proceedInsert.setVisible(false);
			proceedDelete.setVisible(false);
			proceedDisplay.setVisible(false);
			proceedSearch.setVisible(true);

			opName.setText("Operation: Search");
			opName.setVisible(true);
			lbalance.setVisible(false);
			balance.setVisible(false);
		}

		if (e.getSource() == proceedInsert) {

			String accNum = accNo.getText();
			String bal = balance.getText();

			if (accNum.isEmpty() == false && bal.isEmpty() == false) {
				if (searchAccount(accNum) == null) {
					Account a = new Account(accNum, bal);
					this.addAccount(a);
				} else {
					JOptionPane.showMessageDialog(null,
							"A Product already exists with that Product No. " + accNum + ". Try again");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Please enter valid information in the fields");
			}

		}
		if (e.getSource() == proceedDelete) {
			String test = accNo.getText();

			boolean isDeleted = this.deleteAccount(test);

			if (isDeleted == true) {
				display.setText("Product deleted successfully.");
				display.setFont(new Font("Default", Font.BOLD, 17));
			} else {
				display.setText("Product could not be deleted.");
				display.setFont(new Font("Default", Font.BOLD, 17));
			}
		}
		if (e.getSource() == proceedDisplay) {
			String test = accNo.getText();

			accNo.setText(null);

			if (test.isEmpty() == false) {
				Account a = searchAccount(test);

				if (a != null) {
					String column[] = { "Product No.", "Price" };
					String data[][] = { { "Product No.", "Price (taka)" }, { a.getAccNo(), a.balance() } };// NOT the
																											// recommended
																											// way
					DefaultTableModel model = new DefaultTableModel(data, column);

					jt.setModel(model);
					jt.setFont(new Font("Default", Font.BOLD, 17));
					jt.setBounds(200, 300, 380, 90);

					frame.add(jt);

					jt.setVisible(true);
					display.setVisible(false);
				} else {
					display.setVisible(true);
					display.setText("Product could not found. ");
					display.setFont(new Font("Default", Font.BOLD, 17));
				}
			}
		}
		if (e.getSource() == proceedSearch) {
			String test = accNo.getText();

			Account a = this.searchAccount(test);

			if (a != null) {
				display.setText("Product found!!");
				display.setFont(new Font("Default", Font.BOLD, 17));
			} else {
				display.setText("Sorry. Product could not be found");
				display.setFont(new Font("Default", Font.BOLD, 17));
			}
		}
	}
}
