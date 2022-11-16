package calculadoraTest;

public class Calculadora {
	
	public int[] sumarizado(int[] arreglonumeros, int incremento) {
		int[] tmpNro =  new int[arreglonumeros.length];
		for (int i = 0; i < arreglonumeros.length; i++) {
			tmpNro[i] = arreglonumeros[i] + incremento; 
		} 
	     return tmpNro;	
	}
	
	public int suma(int primeroperando, int segundooperando) {
		if (segundooperando > 10000) {
			segundooperando = 0;
		}
		return primeroperando + segundooperando;
	}

}
