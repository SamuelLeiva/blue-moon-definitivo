/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PersonalDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<Personal> lista = new ArrayList<>();
        String sql ="SELECT * FROM Personal";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Personal per = new Personal();
                per.setIdCargo(rs.getString(1));
                per.setIdPersonal(rs.getString(2));
                per.setDniPersonal(rs.getInt(3));
                per.setNombrePersonal(rs.getString(4));
                per.setApellidoPersonal(rs.getString(5));
                per.setTelefonoPersonal(rs.getInt(6));
                per.setEmailPersonal(rs.getString(7));
                per.setIdSede(rs.getString(8));
                lista.add(per);
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
