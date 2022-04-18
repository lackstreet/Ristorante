package lackstreet;

import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;
import java.util.jar.JarEntry;

public class LoginPage extends JFrame{

    private final JButton LoginBt;
    private final JTextField usernameTF, passwordTF;

    public LoginPage(){
        super();
        usernameTF =new JTextField("Username");
        passwordTF =new JTextField("password");
        LoginBt=new JButton("Login");

        JFrame root =new JFrame("Login");

        JPanel mainPan =new JPanel();
        mainPan.add(usernameTF);
        mainPan.add(passwordTF);
        mainPan.add(LoginBt);

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
