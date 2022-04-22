package lackstreet;


public class DbConnectionSettings {


    public void setServer(String server) {
        this.server = server;
    }

    public void setProprieties(String proprieties) {
        this.proprieties = proprieties;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServer() {
        return server;
    }

    public String getProprieties() {
        return proprieties;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    private static String server;
    private static String proprieties;
    private static String user;
    private static String password;


    /**
     * metodo per aggiungere i qoutes alla stringa ottenuta in modo che venga passata all'SQL formattata correttamente
     * @param word stringa da convertire
     * @return ritorna la stringa con i quotes
     */


    public String addQuotes(String word) {
        StringBuilder query = new StringBuilder();
        query.append("'");
        query.append(word);
        query.append("'");
        return query.toString();
    }

}