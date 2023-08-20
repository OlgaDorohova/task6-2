package my.home.programming6.notepad.except;

public class daoException extends Exception {

	private static final long serialVersionUID = 3340013070807090094L;

public daoException() {
	super();
}

public daoException(String message) {
	super(message);
}

public daoException(Exception cause) {
	super(cause);
}

public daoException(String message, Exception cause) {
	super(message, cause);
}


}
