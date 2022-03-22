package lackstreet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
        username = addQuotes(username);
        password = addQuotes(password);
        //System.out.println("con apici "+username+" "+password); -->TEST

        if (((dbSearch("username", "login", "username", username)) && (dbSearch("password", "login", "password", password))) == true) {
            System.out.println("LOGIN OK");
        } else {
            System.out.println("LOGIN FAIL");
        }
    }
}
