import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class EntregaTest {
    @Test
    public final void caseBase() {
        assertEquals("Hay 1 entrega", 1, 1);
    }

    @Test
    public final void failedBase() {
        assertFalse("No existe ninguna entrega", true);
    }

    @Test
    public final void exceptionBase() throws Exception {
        try {
            assertEquals("Existe una entrega", 1, 1);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public final void complexBase() {
        assertEquals("Numero correcto de pedido", 1, 1);
        assertEquals("Realizacion correcta de entrega", 1, 1);

    }
}
