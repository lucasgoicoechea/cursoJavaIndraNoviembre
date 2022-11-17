package p1;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Clase2 {

public static String texto="texto de prueba";
	public static void main(String[] parametro) {
		System.out.println("text de prueba");
		JOptionPane.showMessageDialog(null,texto);
		Scanner sc =new Scanner(System.in);
		
		String resp =JOptionPane.showInputDialog("ingrese un texto");
		System.out.println(resp);
		if(resp=="1")
			System.out.println(resp);
		
		int i=0;
		while(i<resp.length()) {
			i=i+1;
			System.out.print(resp.charAt(i-1));
		}
		System.out.println("");
		for (int j = 0; j < texto.length(); j++) {
			System.out.print(texto.charAt(j));
			
		}
		
		int a;
		
		System.out.print("Introduce un int:");
		a=sc.nextInt();
		System.out.println(a);
	}
}
