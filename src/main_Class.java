import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b5,b6,b7;
    String pin;
main_Class(String pin){

    this.pin = pin;

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATM.png"));
    Image i2 = i1.getImage().getScaledInstance(1300,830,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l3 = new JLabel(i3);
    l3.setBounds(0,0,1300,830);
    add(l3);

    JLabel label1 = new JLabel("PLEASE SELECT YOUR TRANSACTION:");
    label1.setForeground(Color.WHITE);
    label1.setFont(new Font("System", Font.BOLD, 18));
    label1.setBounds(355,200,400,35);
    l3.add(label1);

    b1 = new JButton("DEPOSIT");
    b1.setForeground(Color.WHITE);
    b1.setBackground(new Color(65,125,128));
    b1.setBounds(350,274,155,35);
    b1.addActionListener(this);
    l3.add(b1);

    b2 = new JButton("CASH WITHDRAWL");
    b2.setForeground(Color.WHITE);
    b2.setBackground(new Color(65,125,128));
    b2.setBounds( 560,274,155,35 );
    b2.addActionListener(this);
    l3.add(b2);

    b6 = new JButton("BALANCE ENQUIRY");
    b6.setForeground(Color.WHITE);
    b6.setBackground(new Color(65,125,128));
    b6.setBounds(350,318,155,35);
    b6.addActionListener(this);
    l3.add(b6);

    b5 = new JButton("PIN CHANGE");
    b5.setForeground(Color.WHITE);
    b5.setBackground(new Color(65,125,128));
    b5.setBounds(  560,318,155,35);
    b5.addActionListener(this);
    l3.add(b5);



    b7 = new JButton("EXIT");
    b7.setForeground(Color.WHITE);
    b7.setBackground(new Color(65,125,128));
    b7.setBounds(560,410,155,35);
    b7.addActionListener(this);
    l3.add(b7);

    setLayout(null);
    setSize(1550,1080);
    setLocation(0,0);
    setVisible(true);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquriy(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        }

    }

    public static void main (String[]args){
new main_Class("");
    }
}
