
package bluemoon.dao;

import bluemoon.model.Bebida;
import bluemoon.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class BebidaDao implements CRUD{
    Connection con = Conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public List listar() {
        List<Bebida> lista = new ArrayList();
        String sql = "select * from bebida";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Bebida beb = new Bebida();
                beb.setBebidaId(rs.getString(1));
                beb.setNombre(rs.getString(2));
                beb.setDescripcion(rs.getString(3));
                beb.setPrecio(rs.getDouble(4));
                beb.setCategoriaBebId(rs.getString(5));
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
