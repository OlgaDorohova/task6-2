package my.home.programming6.notepad.controller.command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
Map<String, Command > commands = new HashMap<>();

public CommandProvider() {
	
	commands.put("addNote", new AddNoteCommand());
	commands.put("findByParam", new FindByParamCommand());
	commands.put("findByMess", new FindByMessageCommand());
	commands.put("findBetweenDates", new FindBetweenDatesCommand());
	commands.put("saveAll", new SaveAllCommand());
	commands.put("showAll", new ShowAllCommand());
}

public Command getCommand(String comName) {
	return commands.get(comName);
}
}
