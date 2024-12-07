package frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class MainFrame extends JFrame
{
    private JPanel panel;
    
    private JLabel myInfo;

    private JLabel labelUserName;
    private JTextField textUserName;
    
    private JLabel labelPassword;
    private JPasswordField textPassword;

    private JLabel labelDepartment;
    private JComboBox department;

    private JLabel labelCourse;
    private ButtonGroup courseGroup;
    private JRadioButton radioOOP1;
    private JRadioButton radioOOP2;
    private JRadioButton radioWebTech;

    private JCheckBox checkCertify;

    private JButton buttonOK;
    private JButton buttonCancel;


    public MainFrame()
    {
        this.initializeComponents();

        this.setTitle("Main Frame");
        this.setSize(450,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initializeComponents()
    {
        //   creating panel
        this.panel = new JPanel(null);

        //   1st line
        this.myInfo = new JLabel("My Basic Info");
        this.myInfo.setBounds(20,20,100,20);
        this.panel.add(this.myInfo);

        //   2nd line
        this.labelUserName = new JLabel("User Name :");
        this.labelUserName.setBounds(20,50,100,20);
        this.panel.add(this.labelUserName);

        this.textUserName = new JTextField();
        this.textUserName.setBounds(130,50,200,20);
        this.panel.add(this.textUserName);

        //   3rd line
        this.labelPassword = new JLabel("Password :");
        this.labelPassword.setBounds(20,80,100,20);
        this.panel.add(this.labelPassword);

        this.textPassword = new JPasswordField();
        this.textPassword.setBounds(130,80,200,20);
        this.panel.add(this.textPassword);

        //   4th line
        this.labelDepartment = new JLabel("Department :");
        this.labelDepartment.setBounds(20,110,100,20);
        this.panel.add(this.labelDepartment);

        String[] departmentNames = new String[]{"CSE","EEE","IPE","BBA","LAW","Architecture"};

        this.department = new JComboBox(departmentNames);
        this.department.setBounds(130,110,200,20);
        this.panel.add(this.department);

        //   5th line
        this.courseGroup = new ButtonGroup();

        this.labelCourse = new JLabel("Course : ");
        this.labelCourse.setBounds(20,140,100,20);
        this.panel.add(this.labelCourse);
                //   1st checkBox
        this.radioOOP1 = new JRadioButton("OOP1");
        this.radioOOP1.setBounds(120,140,80,20);
        this.courseGroup.add(this.radioOOP1);
        this.panel.add(this.radioOOP1);
                //   2nd checkBox
        this.radioOOP2 = new JRadioButton("OOP2");
        this.radioOOP2.setBounds(220,140,80,20);
        this.courseGroup.add(this.radioOOP2);
        this.panel.add(this.radioOOP2);
                //   3rd checkBox
        this.radioWebTech = new JRadioButton("WebTech");
        this.radioWebTech.setBounds(320,140,80,20);
        this.courseGroup.add(this.radioWebTech);
        this.panel.add(this.radioWebTech);

        //   6th line
        this.checkCertify = new JCheckBox("I certify that above informations are true");
        this.checkCertify.setBounds(20,170,300,25);
        this.panel.add(this.checkCertify);

        //   7th line
                //    1st button
        this.buttonOK = new JButton("OK");
        this.buttonOK.setBounds(100,200,100,20);
        this.panel.add(this.buttonOK);
                //    2nd button
        this.buttonCancel = new JButton("Cancel");
        this.buttonCancel.setBounds(230,200,100,20);
        this.panel.add(this.buttonCancel);


        //   adding panel to the frame
        this.add(this.panel);
    }
}