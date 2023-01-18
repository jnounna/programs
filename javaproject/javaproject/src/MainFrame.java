import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class  MainFrame extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfuserName, tfpassword;
    JLabel display;
    

    public void init(){
/*setting up for a section of the gui for password and username */
    JLabel userName = new JLabel("User Name");
    userName.setFont(mainFont);

    tfuserName = new JTextField();
    tfuserName.setFont(mainFont);

    JLabel password = new JLabel("Password");
    password.setFont(mainFont);

    tfpassword = new JTextField();
    tfpassword.setFont(mainFont);


/*This will make it to be able to display on the GUI */
    JPanel topPanel = new JPanel();
    topPanel.setLayout(new GridLayout(4, 1, 5, 5));
    topPanel.add(userName);
    topPanel.add(tfuserName);
    topPanel.add(password);
    topPanel.add(tfpassword);

/*This will display back the username and password */
    display = new JLabel();
    display.setFont(mainFont);

/*Buttons */
    JButton btnOF = new JButton("OK");
    btnOF.setFont(mainFont);
    btnOF.addActionListener((new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String user = tfuserName.getText();
            String pass = tfpassword.getText();
            display.setText("Your username and password are " + user + " "+ pass);
        }
        
    }));

    JButton clear = new JButton("Clear");
    clear.setFont(mainFont);
    clear.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            tfuserName.setText("");
            tfpassword.setText("");
            display.setText("");

        }
        
    });

    JPanel buttonsPanel = new JPanel();
    buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
    buttonsPanel.add(btnOF);
    buttonsPanel.add(clear);



/*This will make the base of th GUI giving it dimensions and color. */   
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(new Color(255, 182, 193));
    mainPanel.add(topPanel, BorderLayout.NORTH);
    mainPanel.add(display, BorderLayout.CENTER);
    mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

    add(mainPanel);
    


    setTitle("Welcome!");
    setSize(500, 600);
    setMinimumSize(new Dimension(300,400));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.init();
    }
}