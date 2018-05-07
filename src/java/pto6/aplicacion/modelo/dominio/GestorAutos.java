/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto6.aplicacion.modelo.dominio;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class GestorAutos {
    private ArrayList<Auto> autos= new ArrayList<Auto>();

    /**
     * @return the autos
     */
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
        
       public void agregarAuto (Auto auto){
    this.autos.add(auto);
    }    
    }

    
