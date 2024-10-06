import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    TextField textField;
    JButton b1, b2;
    JButton prevButton, nextButton, selectButton;
    JLabel cashLabel;
    int currentIndex = 0;
    int totalAmount = 0;

    String[] taka = {"1000tk", "500tk", "200tk", "100tk", "50tk", "20tk", "10tk", "5tk"};
    int[] amounts = {1000, 500, 200, 100, 50, 20, 10, 5};
    ImageIcon[] takaImages;

    Deposit(String pin) {
        this.pin = pin;

        // Load images
        try {
            takaImages = new ImageIcon[]{
                    new ImageIcon(ClassLoader.getSystemResource("tk1000 (1).jpg")),
                    new ImageIcon(ClassLoader.getSystemResource("tk500 (1).jpg")),
                    new ImageIcon(ClassLoader.getSystemResource("tk200 (1).jpg")),
                    new ImageIcon(ClassLoader.getSystemResource("tk100 (1).jpg")),
                    new ImageIcon(ClassLoader.getSystemResource("tk50 (1).jpg")),
                    new ImageIcon(ClassLoader.getSystemResource("tk20 (1).jpg")),
                    new ImageIcon(ClassLoader.getSystemResource("tk10 (1).jpg")),
                    new ImageIcon(ClassLoader.getSystemResource("tk5 (1).jpg"))
            };
        } catch (Exception e) {
            e.printStackTrace();
        }

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATM.png"));
        Image i2 = i1.getImage().getScaledInstance(1300, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1300, 830);
        add(l3);

        JLabel label1 = new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT:");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(340, 150, 400, 35);
        l3.add(label1);

        JPanel cashPanel = new JPanel();
        cashPanel.setLayout(new BoxLayout(cashPanel, BoxLayout.Y_AXIS));
        cashPanel.setBounds(338, 230, 380, 140);
        cashPanel.setBackground(new Color(128, 168, 171, 229));
        l3.add(cashPanel);

        JLabel headline = new JLabel("SELECT CASH",JLabel.CENTER);
        headline.setFont(new Font("Raleway", Font.BOLD, 16));
        headline.setBounds(338, 190, 380, 30);
        headline.setForeground(Color.WHITE);
        l3.add(headline);

        JPanel imagePanel = new JPanel(new BorderLayout());
        cashLabel = new JLabel(takaImages[currentIndex]);
        cashLabel.setHorizontalAlignment(JLabel.CENTER);
        imagePanel.add(cashLabel, BorderLayout.CENTER);

        prevButton = new JButton("<");
        prevButton.addActionListener(this);
        imagePanel.add(prevButton, BorderLayout.WEST);

        nextButton = new JButton(">");
        nextButton.addActionListener(this);
        imagePanel.add(nextButton, BorderLayout.EAST);

        selectButton = new JButton("SELECT");
        selectButton.setBounds(338,370,380,30);
        selectButton.setBackground( new Color(128, 168, 171, 229));
        selectButton.setForeground(Color.WHITE);
        selectButton.addActionListener(this);
        l3.add(selectButton);

        cashPanel.add(imagePanel);
        updateButtons();


        b1 = new JButton("DEPOSIT");
        b1.setBounds(340, 410, 120, 35);
        b1.setBackground(new Color(128, 168, 171, 229));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(595, 410, 120, 35);
        b2.setBackground(new Color(128, 168, 171, 229));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    private void updateButtons() {
        prevButton.setEnabled(currentIndex > 0);
        nextButton.setEnabled(currentIndex < takaImages.length - 1);
        cashLabel.setIcon(takaImages[currentIndex]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevButton) {
            if (currentIndex > 0) {
                currentIndex--;
                updateButtons();
            }
        } else if (e.getSource() == nextButton) {
            if (currentIndex < takaImages.length - 1) {
                currentIndex++;
                updateButtons();
            }
        } else if (e.getSource() == selectButton) {
            totalAmount += amounts[currentIndex];
            JOptionPane.showMessageDialog(null, "Selected " + taka[currentIndex] + ". Total: " + totalAmount + "tk");
        } else if (e.getSource() == b1) {
            try {
                String amount = String.valueOf(totalAmount);
                Date date = new Date();
                if (totalAmount == 0) {
                    JOptionPane.showMessageDialog(null, "Please select the Amount you want to Deposit");
                } else {
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "','Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new main_Class(pin);
        }
    }

    public static void main (String []args){
        new Deposit("");
    }
}
