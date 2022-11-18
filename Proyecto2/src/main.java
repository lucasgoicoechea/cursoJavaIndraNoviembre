import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Corredor corredor1 = new Corredor("Corredor1", 21, 56);
		Corredor corredor2 = new Corredor("Corredor2", 22, 56);
		Corredor corredor3 = new Corredor("Corredor3", 23, 56);
		Corredor corredor4 = new Corredor("Corredor4", 212, 56);
		Corredor corredor5 = new Corredor("Corredor5", 211, 56);
		Corredor corredor6 = new Corredor("Corredor6", 1, 56);
		Corredor corredor7 = new Corredor("Corredor7", 23, 56);
		Corredor corredor8 = new Corredor("Corredor8", 12, 56);
		
		List<Corredor> lista = new ArrayList();
		lista.add(corredor1);
		lista.add(corredor2);
		lista.add(corredor3);
		lista.add(corredor4);
		lista.add(corredor5);
		lista.add(corredor6);
		lista.add(corredor7);
		lista.add(corredor8);
		
		Pista pista = new Pista("Madrid", 1000, lista);
		
		double max = 0;
		
		for(Corredor corredor : pista.getCorredores()) {
			double velocidadPista = corredor.getVelocidad() * (corredor.getDistancia() - pista.getLargo());
			if(velocidadPista > max) {
				max = velocidadPista;
			}
		}
		
		System.out.println(max);
	}

}
