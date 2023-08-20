package my.home.programming6.notepad.controller.command;

import my.home.programming6.notepad.service.NoteService;
import my.home.programming6.notepad.service.NoteServiceProvider;
import my.home.programming6.notepad.view.Parser;

public class AddNoteCommand implements Command {

	@Override
	public String execute(String request) {
		NoteServiceProvider provider = NoteServiceProvider.getInstance();
		NoteService service = provider.getNoteService();

		try {
			service.addNote(Parser.parseNoteInfo(request));
		} catch (Exception e) {
			return "2" + e;
		}
		return "0";
	}

}
