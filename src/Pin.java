import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATM.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1300,830);
        add(l3);

        JLabel label1 = new JLabel(" CHANGE YOUR PIN:");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(340,180,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel(" NEW PIN:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(340,230,400,35);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65, 125, 128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(490, 230, 200, 30);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add( p1);

        JLabel label3 = new JLabel("RE-ENTER PIN:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setBounds(340,270,400,35);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65, 125, 128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(490, 270, 200, 30);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add( p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(560,364,150,35);
        b1.setBackground(new Color(128, 168, 171, 229));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(560,410,150,35);
        b2.setBackground(new Color(128, 168, 171, 229));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
try{
    String pin1 = p1.getText();
    String pin2 = p2.getText();
    if(!pin1.equals(pin2)){
        JOptionPane.showMessageDialog(null,"Entered PIN does not match!");
    }
    if(e.getSource()==b1) {
        if (p1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter New Pin!");
        }
        if (p2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Re-Enter New Pin!");
        }


        Conn c = new Conn();
        String q1 = "update bank set form_no = '"+pin1+"' where form_no = '"+pin+"'";
        String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
        String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

        c.statement.executeUpdate(q1);
        c.statement.executeUpdate(q2);
        c.statement.executeUpdate(q3);

        JOptionPane.showMessageDialog(null,"PIN changed successfully");
        setVisible(false);
        new main_Class(pin);

    }
    else if (e.getSource()==b2) {
        new main_Class(pin);
        setVisible(false);
    }


}catch(Exception E){

}
    }

    public static void main(String [] args){
        new Pin("");
    }
}
