/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO implements CRUD{
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql ="SELECT * FROM Producto";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto prod = new Producto();
                prod.setIdProducto(rs.getString(1));
                prod.setNombreProducto(rs.getString(2));
                prod.setUnidadMedida(rs.getString(3));
                prod.setIdCategoria(rs.getString(4));
                prod.setPrecioUnitario(rs.getDouble(5));
                prod.setCantidadProducto(rs.getInt(6));
                
                lista.add(prod);
            }
            
        }catch(SQLException e){
            
        }
        return lista;
    
    
    }

    @Override
    public int agregar(Object[] o) {
        int r=0;
        String myId = "";
        String sqlIdentifier = "SELECT NEXT VALUE FOR SEQ_PRODUCTO;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMPROD-0" + rs.getInt(1);
            }else{
                myId = "BMPROD-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO PRODUCTO VALUES (?,?,?,?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    
    
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "UPDATE PRODUCTO SET NOMBRE_PRODUCTO=?,UNIDAD_MEDIDA=?,ID_CATEGORIA=?,PRECIO_UNITARIO=?,CANTIDAD_PRODUCTO=? WHERE ID_PRODUCTO=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[2]);
            ps.setObject(3,o[3]);
            ps.setObject(4,o[4]);
            ps.setObject(5,o[5]);
            ps.setObject(6,o[1]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM PRODUCTO WHERE ID_PRODUCTO=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        } 
    
    
    }
    
}
