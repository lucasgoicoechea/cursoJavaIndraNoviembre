package es.indra;

import org.springframework.stereotype.Service;

@Service
public class ServicioB {
 
    public String metodo2() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "hola es el metodo2";
         
    }
}
