/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.GuiaSalida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GuiaSalidaDAO implements CRUD{
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<GuiaSalida> lista = new ArrayList<>();
        String sql ="SELECT * FROM GUIA_SALIDA";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                GuiaSalida gs = new GuiaSalida();
                gs.setIdGuiaSalida(rs.getString(1));
                gs.setFechaGuiaSalida(rs.getDate(2));
                gs.setObservaciones(rs.getString(3));
                
                lista.add(gs);
            }
        }catch(SQLException e){
            
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r=0;
        String myId = "";
        String sqlIdentifier = "SELECT NEXT VALUE FOR SEQ_GUIA_SALIDA;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMGS-0" + rs.getInt(1);
            }else{
                myId = "BMGS-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO GUIA_SALIDA VALUES (?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
        }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "UPDATE GUIA_SALIDA SET FECHA=?,OBSERVACIONES=? WHERE ID_GUIA_SALIDA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[1]);
            ps.setObject(2,o[2]);
            ps.setObject(3,o[0]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;}

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM GUIA_SALIDA WHERE ID_GUIA_SALIDA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        }
    
    }
    
}
