package ejecutable;

import java.util.List;

import dao.*;
import model.Ciudad;
import model.Empleado;
import model.Legajo;
import model.Pais;
import model.Persona;

public class Inicio {
	public static void main(String[] args) {
		/*Persona p = DaoPersona.find(3L);
		System.out.println("-----PERSONA de base de datos------");
		System.out.println(p);
		System.out.println("------Cambios---------");
		p.setNombre("Nadia");
		p.setApellido("Alvarez");
		DaoPersona.update(p);
		Empleado e = DaoEmpleado.find(1L);
		System.out.println("-----EMPLEADO de base de datos------");
		System.out.println(e.getUsuario());
		System.out.println(e.getPerson().getNombre());*/
		//testPaisCdad();
		//testLegajo();
		paisesYCiudades();
	}

	public static void testPaisCdad() {
		Pais p = DaoPais.find(1L);
		System.out.println("-----PAIS de base de datos------");
		System.out.println(p.getNombre());
		System.out.println("-----CIUDADES-----");
		List<Ciudad> ciudades = DaoCiudad.findAllCiudades(1);

		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println(ciudades.get(i));
		}
	}
	
	public static void testLegajo() {
		Legajo l = DaoLegajo.find("12AB");
		System.out.println("-----Legajo de base de datos------");
		System.out.println("Nombre: " + l.getNombre() + "\nCodigo: " + l.getCodigo() + "\nAnios: " + l.getAnios_antiguedad());
		System.out.println("-----Legajos-----");
		
		List<Legajo> legajos = (List<Legajo>) DaoLegajo.findAllLegajos();
		
		for (Object i : legajos) {
			System.out.print(i);
			//System.out.println("Nombre: " + (Legajo)i. + "\nCodigo: " + i.getCodigo() + "\nAnios: " + i.getAnios_antiguedad());
		}
		/*for (int i = 0; i < legajos.size(); i++) {
			Legajo legajo = (Legajo)legajos.get(i);
			System.out.println(legajo);
			//System.out.println("Nombre: " + legajo.getNombre() + "\nCodigo: " + legajo.getCodigo() + "\nAnios: " + legajo.getAnios_antiguedad());
		}*/
	}
	
	public static void paisesYCiudades() {
        Pais p = DaoPais.find(1L);
        System.out.println("-----PAIS de base de datos------");
        System.out.println(p.getNombre());
        System.out.println("-----Paises-----");
        List<String> ciudades = DaoPais.findAllPaisCiudad();
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(ciudades.get(i));
        }
        
    }
    public static void empleadosYPersonas() {
        Empleado p = DaoEmpleado.find(1L);
        System.out.println("-----Empleado de base de datos------");
        System.out.println(p.getUsuario());
        System.out.println("-----Empleado-----");
        List<Empleado> empleados = DaoEmpleado.findAllEmpleadoPersona();
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println(empleados.get(i).getUsuario());
        }
    }
}