package lackstreet;

import javax.swing.*;

public class LoginPage extends JFrame{
    private JPanel panel1;
    private JTextField tfUsername;
    private JTextField tfPassword;
    private JButton btSignup;
    private JButton btLogin;

    public LoginPage(){
        super();

        setTitle("Login");
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(true);
        setVisible(true);
    }
}
