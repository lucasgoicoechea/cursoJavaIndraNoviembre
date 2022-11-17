import java.util.Date;

public class Cine {
    //Atributos
    private String direccion, nombre;
    private Date fechaInauguracion;
    private Float precioEntrada;
    private HoraFuncion horariosFunciones;
    private Programacion programaciones;

    //Getters and setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(Date fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public Float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    //Funciones
    public void mostrarCine() {};

    public void mostrarInfoHorariosFuncion() {};

}
