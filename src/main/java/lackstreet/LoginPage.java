package lackstreet;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.View;
import java.awt.*;
import java.util.jar.JarEntry;

public class LoginPage extends JFrame {

    final JButton btLogin;
    final JTextField tfUsername, tfPassword;



    public LoginPage() {
        super();
        tfUsername = new JTextField("Username");
        tfPassword = new JTextField("password");
        btLogin = new JButton("Login");

        JFrame root = new JFrame("Login");

        JPanel mainPan = new JPanel();
        //set the border layout
        mainPan.add(tfUsername);
        mainPan.add(tfPassword);
        mainPan.add(btLogin);

        root.setContentPane(mainPan);
        root.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        root.setSize(300, 150);
        root.setResizable(true);
        root.setVisible(true);


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }
}
