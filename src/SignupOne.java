import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import java.util.*;
public class SignupOne extends JFrame implements ActionListener{
    JDateChooser  dateChooser;
Random ran = new Random();
Long first4 = (ran.nextLong() % 9000L)+1000L;
String first = " " + Math.abs(first4);

JRadioButton r1,r2,r3;
JRadioButton m1,m2,m3;
JButton Next;

JTextField textName;
JTextField textfName;
JTextField textmName;
JTextField textDOB;
JTextField textemail;
JTextField textaddress;
JTextField textcity;
JTextField textpin;


    SignupOne(){
        super("APPLICATION FORM");

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
        Image I2 = I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Label = new JLabel(I3);
        Label.setBounds(30,20,100,100);
        add(Label);

        JLabel Label1 = new JLabel("APPLICATION FORM NO."+first);
        Label1.setBounds(160,20,600,40);
        Label1.setFont(new Font("Raleway",Font.BOLD,34));
        add(Label1);

        JLabel Label2 = new JLabel("Page: 1");
        Label2.setBounds(160,60,600,30);
        Label2.setFont(new Font("Raleway",Font.BOLD,20));
        add(Label2);

        JLabel Label3 = new JLabel("PERSONAL DETAILS");
        Label3.setBounds(160,90,600,30);
        Label3.setFont(new Font("Raleway",Font.BOLD,14));
        add(Label3);

        JLabel Labelname = new JLabel("NAME:");
        Labelname.setBounds(160,150,600,30);
        Labelname.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labelname);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(310,150,400,30);
        add(textName);

        JLabel Labelfname = new JLabel("FATHER NAME:");
        Labelfname.setBounds(160,190,600,30);
        Labelfname.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labelfname);

        textfName = new JTextField();
        textfName.setFont(new Font("Raleway",Font.BOLD,14));
        textfName.setBounds(310,190,400,30);
        add(textfName);

        JLabel Labelmname = new JLabel("MOTHER'S NAME:");
        Labelmname.setBounds(160,230,600,30);
        Labelmname.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labelmname);

        textmName = new JTextField();
        textmName.setFont(new Font("Raleway",Font.BOLD,14));
        textmName.setBounds(310,230,400,30);
        add(textmName);

        JLabel LabelDOB = new JLabel("DATE OF BIRTH:");
        LabelDOB.setBounds(160,270,600,30);
        LabelDOB.setFont(new Font("Raleway",Font.BOLD,14));
        add(LabelDOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(150,150,150,150));
        dateChooser.setBounds(310,270,400,30);
        add(dateChooser);

        textDOB = new JTextField();
        textDOB.setFont(new Font("Raleway",Font.BOLD,14));
        textDOB.setBounds(310,270,400,30);
        add(textDOB);


        JLabel LabelGender = new JLabel("GENDER:");
        LabelGender.setBounds(160,310,600,30);
        LabelGender.setFont(new Font("Raleway",Font.BOLD,14));
        add(LabelGender);

        r1 = new JRadioButton("Male");
        r1.setBounds(310,310,60,30);
        r1.setBackground (new Color(160, 207, 209, 229));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(450,310,80,30);
        r2.setBackground (new Color(160, 207, 209, 229));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        add(r2);

        r3 = new JRadioButton("Other's");
        r3.setBounds(610,310,80,30);
        r3.setBackground (new Color(160, 207, 209, 229));
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        add(r3);

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);
        buttongroup.add(r3);


        JLabel Labelemail = new JLabel("EMAIL:");
        Labelemail.setBounds(160,350,600,30);
        Labelemail.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labelemail);

        textemail = new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,14));
        textemail.setBounds(310,350,400,30);
        add(textemail);

        JLabel Labelmarit = new JLabel("MARITAL STATUS:");
        Labelmarit.setBounds(160,390,600,30);
        Labelmarit.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labelmarit);

        m1 = new JRadioButton("Married");
        m1.setBounds(310,390,80,30);
        m1.setBackground (new Color(160, 207, 209, 229));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,390,100,30);
        m2.setBackground (new Color(160, 207, 209, 229));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other's");
        m3.setBounds(610,390,80,30);
        m3.setBackground (new Color(160, 207, 209, 229));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);

        ButtonGroup buttongroup1 = new ButtonGroup();
        buttongroup1.add(m1);
        buttongroup1.add(m2);
        buttongroup1.add(m3);

        JLabel Labeladdress = new JLabel("ADDRESS:");
        Labeladdress.setBounds(160,430,600,30);
        Labeladdress.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labeladdress);

        textaddress = new JTextField();
        textaddress.setFont(new Font("Raleway",Font.BOLD,14));
        textaddress.setBounds(310,430,400,30);
        add(textaddress);

        JLabel Labelcity = new JLabel("CITY:");
        Labelcity.setBounds(160,470,600,30);
        Labelcity.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(310,470,400,30);
        add(textcity);

        JLabel Labelpin = new JLabel("PIN CODE:");
        Labelpin.setBounds(160,510,600,30);
        Labelpin.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(310,510,400,30);
        add(textpin);

        JLabel Labelstate = new JLabel("PIN CODE:");
        Labelstate.setBounds(160,510,600,30);
        Labelstate.setFont(new Font("Raleway",Font.BOLD,14));
        add(Labelstate);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(310,510,400,30);
        add(textpin);

        Next = new JButton("NEXT");
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setForeground(Color.WHITE);
        Next.setBackground(Color.BLACK);
        Next.setBounds(620,600,80,30);
        Next.addActionListener(this);
        add(Next);

        getContentPane().setBackground (new Color(160, 207, 209, 229));
        setLayout(null);
        setSize(800,800);
        setLocation(300,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String formno = first;
        String name = textName.getText();
        String fName = textfName.getText();
        String mName = textmName.getText();
        String DOB = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }
        else if (r2.isSelected())
        {
            gender = "Female";
        }
        else if (r3.isSelected()){
            gender = "Other's";
        }
        String email = textemail.getText();
        String marital = null;
        if (m1.isSelected()){
            marital = "Married";
        }
        else if (m2.isSelected()){
            marital = "Unmarried";
        }
        else if (m3.isSelected()){
            marital = "Other's";
        }
        String address = textaddress.getText();
        String city = textcity.getText();
        String pin = textpin.getText();

        try{
        if(textName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        }else{
            Conn con1 = new Conn();
            String q = "insert into signup values('"+formno+"','"+name+"','"+fName+"','"+mName+"','"+DOB+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"')";
            con1.statement.executeUpdate(q);
            new SignupTwo(first);
            setVisible(false);
        }
        }catch(Exception E){
            E.printStackTrace(); //for knowing runtime error
        }

    }

    public static void main (String [] args){
    new SignupOne();
    }
}
