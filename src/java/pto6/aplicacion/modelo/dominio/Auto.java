/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto6.aplicacion.modelo.dominio;

/**
 *
 * @author pao
 */
public class Auto {
    private double numero;
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipodecombustible;

    
    
    
    public Auto(double numero, String patente, String marca, String modelo, String color, String tipodecombustible){
        this.numero=numero;
        this.patente=patente;
        this.modelo=modelo;
        this.color=color;
        this.marca=marca;
        this.tipodecombustible=tipodecombustible;
        
    }
    



    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tipodecombustible
     */
    public String getTipodecombustible() {
        return tipodecombustible;
    }

    /**
     * @param tipodecombustible the tipodecombustible to set
     */
    public void setTipodecombustible(String tipodecombustible) {
        this.tipodecombustible = tipodecombustible;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }
    
}
