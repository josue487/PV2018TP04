package pto6.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto6.aplicacion.modelo.dominio.Auto;
import pto6.aplicacion.modelo.dominio.GestorAutos;

/**
 *
 * @author josue
 */
@ManagedBean
@ViewScoped
public class AutosFormBeans implements Serializable{
    private Auto auto;
    private GestorAutos gc;
    private double opcion;
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipodecombustible;

    /**
     * Creates a new instance of AutosFormBeans
     */
    public AutosFormBeans() {
        gc=new GestorAutos();
        }
    
    
    public String validarOpcion(){
    boolean existe=false;
    for(Auto aut: getGc().getAutos()){
            if(aut.getNumero()==getOpcion()){
                existe=true;
            }
    }
    if(existe==false){
        return "No existe la opcion ingresada";}
    else{
        return "Auto encontrado";
    }
}
    public void actualizarAutos(){
        for(Auto aut: this.getGc().getAutos()){
            
                aut.setColor(getColor());
                aut.setMarca(getMarca());
                aut.setModelo(getModelo());
                aut.setPatente(getPatente());
                aut.setTipodecombustible(getTipodecombustible());
            
        }
        
    }
    public void cargarAutosALaLista(){
        setAuto(new Auto(1, "asd123", "fiat", "1998", "blancco", "infinia"));
        this.getGc().agregarAuto(getAuto());
        setAuto(new Auto(2, "qwe", "ford", "2010", "gris", "super"));
        this.getGc().agregarAuto(getAuto());
        setAuto(new Auto(3, "rty", "toyota", "2015", "negro", "gnc"));
        this.getGc().agregarAuto(getAuto());
        setAuto(new Auto(4, "jkl", "chebrolet", "2018", "blancco", "gas"));
        this.getGc().agregarAuto(getAuto());
    
}

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * @return the gc
     */
    public GestorAutos getGc() {
        return gc;
    }

    /**
     * @param gc the gc to set
     */
    public void setGc(GestorAutos gc) {
        this.gc = gc;
    }

    /**
     * @return the opcion
     */
    public double getOpcion() {
        return opcion;
    }

    /**
     * @param opcion the opcion to set
     */
    public void setOpcion(double opcion) {
        this.opcion = opcion;
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
    

}