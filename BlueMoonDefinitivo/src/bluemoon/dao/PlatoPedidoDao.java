
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.PlatoPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PlatoPedidoDao implements CRUD{
    Connection con = Conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public List listar() {
        List<PlatoPedido> lista = new ArrayList();
        String sql = "select * from det_plato_pedido";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                PlatoPedido beb = new PlatoPedido();
                beb.setCantidad(rs.getInt(1));
                beb.setPrecio(rs.getDouble(2));
                beb.setPedidoId(rs.getString(3));
                beb.setPlatoId(rs.getString(4));
                
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