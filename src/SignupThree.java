import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.rmi.server.ExportException;


public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    SignupThree(String formno) {

        this.formno = formno;

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
        Image I2 = I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Label = new JLabel(I3);
        Label.setBounds(150,10,100,100);
        add(Label);


        JLabel L1 = new JLabel("Page: 2");
        L1.setBounds(270,20,600,30);
        L1.setFont(new Font("Raleway",Font.BOLD,18));
        add(L1);

        JLabel l1 = new JLabel("FORM No:");
        l1 .setBounds(270,50,600,30);
        l1 .setFont(new Font("Raleway",Font.BOLD,18));
        add(l1);

        JLabel L11 = new JLabel(formno);
        L11 .setBounds(350,50,600,30);
        L11 .setFont(new Font("Raleway",Font.BOLD,18));
        add(L11 );

        JLabel L2 = new JLabel("ACCOUNT DETAILS:");
        L2.setBounds(270,80,600,30);
        L2.setFont(new Font("Raleway",Font.BOLD,18));
        add(L2);

        JLabel l3 = new JLabel("ACCOUNT TYPE:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,130,600,30);
        add(l3);

        r1 = new JRadioButton("Saving Account ");
        r1.setFont(new Font("Ralewy",Font.BOLD,14));
        r1.setBounds(100,170,200,30);
        r1.setBackground(new Color(226, 190, 173, 229));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Ralewy",Font.BOLD,14));
        r2.setBounds(350,170,200,30);
        r2.setBackground(new Color(226, 190, 173, 229));
        add(r2);


        r3 = new JRadioButton("Current Account ");
        r3.setFont(new Font("Ralewy",Font.BOLD,14));
        r3.setBounds(100,200,200,30);
        r3.setBackground(new Color(226, 190, 173, 229));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Ralewy",Font.BOLD,14));
        r4.setBounds(350,200,250,30);
        r4.setBackground(new Color(226, 190, 173, 229));
        add(r4);

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);
        buttongroup.add(r3);
        buttongroup.add(r4);

        JLabel l4 = new JLabel("CARD No:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,240,600,30);
        add(l4);

        JLabel l5 = new JLabel("(Enter your 16 digit card number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,270,600,20);
        add(l5);


        JLabel L6 = new JLabel("XXXX-XXXX-XXXX-4841");
        L6.setFont(new Font("Raleway",Font.BOLD,18));
        L6.setBounds(330,240,250,30);
        add(L6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,270,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,310,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,310,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,340,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,380,200,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color( 226, 190, 173, 229));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,420,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color( 226, 190, 173, 229));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,420,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color( 226, 190, 173, 229));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,460,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color( 226, 190, 173, 229));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,460,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color( 226, 190, 173, 229));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,500,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color( 226, 190, 173, 229));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,500,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.",true);
        c7.setBackground(new Color( 226, 190, 173, 229));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,540,600,20);
        add(c7);


        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(260,600,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(400,600,100,30);
        c.addActionListener(this);
        add(c);


        getContentPane().setBackground (new Color(226, 190, 173, 229));
        setLayout(null);
        setSize(800,700);
        setLocation(300,10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accType = null;
        if (r1.isSelected()){
            accType = "Saving Account ";
        } else if (r2.isSelected()){
            accType = "Fixed Deposit Account";
        } else if(r3.isSelected()){
            accType = "Current Account ";
        } else if(r4.isSelected()){
            accType = "Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String sr = "";
        if(c1.isSelected()){
            sr = sr+"ATM CARD";
        }
        else if (c2.isSelected()){
            sr = sr+"Internet Banking";
        }
        else if (c3.isSelected()){
            sr = sr+"Mobile Banking";
        }
        else if (c4.isSelected()){
            sr = sr+"EMAIL Alerts";
        }
        else if (c5.isSelected()){
            sr = sr+"Cheque Book";
        }
        else if (c6.isSelected()){
            sr = sr+"E-Statement";
        }
try{
    if (e.getSource()==s) {
        if (accType.equals("")) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else {
            Conn c1 = new Conn();
            String q1 = "insert into signupThree values('"+formno+"','"+accType+"','"+cardno+"','"+pin+"','"+sr+"')";
            String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
            c1.statement.executeUpdate(q1);
            c1.statement.executeUpdate(q2);
            JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
            new Deposit(pin);
            setVisible(false);

        }
    }
    else if (e.getSource()==c) {
        System.exit(0);
    }
} catch (Exception E){
    E.printStackTrace();
}
    }
    public static void main(String[]args){
        new SignupThree("");
    }

}
