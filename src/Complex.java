import java.time.LocalDate;

public class Complex extends Person {
	
	private int stuId;
	private boolean isEnrolled;
	
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
