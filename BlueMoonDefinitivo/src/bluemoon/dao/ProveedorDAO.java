/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProveedorDAO implements CRUD{
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Proveedor> lista = new ArrayList<>();
        String sql ="SELECT * FROM Proveedor";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getString(1));
                prov.setRucProveedor(rs.getString(2));
                prov.setNombreProveedor(rs.getString(3));
                prov.setDireccionProveedor(rs.getString(4));
                prov.setTelefonoProveedor(rs.getInt(5));
                
                lista.add(prov);
            }
            
        }catch(SQLException e){
            
        }
        return lista;
    
    }

    @Override
    public int agregar(Object[] o) {
        int r=0;
        String myId = "";
        String sqlIdentifier = "SELECT NEXT VALUE FOR SEQ_PROVEEDOR;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMPRO-0" + rs.getInt(1);
            }else{
                myId = "BMPRO-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO PROVEEDOR VALUES (?,?,?,?,?)";
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
        String sql = "UPDATE PROVEEDOR SET RUC_PROVEEDOR=?,NOMBRE_PROVEEDOR=?,DIRECCION_PROVEEDOR=?,TELEFONO_PROVEEDOR=? WHERE ID_PROVEEDOR=?";
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
    public void eliminar(String id) {
        String sql="DELETE FROM PROVEEDOR WHERE ID_PROVEEDOR=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        }
    }
}
