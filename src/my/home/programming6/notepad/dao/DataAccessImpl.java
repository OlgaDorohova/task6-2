package my.home.programming6.notepad.dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import my.home.programming6.notepad.entity.Note;
import my.home.programming6.notepad.except.daoException;
import my.home.programming6.notepad.view.Parser;

public class DataAccessImpl implements DataAccess {
	private String filePath = "notepadData//notes.txt";

	@Override
	public List<Note> getAll() throws daoException {
		List<Note> notes = new ArrayList<>();
		try (FileReader file = new FileReader(new File(filePath))) {
		
			int i;
			String ch = "";
			
			while ((i = file.read()) != -1) {
				ch += String.valueOf((char) i);
			}
			
			if(!ch.isBlank()) {
				
				for (String s : ch.split("\n")) {
					notes.add(Parser.parseNoteInfo(s));
				}
			}

			

		} catch (Exception e) {
			throw new daoException("file not found", e);
		}

		return notes;
	}

	@Override
	public boolean saveAll(List<Note> notes) throws daoException {
		try (FileWriter file = new FileWriter(new File(filePath))) {
			for (Note note : notes) {
				if(note.equals(null)) {
					continue;
					}
				file.write(Parser.noteInfo(note) + "\n");
			
			}
			return true;
		} catch (Exception e) {
			throw new daoException(e);
		}

	}


}
