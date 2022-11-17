package es.indra.cursoJava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecturaFichero {

	public static void main(String[] args) {

		try {
			createFile();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createFile() throws IOException {
		File testF = new File("c:/Users/usuario/Documents");
		File tempF = testF.createTempFile("tee", null, testF);
		System.out.println("Temp filpath" + tempF.getPath());
		
		//int myInt[] = new int[5];
		List<Integer> myIntCollection = new ArrayList<Integer>(5);
		
		//myInt[5] = 25;
		myIntCollection.add(5, 25);
		
	}
}
