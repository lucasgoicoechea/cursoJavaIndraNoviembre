package dao;

import java.util.ArrayList;

import model.Carretera;

public interface CarreteraDao {

	public void addPerson(Carretera c);
	public void updatePerson(Carretera c);
	public ArrayList<Carretera> listCarretera();
	public void removeCarretera(int id);
	public  Carretera getCarreteraById(int id);

}
