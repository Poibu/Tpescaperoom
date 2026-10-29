class Database {
    private static Database instance;
    private String name;

    private Database(String name) {
        this.name = name;
    }

    public static Database getInstance(String name) {
        if (instance == null) {
            instance = new Database(name);
        }
        return instance;
    }

    public void getConnection() {
        System.out.println("You are connected to the database " + name);
    }
}

public class database {
    public static void main(String[] args) {
        Database db1 = Database.getInstance("MySQL");
        Database db2 = Database.getInstance("Oracle");

        db1.getConnection();
        db2.getConnection();

        System.out.println("Same instance? " + (db1 == db2));
    }
}