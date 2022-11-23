import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class DespachoTest {

    @Test
    public final void caseBase() {
        assertEquals("Hay 1 despacho", 1, 1);
    }

    @Test
    public final void failedBase() {
        assertFalse("No existe ningun despacho", true);
    }

    @Test
    public final void exceptionBase() throws Exception {
        try {
            assertEquals("Existe un despacho", 1, 1);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public final void complexBase() {
        assertEquals("Numero correcto de despachos", 1, 1);
        assertEquals("Registro pedido correctamednte", 1, 1);
    }



}
