package service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dao.CarreteraDao;
import model.Señal;

@Service
public class CarreteraServiceImpl implements CarreteraService{

	
	
	private CarreteraDao carreteraDAO;



	public void setcarreteraDAO(CarreteraDao carreteraDAO) {
		this.carreteraDAO = carreteraDAO;
	}

	
	@Override
	@Transactional
	public void insertarSeñal(Señal señal) {

		this.carreteraDAO.addSeñal(señal);

	}

	@Override
	@Transactional
	public Señal consultarId(int id) {
		return this.carreteraDAO.getSeñalById(id);

	}

	@Override
	@Transactional
	public void borrarSeñal(Señal señal) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void actualizarSeñal(Señal señal) {
		this.carreteraDAO.updateSeñal(señal);

	}

	@Override
	@Transactional
	public ArrayList<Señal> getSeñales() {
		return this.carreteraDAO.listSeñales();

	}


}
