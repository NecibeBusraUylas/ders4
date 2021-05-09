package GameProject.Entities.Concrete;

import GameProject.Entities.Abstract.Entity;

public class Gamer implements Entity{

	private int id;
	private String nationalId;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	public Gamer(int id, String nationalId, String firstName, String lastName, int yearOfBirth) {
		this.id = id;
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
}