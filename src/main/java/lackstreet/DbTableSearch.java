package lackstreet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class DbTableSearch extends DbConnectionSettings {

    public void dbSearch(String select_This_Column, String from_Table, String whereCondition, String where_IslikeThis) {
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

           if(!resultSet.next()){
               throw new SqlException("Username o password Errati" );
           }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }


}
