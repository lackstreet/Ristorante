package lackstreet;

import javax.swing.*;
import java.awt.*;

/**
 * Pagina che si apre se l'utente ha dimenticato la password.
 * Viene chiesta la mail con cui l'utente si è registrato in precedenza e quando cliccherà il bottone appositivo,
 * verrà inviata una mail all'utente con la password che precedentemente aveva inserito.
 */

public class ForgottenPage extends JFrame {

    private final JLabel msgLabel = new JLabel("Inserisci l'E-mail a cui ricevere la tua password");
    private final JLabel mailLabel = new JLabel("E-mail");
    private final JTextField mailTextField = new JTextField(20);
    private final JButton SubmitButton = new JButton("Submit");

    private final JPanel mainPanel = new JPanel(new BorderLayout());
    private final JPanel mailPanel = new JPanel(new GridBagLayout());

    //empty panel to spacing and centering log option
    private final JPanel northPanel = new JPanel();
    private final JPanel southPanel = new JPanel();
    private final JPanel westPanel = new JPanel();
    private final JPanel eastPanel = new JPanel();

    private final JFrame mainFrame =new JFrame();

    public ForgottenPage(){
        super();

        addComponentToPanel();

        /* JFrame methods called */
        mainFrame.setContentPane(mainPanel);
        mainFrame.setTitle("Forgotten Password Form");
        mainFrame.setSize(400, 200);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

    public void addComponentToPanel(){

        GridBagConstraints Constrain = new GridBagConstraints();

        //set msgLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 0;
        Constrain.weightx = 0.03;
        Constrain.weighty = 0.02;
        Constrain.gridwidth = 2;
        Constrain.anchor = GridBagConstraints.CENTER;
        Constrain.insets = new Insets(0, 0, 5, 0);

        mailPanel.add(msgLabel, Constrain);

        //set mailLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 1;
        Constrain.weightx = 0.03;
        Constrain.weighty = 0.01;
        Constrain.gridwidth = 1;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.insets = new Insets(0, 0, 0, 3);

        mailPanel.add(mailLabel, Constrain);

        //set mailTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 1;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.01;
        Constrain.gridwidth = 1;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.insets = new Insets(0, 0, 0, 0);

        mailPanel.add(mailTextField, Constrain);

        //set SubmitButton position
        Constrain.gridx = 0;
        Constrain.gridy = 2;
        Constrain.weightx = 0.03;
        Constrain.weighty = 0.02;
        Constrain.gridwidth = 2;
        Constrain.anchor = GridBagConstraints.CENTER;
        Constrain.insets = new Insets(5, 0, 0, 0);

        mailPanel.add(SubmitButton, Constrain);

        northPanel.setPreferredSize(new Dimension(400, 40));
        southPanel.setPreferredSize(new Dimension(400, 40));
        westPanel.setPreferredSize(new Dimension(50, 150));
        eastPanel.setPreferredSize(new Dimension(50, 150));

        mainPanel.add(mailPanel, BorderLayout.CENTER);
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        mainPanel.add(westPanel, BorderLayout.WEST);
        mainPanel.add(eastPanel, BorderLayout.EAST);


    }
}
