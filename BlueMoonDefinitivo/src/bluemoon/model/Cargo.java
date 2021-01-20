/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.model;

import java.sql.Date;

/**
 *
 * @author LENOVO
 */
public class Cargo {
    String cargoId;
    String nombre;
    String descripcion;
    Date fIngreso;
    Date fSalida;
    String status;

    public Cargo() {
    }

    public Cargo(String cargoId, String nombre, String descripcion, Date fIngreso, Date fSalida, String status) {
        this.cargoId = cargoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fIngreso = fIngreso;
        this.fSalida = fSalida;
        this.status = status;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Date fIngreso) {
        this.fIngreso = fIngreso;
    }

    public Date getfSalida() {
        return fSalida;
    }

    public void setfSalida(Date fSalida) {
        this.fSalida = fSalida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
