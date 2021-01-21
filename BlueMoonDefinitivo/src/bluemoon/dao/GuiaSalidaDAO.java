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
