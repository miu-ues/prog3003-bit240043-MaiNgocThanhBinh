package ExOne;

public class bai1 {
   
    static class DatabaseConnection {

        private static DatabaseConnection instance;

        private DatabaseConnection() {
            System.out.println("Database Connected!");
        }

        public static DatabaseConnection getInstance() {
            if (instance == null) {
                instance = new DatabaseConnection();
            }
            return instance;
        }

        public void connect() {
            System.out.println("Using Database Connection...");
        }
    }

    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.connect();
        System.out.println("Same instance? " + (db1 == db2));
    }
}
