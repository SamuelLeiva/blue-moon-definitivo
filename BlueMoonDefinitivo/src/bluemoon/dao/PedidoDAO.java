/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PedidoDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Pedido> lista = new ArrayList<>();
        String sql ="SELECT * FROM Pedido";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Pedido fc = new Pedido();
                fc.setIdPersonal(rs.getString(1));
                fc.setIdPedido(rs.getString(2));
                fc.setIdMesa(rs.getString(3));
                fc.setTotalPedido(rs.getDouble(4));
                fc.setFechaPedido(rs.getDate(5));
                fc.setEstadoPedido(rs.getString(6));
                fc.setIdCliente(rs.getString(7));
                
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
        String sqlIdentifier = "SELECT NEXT VALUE FOR SEQ_PEDIDO;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMPED-0" + rs.getInt(1);
            }else{
                myId = "BMPED-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO PEDIDO VALUES (?,?,?,?,?,?)";
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
        String sql = "UPDATE PEDIDO SET ID_PERSONAL=?,ID_MESA=?,TOTAL_PEDIDO=?,FECHA_PEDIDO=?,ESTADO_PEDIDO=? WHERE ID_PEDIDO=?";
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
        String sql="DELETE FROM PEDIDO WHERE ID_PEDIDO=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        }  
    }
}
