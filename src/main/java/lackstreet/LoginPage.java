package lackstreet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginPage extends JFrame implements MouseListener {

    private final JPanel mainLogPanel = new JPanel(new BorderLayout());
    private final JPanel regLogPanel = new JPanel(new GridBagLayout());
    private final JPanel fullLogPanel = new JPanel(new GridBagLayout());

    private final JLabel userLabel = new JLabel("USERNAME");
    private final JLabel passwordLabel = new JLabel("PASSWORD");
    private final JLabel signupLabel = new JLabel("Se non sei ancora registrato,");
    private final JLabel clickLabel = new JLabel("clicca qui");

    private final JTextField userTextField = new JTextField(15);
    private final JPasswordField passwordField = new JPasswordField(15);

    private final JButton loginButton = new JButton("LOGIN");

    private final JCheckBox showPassword = new JCheckBox("Show Password");

    //empty panel to spacing and centering log option
    private final JPanel northPanel = new JPanel();
    private final JPanel southPanel = new JPanel();
    private final JPanel westPanel = new JPanel();
    private final JPanel eastPanel = new JPanel();

    public LoginPage() {

        addComponentsToPanel();
        setLayoutManager();
        setLocationAndSize();

        clickLabel.addMouseListener(this);

        /* JFrame methods called */
        setContentPane(mainLogPanel);
        setTitle("Login Form");
        setSize(400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);

    }

    public void setLayoutManager() {

        //set bording page space
        northPanel.setPreferredSize(new Dimension(500, 100));
        southPanel.setPreferredSize(new Dimension(500, 100));
        westPanel.setPreferredSize(new Dimension(50, 400));
        eastPanel.setPreferredSize(new Dimension(50, 400));
    /*
        northPanel.setBackground(Color.GREEN);
        southPanel.setBackground(Color.YELLOW);
        westPanel.setBackground(Color.red);
        eastPanel.setBackground(Color.blue.brighter());
    */
        signupLabel.setFont(new Font("sansSerif", Font.PLAIN, 11));

        clickLabel.setFont(new Font("sansSerif", Font.BOLD, 11));
        clickLabel.setForeground(new Color(0x447dc6));
        clickLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }

    public void setLocationAndSize() {

    }

    /**
     * Imposto tutte le misure per visualizzare correttamente i componenti all'intero della schermata di login
     * utilizzando due GridBagLayout e un BorderLayout
     */
    public void addComponentsToPanel() {

        GridBagConstraints regConstrain = new GridBagConstraints();

        //set sigupLabel position
        regConstrain.gridx = 0;
        regConstrain.gridy = 0;
        regConstrain.weightx = 0.03;
        regConstrain.weighty = 0;
        regConstrain.anchor = GridBagConstraints.LINE_END;
        regConstrain.insets = new Insets(0, 0, 0, 0);

        fullLogPanel.add(signupLabel, regConstrain);

        //set clickLabel position
        regConstrain.gridx = 1;
        regConstrain.gridy = 0;
        regConstrain.weightx = 0.01;
        regConstrain.weighty = 0;
        regConstrain.anchor = GridBagConstraints.LINE_START;
        regConstrain.insets = new Insets(0, 0, 0, 0);

        fullLogPanel.add(clickLabel, regConstrain);

        GridBagConstraints Constrain = new GridBagConstraints();

        //set userLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 0;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullLogPanel.add(userLabel, Constrain);

        //set userTextfield position
        Constrain.gridx = 1;
        Constrain.gridy = 0;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullLogPanel.add(userTextField, Constrain);

        //set passwordLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 1;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullLogPanel.add(passwordLabel, Constrain);

        //set passwordField position
        Constrain.gridx = 1;
        Constrain.gridy = 1;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullLogPanel.add(passwordField, Constrain);

        //set checkbox position
        Constrain.gridx = 1;
        Constrain.gridy = 2;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.01;
        Constrain.gridwidth = 1;
        Constrain.anchor = GridBagConstraints.FIRST_LINE_START;
        Constrain.insets = new Insets(-5, -5, 0, 0);

        fullLogPanel.add(showPassword, Constrain);

        //set regLogPanel position
        Constrain.gridx = 0;
        Constrain.gridy = 3;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.3;
        Constrain.gridwidth = 2;
        Constrain.anchor = GridBagConstraints.PAGE_END;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullLogPanel.add(regLogPanel, Constrain);

        //set LoginButton position
        Constrain.gridx = 0;
        Constrain.gridy = 4;
        Constrain.weightx = 0;
        Constrain.weighty = 0.6;
        Constrain.gridwidth = 2;
        Constrain.anchor = GridBagConstraints.PAGE_START;
        Constrain.insets = new Insets(10, 0, 0, 0);

        fullLogPanel.add(loginButton, Constrain);


        regLogPanel.add(signupLabel);
        regLogPanel.add(clickLabel);

        mainLogPanel.add(fullLogPanel, BorderLayout.CENTER);
        mainLogPanel.add(northPanel, BorderLayout.NORTH);
        mainLogPanel.add(southPanel, BorderLayout.SOUTH);
        mainLogPanel.add(westPanel, BorderLayout.WEST);
        mainLogPanel.add(eastPanel, BorderLayout.EAST);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
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

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }
}
