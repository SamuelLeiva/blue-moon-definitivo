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
                
                lista.add(fc);
            }
            
        }catch(SQLException e){
            
        }
        return lista;
    
    }

    @Override
    public int agregar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
