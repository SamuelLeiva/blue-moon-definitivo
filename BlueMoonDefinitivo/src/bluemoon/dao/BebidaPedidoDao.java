
package bluemoon.dao;

import bluemoon.model.BebidaPedido;
import bluemoon.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class BebidaPedidoDao implements CRUD{
    Connection con = Conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public List listar() {
        List<BebidaPedido> lista = new ArrayList();
        String sql = "select * from det_bebida_pedido";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                BebidaPedido beb = new BebidaPedido();
                beb.setCantidad(rs.getInt(1));
                beb.setPrecio(rs.getDouble(2));
                beb.setPedidoId(rs.getString(3));
                beb.setBebidaId(rs.getString(4));
                lista.add(beb);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sqlInsert = "insert into det_pedido_bebida values (?,?,?,?)";
        
        try {
                        
            ps = con.prepareStatement(sqlInsert);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update det_pedido_bebida set CANTIDAD=?,PRECIO=? WHERE ID_PEDIDO=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql = "delete from det_pedido_bebida where id_pedido=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
