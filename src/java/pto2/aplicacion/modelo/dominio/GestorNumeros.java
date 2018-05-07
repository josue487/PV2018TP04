/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto2.aplicacion.modelo.dominio;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class GestorNumeros {
     private ArrayList<Numero> numeros= new ArrayList<Numero>();
    /**
     * @return the numeros
     */
    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }
    
    public void agregarNumeros (Numero num){
        this.numeros.add(num);
    }
}
