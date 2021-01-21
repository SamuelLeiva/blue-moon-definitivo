/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.Plato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PlatoDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<Plato> lista = new ArrayList<>();
        String sql ="SELECT * FROM Plato";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Plato pl = new Plato();
                pl.setIdPlato(rs.getString(1));
                pl.setIdCategoriaPlato(rs.getString(2));
                pl.setNombrePlato(rs.getString(3));
                pl.setPrecioPlato(rs.getDouble(4));
                pl.setDescripcionPlato(rs.getString(5));
                
                lista.add(pl);
            }
            
        }catch(SQLException e){
            
        }
        return lista;
    
    
    }

    @Override
    public int agregar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
