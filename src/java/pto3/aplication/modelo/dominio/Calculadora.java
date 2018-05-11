/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto3.aplication.modelo.dominio;

/**
 *
 * @author josue
 */
public class Calculadora {
    private double numeroA, numeroB;
    
    public double sumar(){
        double resultado;
        resultado=this.numeroA+this.numeroB;
        return resultado;
    }
    
    public double restar(){
        double resultado;
        resultado=getNumeroA()-getNumeroB();
        return resultado;
    }
    
    public double multiplicar(){
        double resultado;
        resultado=getNumeroA()*getNumeroB();
        return resultado;
    }
    
    public double dividir(){
        double resultado;
        if(numeroB==0){
            return 0;
        }
        else{
        resultado=getNumeroA()/getNumeroB();
        return resultado;
    }
    }
    
    public double potencia(){
        double resultado;
        
        resultado=Math.pow(getNumeroA(), getNumeroB());
        return resultado;
    }

    /**
     * @return the numeroA
     */
    public double getNumeroA() {
        return numeroA;
    }

    /**
     * @param numeroA the numeroA to set
     */
    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    /**
     * @return the numeroB
     */
    public double getNumeroB() {
        return numeroB;
    }

    /**
     * @param numeroB the numeroB to set
     */
    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }


    
    
    
}
