package advance.ch06.exam01;

public class Database {
    private String connection = "MySQL";

    //private으로 생성자를 선언하여 외부에서 객체 생성을 막는다.
    private static Database instance = new Database();

    private Database() {
        System.out.println("Database instance created.");
    }

    public static Database getInstance() {
        return instance;
    }

    public String connect() {
        System.out.println("Connecting to " + connection);
        return connection;
    }

    public void disconnect() {
        System.out.println("Disconnecting from " + connection);
    }

    public String getConnection() {
        return connection;
    }

}
