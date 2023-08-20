package my.home.programming6.notepad.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

import my.home.programming6.notepad.controller.Controller;

import my.home.programming6.notepad.view.Viewer;
import my.home.programming6.notepad.view.ViewerProvider;
import my.home.programming6.notepad.controller.ControllerProvider;

public class Menu {
	@SuppressWarnings("resource")
	public void startMenu() {
		Scanner scanner = new Scanner(System.in);
		String input = "";

		ControllerProvider controllerProvider = ControllerProvider.getInstance();
		Controller controller = controllerProvider.getController();

		ViewerProvider viewerProvider = ViewerProvider.getInstance();
		Viewer viewer = viewerProvider.getViewer();

		String request, result;

		do {

			System.out.println("Choose the one:\n" + "1 - add a note;\n" + "2 - find a note\n" + "3 - show all notes\n"
					+ "q - exit\n" + ">>");

			input = scanner.nextLine();

			switch (input) {

			case "1": {
				request = "addNote:" + readNote();
				result = controller.handle(request);
				viewer.showResult(result);
				break;
			}

			case "2": {
				System.out.println("select search option:\n" + "1 - find note by parameter\n"
						+ "2 - find note by word in message\n" + "3 - find all notes between dates \n> >");
				input = scanner.nextLine();
				switch (input) {

				case "1": {
					System.out.println("what to look for\n>>");
					input = scanner.nextLine();
					request = "findByParam:" + input;
					result = controller.handle(request);
					viewer.showResult(result);
					break;

				}

				case "2": {
					System.out.println("what word to look for\n>>");
					input = scanner.nextLine();
					request = "findByMess:" + input;
					result = controller.handle(request);
					viewer.showResult(result);
					break;

				}

				case "3": {
					System.out.println("what to look for\n>>");
					input = scanner.nextLine();
					request = "findBetweenDates:" + input;

					System.out.println("enter start date");
					request += "," + validateDate();

					System.out.println("enter end date");
					request += "," + validateDate();

					result = controller.handle(request);
					viewer.showResult(result);
					break;

				}

				default:
					System.out.println("unknown choice");
				}
				break;
			}

			case "3": {
				request = "showAll:" + "null";
				result = controller.handle(request);
				viewer.showResult(result);
				break;
			}

			case "q": {
				request = "saveAll:" + "user";
				System.out.println(controller.handle(request));
				break;
			}
			default:
				System.out.println("unknown choice");
			}

		} while (!input.equals("q"));

	}

	public String readNote() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String noteString = "topic=" + "\"";

		System.out.println("enter the topic\n>>");

		noteString += scanner.nextLine() + "\"";
		noteString += ",email=" + "\"";

		noteString += validateEmail() + "\"";
		noteString += ",message=" + "\"";

		System.out.println("enter the message\n>>");

		noteString += scanner.nextLine() + "\"";

		return noteString;
	}

	public String validateEmail() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String inputString = "";
		String pattern = "[a-zA-z0-9]+@[a-zA-Z]+\\.[a-z]+";
		while (!Pattern.matches(pattern, inputString)) {
			System.out.println("enter the email\n>>");
			inputString = scanner.nextLine();

		}

		return inputString;
	}

	public String validateDate() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		boolean isValidDate = false;

		while (!isValidDate) {
			try {
				LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				isValidDate = true;
			} catch (Exception e) {
				System.out.println("Wrong date format! Try \"dd-mm-yyyy\" format\n>>");
				input = scanner.nextLine();

			}

		}

		return input;
	}
}
