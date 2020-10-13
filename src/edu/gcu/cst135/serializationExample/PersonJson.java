package edu.gcu.cst135.serializationExample;

public class PersonJson {

	private String name;
	private char gender;
	//private LocalDate bDate;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public PersonJson() {
		super();
	}	
	
	public PersonJson(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";

	}

}
