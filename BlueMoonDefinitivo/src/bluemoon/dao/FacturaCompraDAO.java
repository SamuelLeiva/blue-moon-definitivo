/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.FacturaCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FacturaCompraDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<FacturaCompra> lista = new ArrayList<>();
        String sql ="SELECT * FROM FACTURA_COMPRA";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                FacturaCompra fc = new FacturaCompra();
                fc.setIdProveedor(rs.getString(1));
                fc.setIdFacturaCompra(rs.getString(2));
                fc.setFechaFactCompra(rs.getDate(3));
                fc.setIgv(rs.getDouble(4));
                fc.setSubtotalFactCompra(rs.getDouble(5));
                fc.setTotalFactCompra(rs.getDouble(6));
                fc.setObsFacturaCompra(rs.getString(7));
                
                lista.add(fc);
            }
            
        }catch(SQLException e){
            
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r=0;
        String myId = "";
        String sqlIdentifier = "SELECT NEXT VALUE FOR seq_factura_compra;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMFAC-0" + rs.getInt(1);
            }else{
                myId = "BMFAC-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO FACTURA_COMPRA VALUES (?,?,?,?,?,?,?)";
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
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    
    
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "UPDATE FACTURA_COMPRA SET ID_PROVEEDOR=?,FECHA=?,IGV=?,SUBTOTAL=?,TOTAL_FACTURA=?,OBSERVACIONES=? WHERE ID_FACTURA_COMPRA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[2]);
            ps.setObject(3,o[3]);
            ps.setObject(4,o[4]);
            ps.setObject(5,o[5]);
            ps.setObject(6,o[6]);
            ps.setObject(7,o[1]);
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
