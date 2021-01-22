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
    public int agregar(Object[] o) {
        int r=0;
        String myId = "";
        String sqlIdentifier = "SELECT NEXT VALUE FOR seq_documento_venta;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMPLA-0" + rs.getInt(1);
            }else{
                myId = "BMPLA-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO PLATO VALUES (?,?,?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "UPDATE PLATO SET ID_CATEGORIA_PLATO=?,NOMBRE_PLATO=?,PRECIO_PLATO=?,DESCRIPCION_PLATO=? WHERE ID_PLATO=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[1]);
            ps.setObject(2,o[2]);
            ps.setObject(3,o[3]);
            ps.setObject(4,o[4]);
            ps.setObject(5,o[0]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM PLATO WHERE ID_PLATO=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        } 
    
    }
    
}
