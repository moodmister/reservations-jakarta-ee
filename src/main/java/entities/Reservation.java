package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Reservation {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String startDate;
	private String endDate;
	private boolean breakfast;
	private boolean dinner;
	private int roomId;
	public Reservation() {
		
	}
	public Reservation(String firstName, String middleName, String lastName, String startDate, String endDate,
			boolean breakfast, boolean dinner, int roomId) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.breakfast = breakfast;
		this.dinner = dinner;
		this.roomId = roomId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean isBreakfast() {
		return breakfast;
	}
	public void setBreakfast(boolean breakfast) {
		this.breakfast = breakfast;
	}
	public boolean isDinner() {
		return dinner;
	}
	public void setDinner(boolean dinner) {
		this.dinner = dinner;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	
	@Override
	public String toString() {
		return "Резервация на " + this.firstName + " " + this.lastName +
				": от " + this.startDate + " до " + this.endDate;
	}
}
