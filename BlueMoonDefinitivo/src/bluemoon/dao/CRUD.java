/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import java.util.List;


public interface CRUD {
    public List listar();
    public int agregar(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(String id);
}
