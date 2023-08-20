package my.home.programming6.notepad.controller.command;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import my.home.programming6.notepad.entity.Note;
import my.home.programming6.notepad.service.NoteService;
import my.home.programming6.notepad.service.NoteServiceProvider;

public class FindBetweenDatesCommand implements Command {

	// request = paramName,date1,date2
	@Override
	public String execute(String request) {
		NoteServiceProvider provider = NoteServiceProvider.getInstance();
		NoteService service = provider.getNoteService();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String[] params = request.split(",");
		String paramName = params[0];
		LocalDate date1 = LocalDate.parse(params[1], formatter);
		LocalDate date2 = LocalDate.parse(params[2],formatter);

		List<Note> notes;

		try {
			notes = service.findBetweenDates(paramName, date1, date2);

			if (!notes.isEmpty()) {
				return "0" + ":" + notes;
			}
		} catch (Exception e) {
			return "2";
		}
		return "1";

	}

}
