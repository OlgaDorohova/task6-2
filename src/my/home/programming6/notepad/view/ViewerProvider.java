package my.home.programming6.notepad.view;

public class ViewerProvider {
private static final ViewerProvider instance = new ViewerProvider();

private ViewerProvider() {}

private final Viewer viewer = new NoteViewer();

public static ViewerProvider getInstance() {
	return instance;
}

public Viewer getViewer() {
	return viewer;
}
}
