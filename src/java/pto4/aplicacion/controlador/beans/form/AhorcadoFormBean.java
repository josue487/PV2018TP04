/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto4.aplicacion.controlador.beans.form;

import pto4.aplicacion.modelo.dominio.Ahorcado;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 *
 * @author
 */
@ManagedBean
@ViewScoped
public class AhorcadoFormBean implements Serializable{

    private Ahorcado nuevoahorcado;
    
    /**
     * Creates a new instance of hangmanFormBean
     */
    public AhorcadoFormBean() {
    
        nuevoahorcado = new Ahorcado();
    }

    /**
     * @return the nuevoahorcado
     */
    public Ahorcado getNuevoahorcado() {
        return nuevoahorcado;
    }

    /**
     * @param nuevoahorcado the nuevoahorcado to set
     */
    public void setNuevoahorcado(Ahorcado nuevoahorcado) {
        this.nuevoahorcado = nuevoahorcado;
    }
   
    
}
