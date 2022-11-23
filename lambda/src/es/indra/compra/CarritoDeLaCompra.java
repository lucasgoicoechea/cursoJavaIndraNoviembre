package es.indra.compra;

import java.util.Collection;

public class CarritoDeLaCompra {
    private Collection<Integer> precios;

    // Forma tradicional de Calcular la suma de los precios y la cantidad de articulos
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
    
    // Cantidad de articulos y precio total con lambda
    public int calcularPrecioTotalLambda() {
        int precioTotal = this.precios.stream().mapToInt(precio -> precio.intValue()).sum();
        return precioTotal;
    }
    
    
     public int calcularPrecioTotalRefMethod() {
    	int precioTotal = this.precios.stream()
                          .mapToInt(Integer::intValue)
                          .sum();
    	return precioTotal;
     }
     
     // Clacular descuentos de forma tradicional
     public long calcularDescuentoTotal(int cantidadConDescuento){
    	 
    	    long descuentoTotal = 0;
    	 
    	    for(Integer precio : precios){
    	        if(precio >= cantidadConDescuento){
    	            descuentoTotal += (cantidadConDescuento*5)/100;
    	        }
    	    }
    	    return descuentoTotal;
    	}
     
     // Calcular descuentos con lambda
     public long calcularDescuentoTotalLambda(int cantidadConDescuento){
    	 
    	    long descuentoTotal = 0;
    	 
    	    Long numeroDeDescuentos  = this.precios.stream()
    	                                       	.filter(precio -> precio.intValue() >= cantidadConDescuento)
    	                                       	.count();
    	 
    	    descuentoTotal = (cantidadConDescuento*5/100)*numeroDeDescuentos;
    	 
    	    return descuentoTotal;
    	}
     
     // Detectar un valor neganito de forma tradicional
     public boolean detectarError() {
    	 
    	  boolean negativeFind = false;
    	 
    	  for (int precio : precios) {
    	 
    	 	if (precio < 0) {
    	 
    	     	negativeFind = true;
    	 	}
    	  }  
    	 
    	  return negativeFind;
    	}
     
     // Detectar un valor neganito con AnyMatch
     public boolean detectarErrorAnyMatch() {
    	 
    	    return this.precios.stream().anyMatch(precio -> precio.intValue() < 0);
    }
    
     // Detectar un valor neganito con FindAny (te busca todos)
	 public boolean detectarErrorFindAny() {
		 
		   return this.precios.stream().filter(precio -> precio.intValue() < 0)
		                           	.findAny()
		                           	.isPresent();
	}
	 
	// Detectar un valor neganito con FindFirst (te busca el primero)
	 public boolean detectarErrorFindFirst() {
		 
		   return this.precios.stream().filter(precio -> precio.intValue() < 0)
		                           	.findFirst()
		                           	.isPresent();
	}
	
	 // Detectar el valor neganito pero con Parallel, tambien usa anyMatch, filter y FindFirst
	 public boolean detectarErrorAnyMatchParallel() {
		    return this.precios.parallelStream().anyMatch(precio -> precio.intValue() < 0);
		}
		 
	public boolean detectarErrorFindAnyParallel() {
	    return this.precios.parallelStream().filter(precio -> precio.intValue() < 0)
	                                        .findAny()
	                                        .isPresent();
	}
	
	public boolean detectarErrorFindFirstParallel() {
		 
	    return this.precios.parallelStream().filter(precio -> precio.intValue() < 0)
	                                        .findFirst()
	                                        .isPresent();
	}
	
	public Collection<Integer> detectarPrecioSupAnyMatchParallel(int limite) {

		return this.precios.parallelStream().filter(precio -> precio.intValue() > limite).toList();
	}

		
}
