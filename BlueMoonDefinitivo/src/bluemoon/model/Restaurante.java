/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.model;


public class Restaurante {

    String idRestaurante;
    String rucRestaurante;
    String nombreRestaurante;
    String descripcion;
    
    public Restaurante(String idRestaurante, String rucRestaurante, String nombreRestaurante, String descripcion) {
        this.idRestaurante = idRestaurante;
        this.rucRestaurante = rucRestaurante;
        this.nombreRestaurante = nombreRestaurante;
        this.descripcion = descripcion;
    }

    public Restaurante(){
        
    }
    
    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getRucRestaurante() {
        return rucRestaurante;
    }

    public void setRucRestaurante(String ruc) {
        this.rucRestaurante = ruc;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
