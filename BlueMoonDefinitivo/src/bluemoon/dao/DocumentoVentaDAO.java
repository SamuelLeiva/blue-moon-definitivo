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
