/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto4.aplicacion.modelo.dominio;

import java.io.Serializable;
/**
 *
 * @author alumno 
 */
public class Ahorcado implements Serializable{
    
    String palabra, guiones, letra;
   
    private String juego;
    String validar;
    int intentos;
    private int cont;
    boolean objectsDisabled;
    
    
    public Ahorcado(){
        palabra = new String();
        guiones = new String();
        letra = new String();
        validar = new String();
        juego = "Ingrese palabra";
        objectsDisabled = false;
    }

    public String comenzar(){
        setCont(0); 
        this.intentos=0; 
        setJuego(" ");
       for (int i = 0; i < palabra.length(); i++){
            guiones += "_ ";
        }
        
       objectsDisabled = true;
       
        return guiones;
    }
    
    public void checkletra(){
        boolean band= false, band2= false;
        for(int i=0;i<palabra.length();i++){

            band=compararletra(letra.charAt(0),palabra.charAt(i));
            if(band==true){
                band2=true;
                colocarletra(letra.charAt(0),i);
                setCont(getCont() + 1);
            }
            }
        
            if(band2 == false)
                this.intentos++;
        }
            
                
               
                         
             
        
       
    
    
    public void colocarletra(char l,int m){
        
        char[] tmp = this.guiones.toCharArray();
        tmp[m*2]=l;
        guiones = new String(tmp);
        
    
    }
    
    
    
    
    
    public boolean compararletra(char a,char b){
        return a==b;   
    }
        
  
    public String resultado(){

        
        if(intentos==4){
            setJuego("Perdiste!!");
            objectsDisabled=true;
        }else{
            if(getCont()==palabra.length())
                setJuego("GANASTE!!");
            
        }
        
        return getJuego();
        
    }
    
    
   
    
    public void reintentar(){
        objectsDisabled = false;
        intentos = 4;
        this.palabra = "";
        this.guiones = "";
        letra = "";
        juego="";
      
        
    }
    
    
    
    public boolean isObjectsDisabled() {
        return objectsDisabled;
    }

    public void setObjectsDisabled(boolean objectsDisabled) {
        this.objectsDisabled = objectsDisabled;
    }
    
    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getGuiones() {
        return guiones;
    }

    public void set(String guiones) {
        this.guiones= guiones;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

   

   

    public String getValidar() {
        return validar;
    }

    public void setValidar(String validar) {
        this.validar= validar;
    }

    /**
     * @return the juego
     */
    public String getJuego() {
        return juego;
    }

    /**
     * @param juego the juego to set
     */
    public void setJuego(String juego) {
        this.juego = juego;
    }

    /**
     * @return the cont
     */
    public int getCont() {
        return cont;
    }

  
    public void setCont(int cont) {
        this.cont = cont;
    }
    
}