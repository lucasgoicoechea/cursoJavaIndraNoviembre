package springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import springmvc.Rocket;
import springmvc.dao.RocketDAO;

public class RocketServiceImpl implements RocketService{

	private RocketDAO rocketDAO;

	public void setRocketDAO(RocketDAO rocketDAO) {
		this.rocketDAO = rocketDAO;
	}

	@Override
	@Transactional
	public void addRocket(Rocket rock) {
		this.rocketDAO.addRocket(rock);
	}

	@Override
	@Transactional
	public void updateRocket(Rocket rock) {
		this.rocketDAO.updateRocket(rock);
	}

	@Override
	@Transactional
	public List<Rocket> listRocket() {
		return this.rocketDAO.listRocket();
	}

	@Override
	@Transactional
	public Rocket getRocketById(int id) {
		return this.rocketDAO.getRocketById(id);
	}

	@Override
	@Transactional
	public void removeRocket(int id) {
		this.rocketDAO.removeRocket(id);
	}


}
