import java.time.LocalDate;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demoSimple();
		// demoMedium();
		demoComplex();
	}
	
	private static void demoSimple() {
		System.out.println("=================");
		System.out.println("== SIMPLE DATA ==");
		System.out.println("=================\n");	
		Simple ex1 = new Simple(35);
		System.out.println(ex1);
		DataServices.serializeSimple(ex1);
		ex1 = null;
		System.out.println(ex1);
		ex1 = DataServices.readSimple();
		System.out.println(ex1);
	}
	
	private static void demoMedium() {
		System.out.println("=================");
		System.out.println("== MEDIUM DATA ==");
		System.out.println("=================\n");	
		Person p = new Person("Timmy", 'M', LocalDate.parse("1999-12-25"));
		Medium ex1 = new Medium(35, p);
		System.out.println(ex1);
		DataServices.serializeMedium(ex1);
		ex1 = null;
		System.out.println(ex1);
		ex1 = DataServices.readMedium();
		System.out.println(ex1);
	}
	
	private static void demoComplex() {
		System.out.println("==================");
		System.out.println("== COMPLEX DATA ==");
		System.out.println("==================\n");		
		Complex ex1 = new Complex("Barbara", 'F', LocalDate.parse("2001-11-10"), 9114323, true);
		System.out.println(ex1);
		DataServices.serializeComplex(ex1);
		ex1 = null;
		System.out.println(ex1);
		ex1 = DataServices.readComplex();
		System.out.println(ex1);
	}

}
