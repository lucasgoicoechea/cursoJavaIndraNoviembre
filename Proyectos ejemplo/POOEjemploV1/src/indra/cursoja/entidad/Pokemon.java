package indra.cursoja.entidad;

public class Pokemon {
	
	public String name = "Pokemon";
	int evolution = 0;
	
	public TipoPokemon type = TipoPokemon.DRAGON;
	
	public int attackPower = 1;
	int defensePower = 1;
	
	public void attack() {
		//TODO : debe poder generar funcionalidad de ataque
	}
	
	public void defense() {
		//TODO: debe poder generar funcionalidad de defensa
	}
	
	@Override
	public String toString() {
		return name;
	}

}
