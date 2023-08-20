package my.home.programming6.notepad.controller.command;

import java.util.List;

import my.home.programming6.notepad.entity.Note;
import my.home.programming6.notepad.service.NoteService;
import my.home.programming6.notepad.service.NoteServiceProvider;

public class FindByMessageCommand implements Command {

	@Override
	public String execute(String request) {
		NoteServiceProvider provider = NoteServiceProvider.getInstance();
		NoteService service = provider.getNoteService();
		StringBuffer notesResult = new StringBuffer();

		List<Note> notes;
		try {
			notes = (service.findByMessage(request));

			if (notes.isEmpty()) {
				return "1";
			}

			for (Note note : notes) {
				notesResult.append(note);
			}
		} catch (Exception e) {
			return "2" + ":" + e;
		}
		return "0" + ":" + notesResult;
	}

}
