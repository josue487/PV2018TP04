/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto1.aplicacion.modelo.dominio;

/**
 *
 * @author josue
 */
public class Temperatura {
    
    private double temperatura;
    
    public double gradosACelsius(){
        double resultado;
        resultado=(getTemperatura() -32)/1.8;
        return resultado;
    }
    
    public double gradosAKelvin (){
        double resultado;
        resultado=(5/9)*(getTemperatura()-32)+273.15;
        return resultado;
    }
    
   public double celsiusAGrados (){
        double resultado;
        resultado = getTemperatura()*1.8+32;
        return resultado;
    }
    
   public double celsiusAKelvin (){
        double resultado;
        resultado=getTemperatura() +273.15;
        return resultado;
    }
    
   public double kelvinAGrados (){
        double resultado;
        resultado=1.8*(getTemperatura()-273.15)+32;
        return resultado;
    }
    
   public double kelvinAcelsius (){
        double resultado;
        resultado=getTemperatura()-273.15;
        return resultado;
    }

    /**
     * @return the temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


    

    

}