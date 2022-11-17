import java.util.ArrayList;
import java.util.List;

public class Main {

	private static Carrera carrera=new Carrera();

	public static void main(String[] args)
	{
		List<Corredor> corredores = new ArrayList<>();
		corredores.add(new Corredor("Juan",20,300));
		corredores.add(new Corredor("Juan",40,400));
		corredores.add(new Corredor("Juan",30,500));
		corredores.add(new Corredor("Juan",70,400));
		corredores.add(new Corredor("Juan",80,200));
		corredores.add(new Corredor("Juan",20,400));
		corredores.add(new Corredor("Juan",50,800));
		corredores.add(new Corredor("Juan",90,600));
		
		
		carrera.setPista(new Pista("Atocha",100,corredores));
		int velocidad=0;
		for(int i=0;i<corredores.size();i++) {
			velocidad=corredores.get(i).getVelocidad()* ( corredores.get(i).getDistancia() - carrera.getPista().getLargo());
			System.out.println(velocidad);
		}

	}



}
