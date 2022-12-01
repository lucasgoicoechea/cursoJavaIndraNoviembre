package dao;

import java.util.ArrayList;

import model.Carretera;
import model.Señal;

public interface CarreteraDao {

	public void addSeñal(Señal c);
	public void updateSeñal(Señal c);
	public ArrayList<Señal> listSeñales();
	public void removeSeñal(int id);
	public  Señal getSeñalById(int id);

}
