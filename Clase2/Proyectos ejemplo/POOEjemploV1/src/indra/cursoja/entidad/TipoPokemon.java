package indra.cursoja.entidad;

public enum TipoPokemon {
	
	BICHO, DRAGON, Eléctrico, Hada, Lucha, Fuego, Volador, Fantasma, Planta, Tierra, Hielo, Normal, Veneno, Psíquico, Roca, Acero, Agua;
	
	public static String values(TipoPokemon tipo) {
		return TipoPokemon.Eléctrico == tipo?"Es un electrico":"";
	}
    
}
