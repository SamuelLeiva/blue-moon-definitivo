
package bluemoon.dao;

import bluemoon.model.Cargo;
import bluemoon.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CargoDao implements CRUD{
    Connection con = Conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public List listar() {
        List<Cargo> lista = new ArrayList();
        String sql = "select * from cargo";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Cargo beb = new Cargo();
                beb.setCargoId(rs.getString(1));
                beb.setNombre(rs.getString(2));
                beb.setDescripcion(rs.getString(3));
                beb.setfIngreso(rs.getDate(4));
                beb.setfSalida(rs.getDate(5));
                beb.setStatus(rs.getString(6));
                lista.add(beb);
            }
        } catch (Exception e) {
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
