import java.util.*;

public class Programacion {
    //Variables
    private Date fechaFin;
    private Date fechaHoraCreada;
    private Date fechaInicio;

    //Getter and setter
    public Date getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Date getFechaHoraCreada() {
        return fechaHoraCreada;
    }
    public void setFechaHoraCreada(Date fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    //Funciones
    public boolean estaCompleto() {return false;};
    public boolean estaIniciadaFuncion() {return false;};
    public boolean estaVigente() {return false;};
    public void mostrarProgramacion() {return;};
}
