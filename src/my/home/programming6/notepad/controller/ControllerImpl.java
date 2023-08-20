package my.home.programming6.notepad.controller;

import my.home.programming6.notepad.controller.command.Command;
import my.home.programming6.notepad.controller.command.CommandProvider;

public class ControllerImpl implements Controller{

	@Override
	public String handle(String request) {
		CommandProvider provider = new CommandProvider();
		String parameters [] =request.split(":");
		Command command = provider.getCommand(parameters[0]);
		 
		
		String result = command.execute(parameters[1]);
		
		return result;
	}

}
