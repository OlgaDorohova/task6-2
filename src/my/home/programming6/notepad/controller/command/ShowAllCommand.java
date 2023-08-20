package my.home.programming6.notepad.controller.command;

import java.util.List;

import my.home.programming6.notepad.entity.Note;
import my.home.programming6.notepad.service.NoteService;
import my.home.programming6.notepad.service.NoteServiceProvider;

public class ShowAllCommand implements Command {

	@Override
	public String execute(String request) {
		NoteServiceProvider provider = NoteServiceProvider.getInstance();
		NoteService service = provider.getNoteService();
		StringBuffer notesString = new StringBuffer();
		try {
		
			List<Note> notes = service.getAll();
			
			if(notes !=  null) {
				for(Note note: notes) {
					notesString.append(note +"\n");
				}
				
				return "0:"+notesString;
			}
			
			return "1";
		
		} catch (Exception e) {
			return "2";
		}
		
	}

}
