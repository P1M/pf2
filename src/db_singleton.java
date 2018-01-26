public class db_singleton {
    private static db_singleton ourInstance = new db_singleton();

    public static db_singleton getInstance() {
        return ourInstance;
    }

    private db_singleton() {
    }
}
