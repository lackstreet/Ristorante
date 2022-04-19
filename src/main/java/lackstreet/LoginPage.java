package lackstreet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginPage extends JFrame implements MouseListener {

    private final Container container = getContentPane();
    private final JLabel userLabel = new JLabel("USERNAME");
    private final JLabel passwordLabel = new JLabel("PASSWORD");
    private final JLabel signupLabel = new JLabel("Se non sei ancora registrato,");
    private final JLabel clickLabel = new JLabel("clicca qui");
    private final JTextField userTextField = new JTextField();
    private final JPasswordField passwordField = new JPasswordField();
    private final JButton loginButton = new JButton("LOGIN");
    private final JCheckBox showPassword = new JCheckBox("Show Password");
    private final JLabel sinistraLabel = new JLabel("SINISTROIDE");
    boolean clicked = false;

    public LoginPage() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();

        clickLabel.addMouseListener(this);

        /* JFrame methods called */
        setTitle("Login Form");
        setVisible(true);
        setBounds(10, 10, 370, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);

    }

    public void setLayoutManager() {

        container.setLayout(null);

        signupLabel.setFont(new Font("sansSerif", Font.PLAIN, 11));

        clickLabel.setFont(new Font("sansSerif", Font.BOLD, 11));
        clickLabel.setForeground(new Color(0x447dc6));
        clickLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        sinistraLabel.setBackground(Color.BLACK);
        sinistraLabel.setForeground(Color.RED);
        sinistraLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));

    }

    public void setLocationAndSize() {

        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        signupLabel.setBounds(50, 275, 140, 30);
        clickLabel.setBounds(192, 275, 50, 30);
       loginButton.setBounds(100, 325, 100, 30);
        sinistraLabel.setBounds(50, 100, 500, 50);

    }

    public void addComponentsToContainer() {

        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(signupLabel);
        container.add(clickLabel);
        container.add(loginButton);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(!clicked){
            container.add(sinistraLabel);
            clicked = true;
            System.out.println("mouse pressed");
        } else {
            container.remove(sinistraLabel);
            clicked = false;
            System.out.println("mouse unpressed");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {



    }

    @Override
    public void mouseEntered(MouseEvent e) {
        clickLabel.setText("<html><a href=''>clicca qui</a></html>");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        clickLabel.setText("clicca qui");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        container.remove(sinistraLabel);

    }
    private void createUIComponents() {
        // TODO: place custom component creation code here


    }
}
