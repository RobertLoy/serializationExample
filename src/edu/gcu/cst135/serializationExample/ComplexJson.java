package edu.gcu.cst135.serializationExample;

public class ComplexJson extends PersonJson {
	
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

	public ComplexJson(String name, char gender, int stuId, boolean isEnrolled) {
		super(name, gender);
		this.stuId = stuId;
		this.isEnrolled = isEnrolled;
	}

	public ComplexJson(String name, char gender) {
		super(name, gender);
		// TODO Auto-generated constructor stub
	}
	
	public ComplexJson() {
		super();
	}

	@Override
	public String toString() {
		return "Complex [stuId=" + stuId + ", isEnrolled=" + isEnrolled + ", toString()=" + super.toString() + "]";
	}
}
