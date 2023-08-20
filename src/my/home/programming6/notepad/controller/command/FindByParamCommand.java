package my.home.programming6.notepad.controller.command;

import java.util.List;

import my.home.programming6.notepad.entity.Note;
import my.home.programming6.notepad.service.NoteService;
import my.home.programming6.notepad.service.NoteServiceProvider;

public class FindByParamCommand implements Command {

	@Override
	public String execute(String request) {
		NoteServiceProvider provider = NoteServiceProvider.getInstance();
		NoteService service = provider.getNoteService();
		
		List<Note> notes;
		
		try {
			notes = service.findByParameter(request);
			
			if(!notes.isEmpty()) {
				return "0" + ":" + notes;
			}
		} catch (Exception e) {
			return "2";
		}
		return "1";
		
//		add the ability to search by multiply parameters
	}

}
