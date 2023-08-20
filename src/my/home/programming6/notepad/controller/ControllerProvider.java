package my.home.programming6.notepad.controller;

public class ControllerProvider {
private static final ControllerProvider instance = new ControllerProvider();

private ControllerProvider() {}

private final Controller controller = new ControllerImpl();

public static ControllerProvider getInstance() {
	return instance;
}

public Controller getController() {
	return controller;
}
}
