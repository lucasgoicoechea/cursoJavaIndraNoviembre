package es.indra.atletismo;

public class main {
	
	public static int velocidadCorredor(Corredor corredor,Pista pista) {
		return corredor.getVelocidad() * (corredor.getDistancia()-pista.getLargo());
	}
	
	public static Corredor exeCarrera(Carrera carrera1) {
		Corredor vencedor = new Corredor();
		int velocidad = 0;
		for(int i = 0; i < carrera1.getPista().getCorredores().size(); i++){
			if(velocidadCorredor(carrera1.getPista().getCorredores().get(i), carrera1.getPista()) > velocidad) {
				vencedor = carrera1.getPista().getCorredores().get(i);
			}
		}
		return vencedor;
	}
	
	public static void Main(String[] args) {
		Corredor corredor1 = new Corredor();
		corredor1.setNombre("Juan Carlos");
		corredor1.setDistancia(800);
		corredor1.setVelocidad(29);
		
		Corredor corredor2 = new Corredor();
		corredor2.setNombre("Manuel");
		corredor2.setDistancia(600);
		corredor2.setVelocidad(31);
		
		Corredor corredor3 = new Corredor();
		corredor3.setNombre("Maria");
		corredor3.setDistancia(700);
		corredor3.setVelocidad(33);
		
		Pista pista1 = new Pista();
		pista1.setNombre("Pista 5");
		pista1.setLargo(800);
		pista1.getCorredores().add(corredor1);
		pista1.getCorredores().add(corredor2);
		pista1.getCorredores().add(corredor3);
		
		Carrera carrera1 = new Carrera();
		carrera1.setNombre("Carrera1");
		carrera1.setLugar("Valencia");
		carrera1.setPista(pista1);
		
		System.out.println("Carrera solidaria en" + carrera1.getNombre());
		Corredor vencedor = new Corredor();
		vencedor = exeCarrera(carrera1);
		System.out.println("El ganador/a es: " + vencedor.getNombre());
		
	}
}
/*
 *   public static void main(String[] args) {
        Carrera carrera1 = new Carrera();
        carrera1.setNombre("primera carrera");
        carrera1.setLugar("almeria");
        
        Pista pista1 = new Pista();
        pista1.setLargo(800);
        pista1.setNombre("pista d 800m");
        
        Corredor juanPeres = new Corredor();
        juanPeres.setNombre("juancito");
        juanPeres.setDistancia(400);
        juanPeres.setVelocidad(33);
        
        Corredor mateoRunner = new Corredor();
        mateoRunner.setNombre("el runner");
        mateoRunner.setDistancia(1000);
        mateoRunner.setVelocidad(26);
        
        pista1.getCorredores().add(juanPeres);
        pista1.getCorredores().add(mateoRunner);
        
        carrera1.setPista(pista1);
        
        Corredor ganador = carrera1.ejecutarCarrera();
        System.out.print("EL GANDAOR ES "+ganador.getNombre());
        
        
    }
}*/
