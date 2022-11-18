package indra.cursojava.main;

import indra.cursoja.entidad.Pokemon;
import indra.cursoja.entidad.TipoPokemon;
import indra.cursojava.acciones.Combate;

public class Tournament {

	public static void main(String[] args) {
		//instnaciamos primer pokemon y seteamos valores
		Pokemon pikachu = new Pokemon();
		pikachu.name = "Pikachu";
		pikachu.attackPower = 10;
		pikachu.type = TipoPokemon.Eléctrico;
		
		//instanciasmos segundo pokemon y seteamos valores
		Pokemon charmander = new Pokemon();
		charmander.name = "Charmander The Best";
		charmander.attackPower = 5;
		
		Combate battle= new Combate();
		battle.numberOfBattle = 1;
		battle.playerOne = pikachu;
		battle.playerTwo = charmander;
		System.out.print(battle.battle());
		
//		Combate battle2= new Combate();
//		battle.numberOfBattle = 2;
//		System.out.print(battle.battle());
		
	}

}
