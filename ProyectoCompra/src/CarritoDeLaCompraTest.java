
import org.junit.Assert;
import org.junit.Test;
 
public class CarritoDeLaCompraTest {
 
    @Test
    public void shouldReturnTheCountOfAllItems() throws Exception {
 
        CarritoBuilder builder = new CarritoBuilder(30);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(30, carritoDeLaCompra.contarNumeroProductos());
    }
 
    @Test
    public void shouldCalculateTotalPrice() throws Exception {
 
        CarritoBuilder builder = new CarritoBuilder(60,5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(300, carritoDeLaCompra.calcularPrecioTotal());
 
    }
}
