import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person implements Serializable {

	private String name;
	private char gender;
	private LocalDate bDate;
	
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
