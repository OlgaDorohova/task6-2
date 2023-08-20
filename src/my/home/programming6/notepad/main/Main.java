package my.home.programming6.notepad.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import my.home.programming6.notepad.controller.Controller;
import my.home.programming6.notepad.controller.ControllerProvider;

import my.home.programming6.notepad.entity.Note;

import my.home.programming6.notepad.view.Viewer;
import my.home.programming6.notepad.view.ViewerProvider;

/* Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками
в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).
Общие пояснения к практическому заданию.
• В начале работы приложения данные должны считываться из файла, в конце
работы – сохраняться в файл.
• У пользователя должна быть возможность найти запись по любому параметру
или по группе параметров (группу параметров можно определить
самостоятельно), получить требуемые записи в отсортированном виде, найти
записи, текстовое поле которой содержит определенное слово, а также
добавить новую запись.
• Особое условие: поиск, сравнение и валидацию вводимой информации
осуществлять с использованием регулярных выражений.
• Особое условие: проверку введенной информации на валидность должен
осуществлять код, непосредственно добавляющий информацию./*

*/
public class Main {
	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.startMenu();

//	Mock	
		
		/*
		 * ControllerProvider controllerProvider = ControllerProvider.getInstance();
		 * Controller controller = controllerProvider.getController();
		 * 
		 * ViewerProvider viewerProvider = ViewerProvider.getInstance(); Viewer viewer =
		 * viewerProvider.getViewer();
		 * 
		 * String request;

		 * 
		 * Note note = new Note
		 * ("appointment","sadfrt@sdf.com","the dentist appointment in 15=08-23");
		 * request = "addNote" + ":" + Parser.noteInfo(note);
		 * 
		 * viewer.showResult(controller.handle(request)); System.out.println();
		 * 
		 * request = "saveAll: "; viewer.showResult(controller.handle(request));
		 * System.out.println();
		 * 
		 * request = "findByParam:" + "birthday";
		 * viewer.showResult(controller.handle(request)); System.out.println();
		 * 
		 * request = "findByMess:" + "appointment";
		 * viewer.showResult(controller.handle(request)); System.out.println();
		 * 
		 * request = "findBetweenDates:"+"birthday,01-01-2010,01-01-2022";
		 * viewer.showResult(controller.handle(request)); System.out.println();
		 * 
		 * request = "showAll: "; viewer.showResult(controller.handle(request));
		 * System.out.println();
		 * 
		 */
		
		
//		Mock for empty note list
		/*
		 * List<Note> notes = new ArrayList<>( Arrays.asList(new Note("date",
		 * "asdf@fsdsf.com", "date with Jane at 8p.m 10-02-2023"), new Note("date",
		 * "asdf@fsdsf.com", "date with Maria at 6p.m 18-04-2023"), new Note("birthday",
		 * "asdf@fsdsf.com", "sister's birthday; 19-05-2016"), new Note("birthday",
		 * "asdf@fsdsf.com", "grandma's birthday;13-08-1947"), new Note("birthday",
		 * "asdf@fsdsf.com", "Maria's birthday;22-05-2000"), new Note("appointment",
		 * "sadfrt@sdf.com", "the dentist appointment in 15-09-23")));
		 */

		/*
		 * 
		 * for (Note note : notes) {
		 * 
		 * request = "addNote" + ":" + Parser.noteInfo(note);
		 * viewer.showResult(controller.handle(request)); }
		 * 
		 */

	}

}
