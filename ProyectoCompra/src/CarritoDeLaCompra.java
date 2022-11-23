
import java.util.Collection;
 
public class CarritoDeLaCompra {
 
    private Collection<Integer> precios;
 
    public CarritoDeLaCompra(Collection<Integer> precios) {
 
        this.precios = precios;
    }
 
    public int calcularPrecioTotal() {
 
        int precioTotal = 0;
 
        for(Integer precio : precios){
 
            precioTotal += precio;
 
        }
        return precioTotal;
    }
 
    public int contarNumeroProductos() {
 
        return precios.size();
    }
    
    public int calcularPrecioTotalLambda() {
        int precioTotal = this.precios.stream().mapToInt(precio -> precio.intValue()).sum();
        return precioTotal;
    }
    
    

}
