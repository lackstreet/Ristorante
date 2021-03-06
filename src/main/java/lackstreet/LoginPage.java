package lackstreet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame{

    private final JPanel mainLogPanel = new JPanel(new BorderLayout());
    private final JPanel regLogPanel = new JPanel(new GridBagLayout());
    private final JPanel fullLogPanel = new JPanel(new GridBagLayout());

    private final JLabel userLabel = new JLabel("USERNAME");
    private final JLabel passwordLabel = new JLabel("PASSWORD");
    private final JLabel forgetPswLabel = new JLabel("Password dimenticata?");
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

    private final JFrame mainFrame =new JFrame();




    public LoginPage() {
        super();

        addComponentsToPanel();
        setLayoutManager();

        clickLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                SwingUtilities.invokeLater(RegistrationPage::new);
                mainFrame.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                clickLabel.setText("<html><a href=''>clicca qui</a></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                clickLabel.setText("clicca qui");
            }
        });


        forgetPswLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                SwingUtilities.invokeLater(ForgottenPage::new);
                mainFrame.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                forgetPswLabel.setText("<html><a href=''>Password dimenticata?</a></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                forgetPswLabel.setText("Password dimenticata?");
            }
        });

        showPassword.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('\u2022');
            }
        });

        loginButton.addActionListener(e -> {
            mainFrame.dispose();
            //TODO cambiare la registrationPage con la home del sito
            SwingUtilities.invokeLater(RegistrationPage::new);
        });

        /* JFrame methods called */
        mainFrame.setContentPane(mainLogPanel);
        mainFrame.setTitle("Login Form");
        mainFrame.setSize(400, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);



    }

    /**
     * Funzione per impostare tutta la parte di abbellimento, dai font alle dimensione dei componenti
     */
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

        forgetPswLabel.setFont(new Font("sansSerif", Font.BOLD, 11));
        forgetPswLabel.setForeground(new Color(0x447dc6));
        forgetPswLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }


    /**
     * Imposto tutte le misure per visualizzare correttamente i componenti all'intero della schermata di login
     * utilizzando due GridBagLayout e un BorderLayout
     *
     * Per i GridBagLayout ogni componente che viene aggiunto deve essere accompagnato da un GridBagConstrain in
     * cui si impostano tutti i settaggi che dovr?? rispettare tale componente all'interno della griglia.
     * Noi utilizzeremo un singolo GridBagConstrain che verr?? modificato di volta in volta in base al componente
     * che staremo aggiungendo.
     * Questo per rendere il codice pi?? snello e leggibile anche se bisogna bisogna prestare maggiore attenzione nel
     * controllare che i parametri abbiano i giusti valori. Per ovviare a questa problematica verranno riassegnati tutti
     * i valori dei parametri anche se sono gi?? impostati correttamente
     * @gridx indica la colonna
     * @gridy indica la linea
     * @weightx ?? un valore compreso tra 0 e 1.0 che indica quanto spazio orizzonale deve occupare tale
     * componente in relazione con gli altri (ad esempio la signup label in proporzione occupa tre
     * volte lo spazio di click label a livello di colonne)
     * @weighty stessa cosa di weightx ma riguardo lo spazio verticale
     * @anchor indica il punto in cui deve essere posizionato il componente all'interno della cella in cui
     * ?? contenuto nel caso in cui la sua area di display sia inferiore a quella della cella(es in alto a sinistra, in alto al centro, ecc)
     * @insets modifica, rispetto alla posizione di default, il numero di pixel del bordo. Noi la utilizziamo per
     * distanziare i componenti tra di loro
     */
    public void addComponentsToPanel() {

        GridBagConstraints regConstrain = new GridBagConstraints();

        /**
         * regLogPanel
         */
        //set sigupLabel position
        regConstrain.gridx = 0;
        regConstrain.gridy = 0;
        regConstrain.weightx = 0.03;
        regConstrain.weighty = 0;
        regConstrain.anchor = GridBagConstraints.LINE_END;
        regConstrain.insets = new Insets(0, 0, 0, 3);

        regLogPanel.add(signupLabel, regConstrain);

        //set clickLabel position
        regConstrain.gridx = 1;
        regConstrain.gridy = 0;
        regConstrain.weightx = 0.01;
        regConstrain.weighty = 0;
        regConstrain.anchor = GridBagConstraints.LINE_START;
        regConstrain.insets = new Insets(0, 0, 0, 0);

        regLogPanel.add(clickLabel, regConstrain);

        GridBagConstraints Constrain = new GridBagConstraints();

        /**
         * fullLogPanel
         */

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

        //set forgetPswLabel position
        Constrain.gridx = 1;
        Constrain.gridy = 3;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.01;
        Constrain.gridwidth = 1;
        Constrain.anchor = GridBagConstraints.FIRST_LINE_START;
        Constrain.insets = new Insets(0, 3, 0, 0);

        fullLogPanel.add(forgetPswLabel, Constrain);

        //set regLogPanel position
        Constrain.gridx = 0;
        Constrain.gridy = 4;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.3;
        Constrain.gridwidth = 2;
        Constrain.anchor = GridBagConstraints.PAGE_END;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullLogPanel.add(regLogPanel, Constrain);

        //set LoginButton position
        Constrain.gridx = 0;
        Constrain.gridy = 5;
        Constrain.weightx = 0;
        Constrain.weighty = 0.6;
        Constrain.gridwidth = 2;
        Constrain.anchor = GridBagConstraints.PAGE_START;
        Constrain.insets = new Insets(10, 0, 0, 0);

        fullLogPanel.add(loginButton, Constrain);

        mainLogPanel.add(fullLogPanel, BorderLayout.CENTER);
        mainLogPanel.add(northPanel, BorderLayout.NORTH);
        mainLogPanel.add(southPanel, BorderLayout.SOUTH);
        mainLogPanel.add(westPanel, BorderLayout.WEST);
        mainLogPanel.add(eastPanel, BorderLayout.EAST);

    }
}


