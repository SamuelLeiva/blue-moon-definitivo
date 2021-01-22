/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.PedidoCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PedidoCompraDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<PedidoCompra> lista = new ArrayList<>();
        String sql ="SELECT * FROM PEDIDO_COMPRA";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                PedidoCompra fc = new PedidoCompra();
                fc.setIdPedCompra(rs.getString(1));
                fc.setIdProveedor(rs.getString(2));
                fc.setIdProducto(rs.getString(3));
                fc.setPrecioPedCompra(rs.getDouble(4));
                fc.setCantidad(rs.getInt(5));
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
        String sqlIdentifier = "SELECT NEXT VALUE FROM SEQ_PEDIDO_COMPRA;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMPEDC-0" + rs.getInt(1);
            }else{
                myId = "BMPEDC-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO PEDIDO_COMPRA VALUES (?,?,?,?,?)";
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
        String sql = "UPDATE PEDIDO_COMPRA SET ID_PROVEEDOR=?,ID_PRODUCTO=?,PRECIO=?,CANTIDAD=? WHERE ID_PEDIDO_COMPRA=?";
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
        String sql="DELETE FROM PEDIDO_COMPRA WHERE ID_PEDIDO_COMPRA=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        }  
    }
    
}
