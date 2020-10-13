package edu.gcu.cst135.serializationExample;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person implements Serializable {
 
	private static final long serialVersionUID = 8281633094612160352L;
	private String name;
	private char gender;
	private LocalDate bDate;
	
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

	public LocalDate getbDate() {
		return bDate;
	}

	public void setbDate(LocalDate bDate) {
		this.bDate = bDate;
	}	

	public Person(String name, char gender, LocalDate bDate) {
		super();
		this.name = name;
		this.gender = gender;
		this.bDate = bDate;
	}
	

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY"); 
		return "Person [name=" + name + ", gender=" + gender + ", bDate=" + formatter.format(bDate) + "]";
	}

}
