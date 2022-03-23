package singleton;

public class DbConnection {
	
	private static final DbConnection dbConInstance = new DbConnection();
	
	private DbConnection() {}
	
	public static synchronized DbConnection getInstance() {
		return DbConnection.dbConInstance;
	}
}
