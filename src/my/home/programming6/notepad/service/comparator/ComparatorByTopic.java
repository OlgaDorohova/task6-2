package my.home.programming6.notepad.service.comparator;

import java.util.Comparator;

import my.home.programming6.notepad.entity.Note;

public class ComparatorByTopic implements Comparator<Note>{

	@Override
	public int compare(Note o1, Note o2) {
		return o1.getTopic().compareTo(o2.getTopic());
	}

}
