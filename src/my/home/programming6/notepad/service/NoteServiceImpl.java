package my.home.programming6.notepad.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import my.home.programming6.notepad.dao.DataAccess;
import my.home.programming6.notepad.dao.DataAccessProvider;
import my.home.programming6.notepad.entity.Note;
import my.home.programming6.notepad.except.ServiceException;
import my.home.programming6.notepad.service.comparator.ComparatorByDate;
import my.home.programming6.notepad.service.comparator.ComparatorByTopic;

public class NoteServiceImpl implements NoteService {
	private DataAccessProvider provider = DataAccessProvider.getInstance();
	private DataAccess access = provider.getDataAccess();

	
	private List<Note> notes = null;
	
	{
		try {
			this.notes = getAll();
		} catch (ServiceException e) {
			
		}
	
	}
	
	
	@Override
	public List<Note> getAll() throws ServiceException {
		List <Note> noteList;
		try {
		noteList =	access.getAll();
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		return  (noteList.isEmpty()) ? new ArrayList<Note>() : noteList;
	}

	@Override
	public boolean saveAll() throws ServiceException{
		try {
			access.saveAll(this.notes);
			return true;
		}
		catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean addNote(Note note) {
		if(note == null) {
			return false;
		}
	notes.add(note);
		return true;
	}

	@Override
	public List<Note> findByParameter(String parameter) {
		Pattern pattern = Pattern.compile(parameter);
		List<Note> matchList = new ArrayList<>();
	
		for(Note note: notes) {
			if(pattern.matcher(note.toString()).find()) {
				matchList.add(note); 
			}
		}
		
		Collections.sort(matchList, new ComparatorByDate());		
		
		return matchList;
	}

	@Override
	public List<Note> findByMessage(String word) {
		Pattern pattern = Pattern.compile(word);
		List<Note> matchList = new ArrayList<>();
		
		for(Note note: notes) {
			if(pattern.matcher(note.getMessage()).find()) {
				matchList.add(note);
			}
		}
		
		Collections.sort(matchList, new ComparatorByTopic());
		return matchList;
	}

	@Override
	public List<Note> findBetweenDates(String parameter, LocalDate beginDate, LocalDate finshDate) {
		List<Note> matchList = new ArrayList<>();
		List<Note> tempList = findByParameter(parameter);
		
		for(int i = 0; i < tempList.size(); i++) {
			Note note = tempList.get(i);
			if(note.getDate().compareTo(beginDate) >=0 && note.getDate().compareTo(finshDate) <=0) {
				matchList.add(note);
			}
		}
		
		Collections.sort(matchList,new ComparatorByDate());
		
		return matchList;
	}

}
