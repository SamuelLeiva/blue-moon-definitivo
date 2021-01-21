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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
