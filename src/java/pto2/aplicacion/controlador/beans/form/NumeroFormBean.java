/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto2.aplicacion.controlador.beans.form;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto2.aplicacion.modelo.dominio.GestorNumeros;
import pto2.aplicacion.modelo.dominio.Numero;

/**
 *
 * @author josue
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
    private Numero numero;
    private GestorNumeros gc;
    private double mayor;
    private double menor;
    private double promedio;
    
    /**
     * Creates a new instance of numero
     */
    public NumeroFormBean() {
        numero=new Numero();
        gc=new GestorNumeros();
    }
    
    public void determinarMayorMenorYPromedio1(){
        boolean band=true;
        int cont=0;
        for(Numero num: gc.getNumeros()){
            if(band==true){
                mayor=num.getValor();
                menor=num.getValor();
                promedio=num.getValor();
                band=false;
                cont=cont+1;
            }
            else{
            cont=(cont+1);
            if(mayor<num.valor){
                mayor=num.getValor();
            }
            if(menor>num.valor){
                menor=num.getValor();
            }
            promedio=promedio+num.valor;
            }
        }
        promedio=promedio/cont;
    }
        
    /**
     * @return the numero
     */
    
    public Numero getNumero() {
        return numero;
    }
    
    public void agregarNumeroALista (){
        double num=getNumero().valor;
        Numero numero2 = new Numero();
        numero2.setValor(num);
        this.getGc().agregarNumeros(numero2);
    }

    
    
    /**
     * @param numero the numero to set
     */
    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    /**
     * @return the gc
     */
    public GestorNumeros getGc() {
        return gc;
    }

    /**
     * @param gc the gc to set
     */
    public void setGc(GestorNumeros gc) {
        this.gc = gc;
    }

    /**
     * @return the mayor
     */
    public double getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    /**
     * @return the menor
     */
    public double getMenor() {
        return menor;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(double menor) {
        this.menor = menor;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
    
    
    
}
