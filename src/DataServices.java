

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataServices {

	// Used to write our objects to text file
	public static void serializeSimple(Simple s) {
		System.out.println("WRITING OUTPUT ... ");
		try {
			FileOutputStream fos = new FileOutputStream("simple.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.close();
			fos.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
	}

	// Used to read our previous objects from a text file
	public static Simple readSimple() {

		System.out.println("READING INPUT ... ");
		Simple s = null;

		try
		{
			FileInputStream fis = new FileInputStream("simple.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			s = (Simple) ois.readObject();

			ois.close();
			fis.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
			return s;
		} 
		catch (ClassNotFoundException c) 
		{
			System.out.println("Class not found");
			c.printStackTrace();
			return s;
		}

		return s;
	}
	
	// Used to write our objects to text file
	public static void serializeMedium(Medium s) {
		System.out.println("WRITING OUTPUT ... ");
		try {
			FileOutputStream fos = new FileOutputStream("medium.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.close();
			fos.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
	}

	// Used to read our previous objects from a text file
	public static Medium readMedium() {

		System.out.println("READING INPUT ... ");
		Medium s = null;

		try
		{
			FileInputStream fis = new FileInputStream("medium.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			s = (Medium) ois.readObject();

			ois.close();
			fis.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
			return s;
		} 
		catch (ClassNotFoundException c) 
		{
			System.out.println("Class not found");
			c.printStackTrace();
			return s;
		}

		return s;
	}
	
	// Used to write our objects to text file
	public static void serializeComplex(Complex s) {
		System.out.println("WRITING COMPLEX OUTPUT ... ");
		try {
			FileOutputStream fos = new FileOutputStream("complex.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.close();
			fos.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
	}

	// Used to read our previous objects from a text file
	public static Complex readComplex() {

		System.out.println("READING COMPLEX INPUT ... ");
		Complex s = null;

		try
		{
			FileInputStream fis = new FileInputStream("complex.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			s = (Complex) ois.readObject();

			ois.close();
			fis.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
			return s;
		} 
		catch (ClassNotFoundException c) 
		{
			System.out.println("Class not found");
			c.printStackTrace();
			return s;
		}

		return s;
	}
}
