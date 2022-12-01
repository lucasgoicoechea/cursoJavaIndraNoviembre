package springmvc.dao;
import java.util.List;

import springmvc.*;

public interface RocketDAO {

	public void addRocket(Rocket r);

	public void updateRocket(Rocket r);

	public List<Rocket> listRocket();

	public Rocket getRocketById(int id);

	public void removeRocket(int id);
}
