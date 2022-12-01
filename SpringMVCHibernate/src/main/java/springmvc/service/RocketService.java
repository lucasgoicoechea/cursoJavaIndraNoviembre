package springmvc.service;

import java.util.List;

import springmvc.Rocket;

public interface RocketService{
	public void addRocket(Rocket rock);
	public void updateRocket(Rocket rock);
	public List<Rocket> listRocket();
	public Rocket getRocketById(int id);
	public void removeRocket(int id);
	

}
