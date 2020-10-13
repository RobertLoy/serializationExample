import java.io.Serializable;

public class Simple implements Serializable {

	private int age;

	public Simple(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Simple [age=" + age + "]";
	}	

}
