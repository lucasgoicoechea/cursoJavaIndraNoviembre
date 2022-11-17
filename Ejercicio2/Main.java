import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Corredor c1 = new Corredor("A", 1, 10);
        Corredor c2 = new Corredor("B", 2, 10);
        Corredor c3 = new Corredor("C", 3, 10);
        Corredor c4 = new Corredor("D", 4, 10);
        Corredor c5 = new Corredor("E", 5, 10);
        Corredor c6 = new Corredor("F", 6, 10);
        Corredor c7 = new Corredor("G", 7, 10);
        Corredor c8 = new Corredor("H", 8, 10);
        List<Corredor> corredores = new ArrayList<>();

        Pista pista = new Pista("pista",10, corredores);

        Carrera carrera = new Carrera("carrera", "Madrid", pista);

        //Metodo velocidad
        Corredor aux = null;
        int i = -100;
        for(Corredor c : corredores) {
            int v = c.getVelocidad() * (c.getDistancia() - pista.getLargo());
            if(( v < i) || (i<0) ) {
                i = v;
                aux = c;
            }
        }
        System.out.print("El corredor mas veloz es " + aux.getNombre());
    }
}
