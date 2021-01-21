
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.DetGuiaEntrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DetGuiaEntradaDao implements CRUD{
    Connection con = Conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public List listar() {
        List<DetGuiaEntrada> lista = new ArrayList();
        String sql = "select * from det_guia_entrada";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                DetGuiaEntrada beb = new DetGuiaEntrada();
                beb.setCantidad(rs.getInt(1));
                beb.setProductoId(rs.getString(2));
                beb.setGuiaEntradaId(rs.getString(3));
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
