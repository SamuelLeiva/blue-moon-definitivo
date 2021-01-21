
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
                
                lista.add(beb);
            }
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sqlInsert = "insert into cargo values (?,?,?)";
        
        try {
                        
            ps = con.prepareStatement(sqlInsert);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update cargo set NOMBRE_CARGO=?,DESCRIPCION_CARGO=? WHERE ID_CARGO=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[1]);
            ps.setObject(2, o[2]);
            ps.setObject(3, o[0]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql = "delete from cargo where id_cargo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
