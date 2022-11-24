package interfaces;

import java.time.LocalDate;

public interface IEsAlimento {
	public void setCaducidad(LocalDate fc);
	public LocalDate getCaducidad();
	public int getCalorias();
	
}
