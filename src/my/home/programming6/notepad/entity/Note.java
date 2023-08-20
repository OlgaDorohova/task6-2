package my.home.programming6.notepad.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Note implements Serializable{

	private static final long serialVersionUID = 4611288879575913428L;
	
	private String topic;
	private LocalDate date;
	private String email;
	private String message;

	public Note() {
		date = LocalDate.now();
	}

	public Note(String topic, String email, String message) {
		super();
		this.topic = topic;
		this.email = email;
		this.message = message;
		

	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDate() {
		return date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, email, message, topic);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(date, other.date) && Objects.equals(email, other.email)
				&& Objects.equals(message, other.message) && Objects.equals(topic, other.topic);
	}

	@Override
	public String toString() {
		return "Note [topic=" + topic + ", date=" + date + ", email=" + email + ", message=" + message + "]";
	}

}
