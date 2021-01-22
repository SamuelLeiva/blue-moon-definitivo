/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.DocumentoVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DocumentoVentaDAO implements CRUD{
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<DocumentoVenta> lista = new ArrayList<>();
        String sql ="SELECT * FROM DOCUMENTO_VENTA";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                DocumentoVenta dv = new DocumentoVenta();
                dv.setIdDocVenta(rs.getString(1));
                dv.setTotal(rs.getDouble(2));
                dv.setFecha(rs.getDate(3));
                dv.setSubtotal(rs.getDouble(4));
                dv.setIdPersonal(rs.getString(5));
                dv.setIdCliente(rs.getString(6));
                dv.setIgv(rs.getDouble(7));
                dv.setTipoDoc(rs.getString(8));
                
                lista.add(dv);
            }
            
        }catch(Exception e){
            
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
        String sql = "UPDATE DOCUMENTO_VENTA SET TOTAL=?,FECHA=?,SUBTOTAL=?,ID_PERSONAL=?,ID_CLIENTE=?,IGV=?,TIPO_DOCUMENTO=? WHERE ID_DOCUMENTO_VENTA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[1]);
            ps.setObject(2,o[2]);
            ps.setObject(3,o[3]);
            ps.setObject(4,o[4]);
            ps.setObject(5,o[5]);
            ps.setObject(6,o[6]);
            ps.setObject(7,o[7]);
            ps.setObject(8,o[0]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM DOCUMENTO_VENTA WHERE ID_DOCUMENTO_VENTA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        }    
    }
    
}
