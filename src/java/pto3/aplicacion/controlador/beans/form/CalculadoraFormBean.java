/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto3.aplicacion.controlador.beans.form;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto3.aplication.modelo.dominio.Calculadora;

/**
 *
 * @author josue
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    private Calculadora calculadora;
    /**
     * Creates a new instance of CalculadoraFormBean
     */
    public CalculadoraFormBean() {
        calculadora = new Calculadora();
        
    }

    /**
     * @return the calculadora
     */
    public Calculadora getCalculadora() {
        return calculadora;
    }

    /**
     * @param calculadora the calculadora to set
     */
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
}
