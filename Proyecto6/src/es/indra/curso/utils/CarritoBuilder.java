package es.indra.curso.utils;

import java.util.ArrayList;

import es.indra.curso.model.CarritoDeLaCompra;

public class CarritoBuilder {
 
    ArrayList<Integer> precios = new ArrayList<Integer>();
 
    public CarritoBuilder(int size){
        for(int i = 0; i < size; i++){
            Double random = Math.random()*100+1;
            precios.add(random.intValue());
        }
    }
 
    public CarritoBuilder(int size, int value){
        for(int i = 0; i < size; i++){
            precios.add(value);
        }
    }
 
    public CarritoDeLaCompra build(){
        return new CarritoDeLaCompra(this.precios);
    }
 
    public CarritoBuilder add(Integer nuevoValor){
        precios.add(nuevoValor);
        return this;
    }
    
    public CarritoBuilder addMultiple(int size, int value){
        for(int i = 0; i < size; i++){     
            precios.add(value);
        } 
        return this;
    }

}