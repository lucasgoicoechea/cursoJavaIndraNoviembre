public class Carrera {
    private String nombre, lugar;
    private Pista pista;

    public Carrera(String nombre, String lugar, Pista pista) {
        super();
        this.nombre = nombre;
        this.lugar = lugar;
        this.pista = pista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }


}
