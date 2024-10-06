import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {

    JComboBox combobox , combobox1 , combobox2,combobox3,combobox4;
    JTextField Textnid ,  TextBirthc;
    JRadioButton r1 , r2, e1 , e2;
    JButton Next;
    String formno;


    SignupTwo(String formno){

        super("APPLICATION FORM");


        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
        Image I2 = I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Label = new JLabel(I3);
        Label.setBounds(150,20,100,100);
        add(Label);

        this.formno = formno;

        JLabel L1 = new JLabel("FORM No:");
        L1 .setBounds(300,30,600,30);
        L1 .setFont(new Font("Raleway",Font.BOLD,20));
        add(L1);

        JLabel L11 = new JLabel(formno);
        L11 .setBounds(400,30,600,30);
        L11 .setFont(new Font("Raleway",Font.BOLD,20));
        add(L11 );

        JLabel L2 = new JLabel("Page: 2");
        L2.setBounds(300,60,600,30);
        L2.setFont(new Font("Raleway",Font.BOLD,22));
        add(L2);

        JLabel L3 = new JLabel("ADDITIONAL DETAILS");
        L3.setBounds(300,90,600,30);
        L3.setFont(new Font("Raleway",Font.BOLD,18));
        add(L3);

        JLabel L4 = new JLabel("RELIGION:");
        L4.setBounds(160,150,600,30);
        L4.setFont(new Font("Raleway",Font.BOLD,14));
        add(L4);

        String religion[] ={"Muslim","Hindu","Buddha","Christian","Other's"};
        combobox = new JComboBox(religion);
        combobox.setFont(new Font("Raleway",Font.BOLD,14));
        combobox.setBounds(310,150,400,30);
        add(combobox);

        JLabel L5 = new JLabel("CATEGORY:");
        L5.setBounds(160,190,600,30);
        L5.setFont(new Font("Raleway",Font.BOLD,14));
        add(L5);

        String category[] ={"General","OBC","SC","ST","Other's"};
        combobox1 = new JComboBox(category);
        combobox1.setFont(new Font("Raleway",Font.BOLD,14));
        combobox1.setBounds(310,190,400,30);
        add(combobox1);

        JLabel L6 = new JLabel("INCOME:");
        L6.setBounds(160,230,600,30);
        L6.setFont(new Font("Raleway",Font.BOLD,14));
        add(L6);

        String income[] ={"Null","<10,0000","<50,0000","Upto 10,00000","Above 10,0000"};
        combobox2 = new JComboBox(income);
        combobox2.setFont(new Font("Raleway",Font.BOLD,14));
        combobox2.setBounds(310,230,400,30);
        add(combobox2);

        JLabel L7 = new JLabel("EDUCATION:");
        L7.setBounds(160,270,600,30);
        L7.setFont(new Font("Raleway",Font.BOLD,14));
        add(L7);

        String education[] ={"Non-Graduate","Graduate","Post_Graduate","Other's"};
        combobox3 = new JComboBox(education);
        combobox3.setFont(new Font("Raleway",Font.BOLD,14));
        combobox3.setBounds(310,270,400,30);
        add(combobox3);

        JLabel L8 = new JLabel("OCCUPATION:");
        L8.setBounds(160,310,600,30);
        L8.setFont(new Font("Raleway",Font.BOLD,14));
        add(L8);

        String occupation[] ={"Salaried","Self-Employed","Business","Student","Retired","Other's"};
        combobox4 = new JComboBox(occupation);
        combobox4.setFont(new Font("Raleway",Font.BOLD,14));
        combobox4.setBounds(310,310,400,30);
        add(combobox4);

        JLabel nid = new JLabel("NID NO:");
        nid.setBounds(160,370,600,30);
        nid.setFont(new Font("Raleway",Font.BOLD,14));
        add(nid);

        Textnid = new JTextField();
        Textnid.setFont(new Font("Raleway",Font.BOLD,14));
        Textnid.setBounds(310,370,400,30);
        add(Textnid);

        JLabel Birthc = new JLabel("BIRTH CERTIFICATE");
        Birthc.setBounds(160,410,600,30);
        Birthc.setFont(new Font("Raleway",Font.BOLD,14));
        add(Birthc);

        JLabel birthc = new JLabel("NO:");
        birthc.setBounds(160,430,600,30);
        birthc.setFont(new Font("Raleway",Font.BOLD,14));
        add(birthc);

        TextBirthc = new JTextField();
        TextBirthc.setFont(new Font("Raleway",Font.BOLD,14));
        TextBirthc.setBounds(310,420,400,30);
        add(TextBirthc) ;

        JLabel L9 = new JLabel("SENIOR CITIZEN:");
        L9.setBounds(160,480,600,30);
        L9.setFont(new Font("Raleway",Font.BOLD,14));
        add( L9);

        r1 = new JRadioButton("Yes");
        r1.setBounds(330,480,60,30);
        r1.setBackground (new Color(213, 251, 224, 229));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBounds(470,480,80,30);
        r2.setBackground (new Color( 213, 251, 224, 229));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        add(r2);

        JLabel L10 = new JLabel("EXISTING ACCOUNT:");
        L10 .setBounds(160,520,600,30);
        L10 .setFont(new Font("Raleway",Font.BOLD,14));
        add(L10);

        e1= new JRadioButton("Yes");
        e1.setBounds(330,520,60,30);
        e1.setBackground (new Color(213, 251, 224, 229 ));
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        add(e1);

        e2= new JRadioButton("No");
        e2.setBounds(470,520,80,30);
        e2.setBackground (new Color( 213, 251, 224, 229));
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        add(e2);

        Next = new JButton("NEXT");
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setForeground(Color.WHITE);
        Next.setBackground(Color.BLACK);
        Next.setBounds(620,600,80,30);
        Next.addActionListener(this);
        add(Next);

        getContentPane().setBackground (new Color(213, 251, 224, 229));
        setLayout(null);
        setSize(800,700);
        setLocation(300,10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String rel = (String) combobox.getSelectedItem();
    String cate = (String) combobox1.getSelectedItem();
    String inc = (String) combobox2.getSelectedItem();
    String edu = (String) combobox3.getSelectedItem();
    String occu = (String) combobox4.getSelectedItem();

    String nid = Textnid.getText();
    String birth = TextBirthc.getText();
    String citizen =" ";
        if(r1.isSelected()){
           citizen  = "Yes";
        }
        else if (r2.isSelected())
        {
            citizen = "No";
        }
        String eaccount =" ";
        if(r1.isSelected()){
            eaccount  = "Yes";
        }
        else if (r2.isSelected())
        {
            eaccount = "No";
        }
        try {
           if(Textnid.getText().equals("") || TextBirthc.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Fill all the fields");
           } else {
               Conn c = new Conn();
               String q = "insert into signupTwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occu+"','"+nid+"','"+birth+"','"+citizen+"','"+eaccount+"')";
               c.statement.executeUpdate(q);
               new SignupThree(formno);
               setVisible(false);
           }
        }
        catch(Exception E){
            E.printStackTrace();

    }
    }

    public static void main (String [] args){
    new SignupTwo("");
    }
}
