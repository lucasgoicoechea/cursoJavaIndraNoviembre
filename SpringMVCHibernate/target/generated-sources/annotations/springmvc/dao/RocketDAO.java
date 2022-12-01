package springmvc.dao;
import springmvc.*;
public class RocketDAO {

	public void addRocket(Rocket r);

	public void updateRocket(Rocket r);

	public List<Rocket> listRocket();

	public Rocket getRocketById(int id);

	public void removeRocket(int id);
}
