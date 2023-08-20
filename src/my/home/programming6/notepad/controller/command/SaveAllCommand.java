package my.home.programming6.notepad.controller.command;

import my.home.programming6.notepad.except.ServiceException;
import my.home.programming6.notepad.service.NoteService;
import my.home.programming6.notepad.service.NoteServiceProvider;

public class SaveAllCommand implements Command {

	@Override
	public String execute(String request) {
		NoteServiceProvider provider = NoteServiceProvider.getInstance();
		NoteService service = provider.getNoteService();
		
		try {
			service.saveAll();
			return "0";
		} catch (ServiceException e) {
			return "2";
		}
	}

}
