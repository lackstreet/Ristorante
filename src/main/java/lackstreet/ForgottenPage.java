package lackstreet;

import javax.swing.*;

/**
 * Pagina che si apre se l'utente ha dimenticato la password.
 * Viene chiesta la mail con cui l'utente si è registrato in precedenza e quando cliccherà il bottone appositivo,
 * verrà inviata una mail all'utente con la password che precedentemente aveva inserito.
 */

public class ForgottenPage extends JFrame {

    private final JLabel mailLabel = new JLabel("E-mail");
    private final JTextField mailTextField = new JTextField(20);


}
