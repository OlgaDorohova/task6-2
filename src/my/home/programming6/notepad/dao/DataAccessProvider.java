package my.home.programming6.notepad.dao;

public class DataAccessProvider {
private static final DataAccessProvider instance = new DataAccessProvider();

private DataAccessProvider() {}

private final DataAccess access = new DataAccessImpl();

public static DataAccessProvider getInstance() {
	return instance;
}

public DataAccess getDataAccess() {
	return access;
}
}
