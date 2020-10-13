package edu.gcu.cst135.serializationExample;

import java.time.LocalDate;

public class Complex extends Person {
	
	private static final long serialVersionUID = 1010166008682122395L;
	private int stuId;
	private boolean isEnrolled;
	
	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public boolean isEnrolled() {
		return isEnrolled;
	}

	public void setEnrolled(boolean isEnrolled) {
		this.isEnrolled = isEnrolled;
	}

	public Complex(String name, char gender, LocalDate bDate, int stuId, boolean isEnrolled) {
		super(name, gender, bDate);
		this.stuId = stuId;
		this.isEnrolled = isEnrolled;
	}

	public Complex(String name, char gender, LocalDate bDate) {
		super(name, gender, bDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Complex [stuId=" + stuId + ", isEnrolled=" + isEnrolled + ", toString()=" + super.toString() + "]";
	}
}
