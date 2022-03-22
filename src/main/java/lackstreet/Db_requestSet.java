package lackstreet;

public class Db_requestSet {

    public  void setName(String name) {
        Db_requestSet.name = name;
    }

    public void setSurname(String surname) {
        Db_requestSet.surname = surname;
    }

    public void setUsername(String username) {
        Db_requestSet.username = username;
    }

    public void setPassword(String password) {
        Db_requestSet.password = password;
    }

    public void setConferm_psw(String conferm_psw) {
        Db_requestSet.conferm_psw = conferm_psw;
    }

    private static String name;
    private static String surname;
    private static String username;
    private static String password;
    private static String conferm_psw;

    public boolean newUser() {
        if(!password.contentEquals(conferm_psw)) {
            System.out.println("le due password non concidono");
            return false;
        }
        if(password.length()<6){
            System.out.println("Password troppo corta");
            return false;
        }
        if(password.contentEquals(name)){
            System.out.println("La password deve essere diversa dal nome");
        }
        return true;
    }


}
