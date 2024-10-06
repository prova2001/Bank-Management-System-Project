import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class  Login extends JFrame implements ActionListener{
    JButton login , signup, clear; //defining globally so that we can use beside the abstract method
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("ONLINE BANKING SYSTEM");
        setLayout(null);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("Logo.png"));
        Image I2 = I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Label = new JLabel(I3);
        Label.setBounds(70,10,100,100);
        add(Label);

        JLabel text = new JLabel("WELCOME TO ONLINE BANKING");
        text.setBounds(200,40,600,40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Osward", Font.BOLD,34));
        add (text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setBounds(200,150,600,40);
        cardno.setForeground(Color.WHITE);
        cardno.setFont(new Font("Raleway", Font.BOLD,24));
        add (cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(320,150,250,40);
        cardTextField.setFont(new Font("Arial", Font.BOLD,18));
        add(cardTextField);


        JLabel pin = new JLabel("PIN:");
        pin.setBounds(200,210,600,40);
        pin.setForeground(Color.WHITE);
        pin.setFont(new Font("Raleway", Font.BOLD,24));
        add (pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(320,210,250,40);
        pinTextField.setFont(new Font("Arial", Font.BOLD,18));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(320,290,100,40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(470,290,100,40);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(320,350,250,40);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        ImageIcon III1 = new ImageIcon(ClassLoader.getSystemResource("card.png"));
        Image III2 = III1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon III3 = new ImageIcon(III2);
        JLabel Label2 = new JLabel(III3);
        Label2.setBounds(650,340,100,100);
        add(Label2);

        ImageIcon II1 = new ImageIcon(ClassLoader.getSystemResource("Backbg.png"));
        Image II2 = II1.getImage().getScaledInstance(800,500, Image.SCALE_DEFAULT);
        ImageIcon II3 = new ImageIcon(II2);
        JLabel Label1 = new JLabel(II3);
        Label1.setBounds(0,0,800,500);
        add(Label1);

        getContentPane().setBackground(Color.WHITE);


        setSize(800,500);
        setLocation(200,100);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){

   try{
       if(ae.getSource()==login){
           Conn c = new Conn();
           String cardno = cardTextField.getText();
           String pin = pinTextField.getText();
           String q = "select *from login where card_no = '"+cardno+"' and pin = '"+pin+"' ";
           ResultSet resultset = c.statement.executeQuery(q);
           if(resultset.next()){
               setVisible(false);
               new main_Class(pin);
           } else
           {
               JOptionPane.showMessageDialog(null,"Incorrect number or pin");
           }}else if (ae.getSource()==clear){
               cardTextField.setText("");
            pinTextField.setText("");
           }else if (ae.getSource()==signup){
           new SignupOne();
           setVisible(false);
       }
   }catch(Exception e){
       e.printStackTrace();
   }

    }
    public static void main(String[] args) {
        new Login();
    }
}

