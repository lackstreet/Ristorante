package lackstreet;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //new login page
        SwingUtilities.invokeLater(LoginPage::new);

        Db_connection_setting start = new Db_connection_setting();

        start.setServer("jdbc:sqlserver://DAVIDE-PC\\SQLEXPRESS;");
        start.setProprieties("database=db_rst;encrypt=false;loginTimeout=10;");
        start.setUser("guest");
        start.setPassword("guest");

        Db_requestGet query = new Db_requestGet();
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci username: ");
        String username = sc.nextLine();
        System.out.print("Inserisci password: ");
        String password = sc.nextLine();
        query.chk_login(username, password);


    }
}
