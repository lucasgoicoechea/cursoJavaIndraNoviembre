package ejecutable;

import java.util.List;

import dao.DaoCiudad;
import dao.DaoEmpleado;
import dao.DaoPais;
import dao.DaoPersona;
import model.Ciudad;
import model.Empleado;
import model.Pais;
import model.Persona;

public class Inicio {
	public static void main(String[] args) {
		Persona p = DaoPersona.find(3L);
		System.out.println("-----PERSONA de base de datos------");
		System.out.println(p);
		System.out.println("------Cambios---------");
		p.setNombre("Nadia");
		p.setApellido("Alvarez");
		
		DaoPersona.update(p);
		
		Empleado e =DaoEmpleado.find(1L);
		System.out.println("-----EMPLEADO de base de datos------"); 
		System.out.println(e.getUsuario());
		System.out.println(e.getPerson().getNombre());

	}
	
	public static void testPaisCdad() {
		Pais p = DaoPais.find(1L);
		System.out.println("-----PAIS de base de datos------");
		System.out.println(p.getNombre());
		System.out.println("-----CIUDADES-----");
		List<Ciudad> ciudades=DaoCiudad.findAllCiudades(1);
		for(int i = 0; i <ciudades.size();i++) {
		System.out.println(ciudades.get(i));
		}
		}
}