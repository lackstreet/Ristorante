package lackstreet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class LoginPage extends JFrame {

        private final Container container = getContentPane();
        private final JLabel userLabel = new JLabel("USERNAME");
        private final JLabel passwordLabel = new JLabel("PASSWORD");
        private final JLabel signupLabel = new JLabel("Se non sei ancora registrato, clicca qui");
        private final JTextField userTextField = new JTextField();
        private final JPasswordField passwordField = new JPasswordField();
        private final JButton loginButton = new JButton("LOGIN");
        private final JCheckBox showPassword = new JCheckBox("Show Password");

        public LoginPage() {
            setLayoutManager();
            setLocationAndSize();
            addComponentsToContainer();

            /* JFrame methods called */
            setTitle("Login Form");
            setVisible(true);
            setBounds(10, 10, 370, 600);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setResizable(true);

        }
        public void setLayoutManager() {
            container.setLayout(null);
        }
        public void setLocationAndSize() {
            userLabel.setBounds(50, 150, 100, 30);
            passwordLabel.setBounds(50, 220, 100, 30);
            userTextField.setBounds(150, 150, 150, 30);
            passwordField.setBounds(150, 220, 150, 30);
            showPassword.setBounds(150, 250, 150, 30);
            signupLabel.setBounds(50, 250, 100, 30); //non si adatta bene alla visuale
            loginButton.setBounds(50, 300, 100, 30);
        }
        public void addComponentsToContainer() {
            container.add(userLabel);
            container.add(passwordLabel);
            container.add(userTextField);
            container.add(passwordField);
            container.add(showPassword);
            container.add(signupLabel);
            container.add(loginButton);
        }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }
}
