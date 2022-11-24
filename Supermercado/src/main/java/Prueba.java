import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import models.Cereales;
import models.Detergente;
import models.Producto;
import models.Vino;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto> productos = new ArrayList<Producto>();
		
		Cereales c = new Cereales("A", "B", 5.0, LocalDate.now());
		Vino v = new Vino("V", "rioja", 15, 2.0, 3.0, 0.5, "C");
		Detergente g = new Detergente("D", 10);
		
		productos.add(c);
		productos.add(v);
		productos.add(g);
		
		int i = 0; 
		
		for(Producto p : productos) {
			i += p.getCalorias();
		}
		
		System.out.println("El numero de calorias totales son " + i);
	}

}
