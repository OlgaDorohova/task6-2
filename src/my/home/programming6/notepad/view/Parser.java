package my.home.programming6.notepad.view;

import java.time.LocalDate;

import my.home.programming6.notepad.entity.Note;

public class Parser {
	public static Note parseNoteInfo(String noteString) {
	
		Note note = new Note();
		String[] noteParams = noteString.split("\";");
		for (String str : noteParams) {
			
			
			String[] temp = str.split("=\"");

			if (str.contains("topic=")) {
				note.setTopic(temp[1]);
				
			}
			if (str.contains("date=")) {
				if(!str.contains("null")) {
					note.setDate(LocalDate.parse(temp[1]));
				}
			}

			if (str.contains("email=")) {
				note.setEmail(temp[1]);
			}

			if (str.contains("message=")) {
				note.setMessage(temp[1].replace("\"", ""));
			}

		}
		return note;
	}
	
	

//	topic="topic",date="date",email="email"message=";
	public static String noteInfo(Note note) {
		String result;
		result = "topic=" +"\""+ note.getTopic() +"\""+ ";date=" +"\""+ note.getDate() + "\""+";email=" +"\""+ note.getEmail() +"\""+ ";message="
				+"\""+ note.getMessage()+"\"";
		return result;
	}

}
