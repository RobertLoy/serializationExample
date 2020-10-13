package edu.gcu.cst135.serializationExample;

import java.io.Serializable;

public class Medium implements Serializable {

	private static final long serialVersionUID = 5679067843859713583L;
	private int age;
	private Person p;
	

	public Medium(int age, Person p) {
		super();
		this.age = age;
		this.p = p;
	}

	@Override
	public String toString() {
		return "Medium [age=" + age + ", p=" + p + "]";
	}

}
