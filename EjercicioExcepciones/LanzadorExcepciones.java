import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LanzadorExcepciones {
	
	private int numero;
	private int numero2;
	private Scanner scanner=new Scanner(System.in);
	
	public void leerNumero() throws FileNotFoundException {
		System.out.println("Ingrese un numero");
		numero=scanner.nextInt();
		if (scanner==null) {
			throw new FileNotFoundException();
			}
		try 
		{
		System.out.println("Ingrese un numero");
		numero2=scanner.nextInt();
		}
			catch (NoSuchElementException e){
				e.printStackTrace();
			}
		}

	public int generarCalculo() {
		System.out.println(numero + numero2);
		return numero+numero2;
	}
	
}


