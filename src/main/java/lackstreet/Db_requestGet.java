package lackstreet;

import java.sql.*;
import java.util.Scanner;

public class Db_requestGet extends Db_connection_setting {


    public boolean dbSearch(String select_This_Column, String from_Table, String whereCondition, String where_IslikeThis) {
        ResultSet resultSet = null; //prova connesione

        try {
            //task SQL-->per driver
            Connection connection = DriverManager.getConnection(getServer() + getProprieties(), getUser(), getPassword());

            Statement statement = connection.createStatement();

            // Create and execute a SELECT SQL statement.
            String query = new String();
            query = ("Select" + " " + select_This_Column + " " + "from" + " " + from_Table + " " + "where" + " " + whereCondition + " " + "like" + " " + where_IslikeThis);
            resultSet = statement.executeQuery(query);

            // Print results from select statement

            while (resultSet.next()) {
                //System.out.println(resultSet.getString(1));  -->TEST
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }


    public String addQuotes(String word) {
        StringBuilder query = new StringBuilder();
        query.append("'");
        query.append(word);
        query.append("'");
        return query.toString();
    }


    public void chk_login(String username, String password) {
        int i=0;
        String chat;
       while(true) {
           i++;
        username = addQuotes(username);
        password = addQuotes(password);
        //System.out.println("con apici "+username+" "+password); -->TEST

            if (((dbSearch("username", "login", "username", username)) && (dbSearch("password", "login", "password", password))) == true) {
                System.out.println("LOGIN OK");
                return;
            } else {
                if(i>0) {
                    System.out.println("username o password errati ritenta");
                }else{
                    System.out.println("Benvenuto, inserisci la username e la password appena creata");
                    i=1;  //TEST
                }
                Scanner sc=new Scanner(System.in);
                System.out.print("Inserisci username: ");
                username = sc.nextLine();
                System.out.print("Inserisci password: ");
                password = sc.nextLine();

                if((i%2==0)&& (i>0)){
                    System.out.println("Vuoi registrarti?(yes or no)");
                    chat= sc.nextLine();
                    if(chat.startsWith("y")){
                        Db_requestSet registration=new Db_requestSet();
                        System.out.println("Inserisci nome: ");
                        registration.setName(sc.nextLine());
                        System.out.println("Inserisci cognome: ");
                        registration.setSurname(sc.nextLine());
                        System.out.println("Inserisci username: ");
                        registration.setUsername(sc.nextLine());
                        System.out.println("Inserisci password: ");
                        registration.setPassword(sc.nextLine());
                        System.out.println("Conferma password: ");
                        registration.setConferm_psw(sc.nextLine());




                        if (registration.newUser()== true) {
                            i=-2;
                        }
                    }else{
                        System.out.println("Hai dimenticato username o password?");
                        chat=sc.nextLine();
                        if(chat.startsWith("y")){
                            System.out.println("vuoi recuperare l'username?");
                            chat=sc.nextLine();
                            if(chat.startsWith("y")){
                                System.out.println("Inserisci la tua mail:");
                                chat=sc.nextLine();
                                METODO_VERIFICA_MAIL_DA CREARE;
                                VERIFICA MAIL NEL REGISTRO DATABASE SE NON PRESENTE ERRORE
                            }
                        }
                    }
                }
            }
        }
    }
}
