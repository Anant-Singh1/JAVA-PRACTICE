interface DataBaseOperations {// internally-->abstract interface DataBaseOperations
    int MAX_CONNECTIONS = 20;// public static int final MAX_CONNECTIONS=20

    boolean isOpen();// internally-->public abstract boolean isOpen()

    int add(int id, String name, double salary);// internally-->public abstract int add(int id, String name, double
                                                // salary);
}

/*
 * The concept of overriding every method in interface dec. the flexiblity so
 * atmost what we can do is a partial implementation
 */
// Partial Implementation
class DB implements DataBaseOperations {

    @Override
    public boolean isOpen() {
        // TODO Auto-generated method stub
        return true;
        // throw new UnsupportedOperationException("Unimplemented method 'isOpen'");
    }

    @Override
    public int add(int id, String name, double salary) {
        System.out.println("DB Connection is Open");
        // TODO Auto-generated method stub
        return 1;

        // throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}

class OracleDatabase extends DB {

    @Override
    public int add(int id, String name, double salary) {
        System.out.println("Adding into OracleDB...");
        return 1;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}

class MongoDB implements DataBaseOperations {

    @Override
    public boolean isOpen() {
        System.out.println("MongoDB is Open...");

        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int add(int id, String name, double salary) {
        System.out.println("Adding into MongoDB...");
        // TODO Auto-generated method stub
        return 3;

    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        OracleDatabase odb = new OracleDatabase();
        odb.isOpen();
    }
}
