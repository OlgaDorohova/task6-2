package my.home.programming6.notepad.service;

import java.time.LocalDate;
import java.util.List;

import my.home.programming6.notepad.entity.Note;
import my.home.programming6.notepad.except.ServiceException;

public interface NoteService{
	public List<Note> getAll() throws ServiceException;

	public boolean saveAll() throws ServiceException;

	public boolean addNote(Note note);

	public List<Note> findByParameter(String parameter);

	public List<Note> findByMessage(String word);
	
	public List<Note> findBetweenDates(String parameter, LocalDate beginDate, LocalDate finshDate);

}
