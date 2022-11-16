package indra.cursojava.acciones;

import indra.cursoja.entidad.Pokemon;
import indra.cursoja.entidad.TipoPokemon;

public class Combate {
	
	public Pokemon playerOne;
	public Pokemon playerTwo;
	public int numberOfBattle = 0;
	
	public Pokemon battle() {
		//FIXME: generar funcionalidad real
		System.out.println(TipoPokemon.values(playerOne.type));
		if (playerOne.attackPower > playerTwo.attackPower) {
			return this.playerOne;
		}
		return playerTwo;
	}
	

}
