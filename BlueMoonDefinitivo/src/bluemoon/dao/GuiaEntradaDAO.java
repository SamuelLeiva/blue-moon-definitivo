/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.GuiaEntrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GuiaEntradaDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<GuiaEntrada> lista = new ArrayList<>();
        String sql ="SELECT * FROM GUIA_ENTRADA";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                GuiaEntrada ge = new GuiaEntrada();
                ge.setIdGuiaEntrada(rs.getString(1));
                ge.setFechaGuiaEntrada(rs.getDate(2));
                ge.setObservacionesGE(rs.getString(3));
                ge.setIdProveedor(rs.getString(4));
                ge.setIdFacturaCompra(rs.getString(5));
                
                lista.add(ge);
            }
        }catch(SQLException e){
            
        }
        return lista;
    }


    @Override
    public int agregar(Object[] o) {
        int r=0;
        String myId = "";
        String sqlIdentifier = "SELECT NEXT VALUE FOR seq_guia_entrada;";
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
        
        String sql = "INSERT INTO GUIA_ENTRADA VALUES (?,?,?,?,?)";
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
        String sql = "Update guia_entrada set fecha=?,observaciones=?,id_proveedor=?,id_factura_compra=? where id_guia_entrada=?";
        
        try{
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
        String sql="DELETE FROM guia_entrada WHERE ID_GUIA_ENTRADA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        }}
}
    
    
