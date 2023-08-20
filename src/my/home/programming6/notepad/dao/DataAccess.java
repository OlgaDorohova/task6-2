package my.home.programming6.notepad.dao;

import java.util.List;

import my.home.programming6.notepad.entity.Note;
import my.home.programming6.notepad.except.daoException;

public interface DataAccess {
	public List<Note> getAll() throws daoException;

	public boolean saveAll(List<Note> notes) throws daoException;
}
