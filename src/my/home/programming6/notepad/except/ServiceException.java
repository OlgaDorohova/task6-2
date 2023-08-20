package my.home.programming6.notepad.except;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -9184134453987098765L;


	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Exception cause) {
		super(cause);
	}

	public ServiceException(String message, Exception cause) {
		super(message, cause);
	}

}
