package lackstreet;

import javax.swing.*;
import java.awt.*;

public class RegistrationPage extends JFrame {

    private final JPanel mainRegPanel = new JPanel(new BorderLayout());
    private final JPanel fullRegPanel = new JPanel(new GridBagLayout());

    //empty panel to spacing and centering log option
    private final JPanel northPanel = new JPanel();
    private final JPanel southPanel = new JPanel();
    private final JPanel westPanel = new JPanel();
    private final JPanel eastPanel = new JPanel();

    private final JLabel firstNameLabel = new JLabel("first name");
    private final JLabel lastNameLabel = new JLabel("Last name");
    private final JLabel usernameLabel = new JLabel("Username");
    private final JLabel mailLabel = new JLabel("E-mail");
    private final JLabel phoneLabel = new JLabel("Phone number");
    private final JLabel passwordLabel = new JLabel("Password");
    private final JLabel confPasswordLabel = new JLabel("Confirm");
    private final JLabel addressLabel= new JLabel("Address");
    private final JLabel dateLabel = new JLabel("Birth Date");

    private final JTextField firstNameTextField = new JTextField(20);
    private final JTextField lastNameTextField = new JTextField(20);
    private final JTextField usernameTextField = new JTextField(20);
    private final JTextField mailTextField = new JTextField(20);
    private final JTextField phoneTextField = new JTextField(20);
    private final JTextField addressTextField= new JTextField(20);

    private final JPasswordField passwordTextField = new JPasswordField(20);
    private final JPasswordField confPasswordTextField = new JPasswordField(20);

    private final JButton submitButton = new JButton("Submit");

    private final String[] days
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };

    private final String[] months
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };

    private final String[] years
            = {"1959", "1960", "1961", "1962",
            "1963", "1964", "1965", "1966",
            "1967", "1968", "1969", "1970",
            "1971", "1972", "1973", "1974",
            "1975", "1976", "1977", "1978",
            "1979", "1980", "1981", "1982",
            "1983", "1984", "1985", "1986",
            "1987", "1988", "1989", "1990",
            "1991", "1992", "1993", "1994",
            "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    private final JComboBox<String> dayComboBox = new JComboBox<>(days);
    private final JComboBox<String> monthComboBox = new JComboBox<>(months);
    private final JComboBox<String> yearComboBox = new JComboBox<>(years);

    public RegistrationPage() {
        super();
        
        addComponentsToPanel();
        setLayoutManager();

        /* JFrame methods called */
        setContentPane(mainRegPanel);
        setTitle("Registration Form");
        setSize(460, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        
    }

    private void setLayoutManager() {
        //set bording page space
        northPanel.setPreferredSize(new Dimension(500, 100));
        southPanel.setPreferredSize(new Dimension(500, 100));
        westPanel.setPreferredSize(new Dimension(50, 500));
        eastPanel.setPreferredSize(new Dimension(50, 500));

        /*
        northPanel.setBackground(Color.GREEN);
        southPanel.setBackground(Color.YELLOW);
        westPanel.setBackground(Color.red);
        eastPanel.setBackground(Color.blue.brighter());
        */

        firstNameLabel.setFont(new Font("default", Font.BOLD, 12));
        lastNameLabel.setFont(new Font("default", Font.BOLD, 12));
        usernameLabel.setFont(new Font("default", Font.BOLD, 12));
        mailLabel.setFont(new Font("default", Font.BOLD, 12));
        phoneLabel.setFont(new Font("default", Font.BOLD, 12));
        passwordLabel.setFont(new Font("default", Font.BOLD, 12));
        confPasswordLabel.setFont(new Font("default", Font.BOLD, 12));
        addressLabel.setFont(new Font("default", Font.BOLD, 12));
        dateLabel.setFont(new Font("default", Font.BOLD, 12));
    }

    private void addComponentsToPanel() {
        GridBagConstraints Constrain = new GridBagConstraints();

        //set firstNameLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 0;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(firstNameLabel, Constrain);

        //set firstNameTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 0;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.gridwidth = 3;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(firstNameTextField, Constrain);

        //set lastNameLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 1;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(lastNameLabel, Constrain);

        //set lastNameTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 1;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.gridwidth = 3;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(lastNameTextField, Constrain);

        //set usernameLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 2;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(usernameLabel, Constrain);

        //set usernameTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 2;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.gridwidth = 3;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(usernameTextField, Constrain);

        //set mailLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 3;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(mailLabel, Constrain);

        //set mailTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 3;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.gridwidth = 3;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(mailTextField, Constrain);

        //set phoneLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 4;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(phoneLabel, Constrain);

        //set phoneTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 4;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.gridwidth = 3;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(phoneTextField, Constrain);

        //set dateLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 5;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(dateLabel, Constrain);

        //set dayComboBox position
        Constrain.gridx = 1;
        Constrain.gridy = 5;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(dayComboBox, Constrain);

        //set monthComboBox position
        Constrain.gridx = 2;
        Constrain.gridy = 5;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(monthComboBox, Constrain);

        //set yearComboBox position
        Constrain.gridx = 3;
        Constrain.gridy = 5;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(yearComboBox, Constrain);

        //set addressLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 6;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(addressLabel, Constrain);

        //set addressTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 6;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.gridwidth = 3;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(addressTextField, Constrain);

        //set passwordLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 7;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(passwordLabel, Constrain);

        //set passwordTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 7;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.gridwidth = 3;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(passwordTextField, Constrain);

        //set confPasswordLabel position
        Constrain.gridx = 0;
        Constrain.gridy = 8;
        Constrain.weightx = 0.01;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_END;
        Constrain.gridwidth = 1;
        Constrain.insets = new Insets(0, 0, 0, 5);

        fullRegPanel.add(confPasswordLabel, Constrain);

        //set confPasswordTextField position
        Constrain.gridx = 1;
        Constrain.gridy = 8;
        Constrain.weightx = 0.02;
        Constrain.weighty = 0.05;
        Constrain.anchor = GridBagConstraints.LINE_START;
        Constrain.gridwidth = 3;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(confPasswordTextField, Constrain);

        //set submitButton position
        Constrain.gridx = 0;
        Constrain.gridy = 9;
        Constrain.weightx = 0;
        Constrain.weighty = 0.6;
        Constrain.gridwidth = 4;
        Constrain.anchor = GridBagConstraints.CENTER;
        Constrain.ipadx = 10;
        Constrain.ipady = 10;
        Constrain.insets = new Insets(0, 0, 0, 0);

        fullRegPanel.add(submitButton, Constrain);



        mainRegPanel.add(fullRegPanel, BorderLayout.CENTER);
        mainRegPanel.add(northPanel, BorderLayout.NORTH);
        mainRegPanel.add(southPanel, BorderLayout.SOUTH);
        mainRegPanel.add(westPanel, BorderLayout.WEST);
        mainRegPanel.add(eastPanel, BorderLayout.EAST);

    }
}
