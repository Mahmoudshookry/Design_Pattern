package singleton;

public class Main {

	public static void main(String[] args) {
		
		DbConnection dbCon1 = DbConnection.getInstance();
		
		DbConnection dbCon2 = DbConnection.getInstance();
		
		DbConnection dbCon3 = DbConnection.getInstance();
		DbConnection dbCon4 = DbConnection.getInstance();

	}

}
