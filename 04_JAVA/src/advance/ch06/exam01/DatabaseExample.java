package advance.ch06.exam01;

public class DatabaseExample {

    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.connect();
        System.out.println("database: " + database.getConnection());
        database.disconnect();

    }

}
