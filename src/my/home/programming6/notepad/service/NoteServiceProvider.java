package my.home.programming6.notepad.service;

public class NoteServiceProvider{
private static final NoteServiceProvider instance = new NoteServiceProvider();

private final NoteService noteService = new NoteServiceImpl();


private NoteServiceProvider() {}

public static NoteServiceProvider getInstance() {
	return instance;
}

public NoteService getNoteService() {
	return noteService;
}
}
