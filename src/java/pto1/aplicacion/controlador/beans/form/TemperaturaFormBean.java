/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto1.aplicacion.controlador.beans.form;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto1.aplicacion.modelo.dominio.Temperatura;

/**
 *
 * @author josue
 */
@ManagedBean
@ViewScoped
public class TemperaturaFormBean implements Serializable{
private double valortemperatura;
private char valororigen;
private char valordestino;
private Temperatura temperatura;
    /**
     * Creates a new instance of TemperaturaFormBean
     */
    public TemperaturaFormBean() {
        temperatura = new Temperatura();
    }

    /**
     * @return the valortemperatura
     */
    public double getValortemperatura() {
        return valortemperatura;
    }

    /**
     * @param valortemperatura the valortemperatura to set
     */
    public void setValortemperatura(double valortemperatura) {
        this.valortemperatura = valortemperatura;
    }

    /**
     * @return the temperatura
     */
    public Temperatura getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the valororigen
     */
    public char getValororigen() {
        return valororigen;
    }

    /**
     * @param valororigen the valororigen to set
     */
    public void setValororigen(char valororigen) {
        this.valororigen = valororigen;
    }

    /**
     * @return the valordestino
     */
    public char getValordestino() {
        return valordestino;
    }

    /**
     * @param valordestino the valordestino to set
     */
    public void setValordestino(char valordestino) {
        this.valordestino = valordestino;
    }

    public double convertirUnidades(){
        double resultado=.0;
        temperatura = new Temperatura();
        temperatura.setTemperatura(valortemperatura);
        if(valororigen==valordestino){
            resultado=valortemperatura;
        }
        if(valororigen == 'C' && valordestino == 'F'){
            resultado=temperatura.celsiusAGrados();
        }
        else{
            if(valororigen == 'C' && valordestino == 'K'){
                resultado=temperatura.celsiusAKelvin();
            }
            else{
                if(valororigen == 'F' && valordestino == 'C'){
                    resultado=temperatura.gradosACelsius();
                }
                else{
                    if(valororigen == 'F' && valordestino == 'K'){
                    resultado=temperatura.gradosAKelvin();}
                    else{
                            if(valororigen == 'K' && valordestino == 'F'){
                    resultado=temperatura.kelvinAGrados();
                }
                            else{if(valororigen == 'K' && valordestino == 'C'){
                    resultado=temperatura.kelvinAcelsius();
                }
                            }
                }
                }
            }
        }
        
        
        
        
        return resultado;
    }
    
}
