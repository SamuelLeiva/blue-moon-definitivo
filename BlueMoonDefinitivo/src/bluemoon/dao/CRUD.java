<<<<<<< HEAD

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> b5f09e9e7a9ae62ded009f1141ea26c65b0e6e87
package bluemoon.dao;

import java.util.List;


public interface CRUD {
    public List listar();
<<<<<<< HEAD
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
=======
    public int agregar(Object o);
    public int actualizar(Object o);
    public void eliminar(String id);
>>>>>>> b5f09e9e7a9ae62ded009f1141ea26c65b0e6e87
}
