package my.home.programming6.notepad.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteViewer implements Viewer {

	@Override
	public void showResult(String result) {
		String params[] = result.split(":");

		switch (params[0]) {
		case "0": {
			if (params.length > 1) {
				Pattern pattern = Pattern.compile("\\[.+\\]");
				Matcher matcher = pattern.matcher(params[1]);

				while (matcher.find()) {
					String patString = params[1].substring(matcher.start() + 1, matcher.end() - 1);
					System.out.println(showNoteString(patString.replace("]", "").replace("[", "")));
				}
			} else {
				System.out.println("done");
			}

			break;
		}
		case "1": {

			System.out.println("There is any note");
			break;
		}
		case "2": {

			System.out.println("Error");
			break;
		}
		default:
			System.out.println("something was wrong");
//			throw new IllegalArgumentException("Unexpected value: " + params[0]);
		}

	}

	public String showNoteString(String string) {
		String noteString = "";
		for (String s : string.split("Note")) {

			for (String ss : s.split(",")) {

				if (!ss.isBlank()) {
					noteString += ss.split("=")[1] + "\n";
				}
			}

			noteString += "\n";

		}

		return noteString;
	}

}
