/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MesaDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Mesa> lista = new ArrayList<>();
        String sql ="SELECT * FROM Mesa";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Mesa m = new Mesa();
                m.setIdMesa(rs.getString(1));
                m.setCapacidadMesa(rs.getInt(2));
                
                lista.add(m);
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
                myId = "BMCATB-0" + rs.getInt(1);
            }else{
                myId = "BMCATB-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO DOCUMENTO_VENTA VALUES (?,?,?,?,?,?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            ps.setObject(7,o[6]);
            ps.setObject(8,o[7]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "UPDATE MESA SET CAPACIDAD=? WHERE ID_MESA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[1]);
            ps.setObject(2,o[0]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM MESA WHERE ID_MESA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        }
    
    }
    
    
    
}
