
package bluemoon.dao;

import bluemoon.model.Cliente;
import bluemoon.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements CRUD{
    Connection con = Conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList();
        String sql = "select * from cliente";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Cliente beb = new Cliente();
                beb.setClienteId(rs.getString(1));
                beb.setDni(rs.getInt(2));
                beb.setNombre(rs.getString(3));
                beb.setApellido(rs.getString(4));
                beb.setTelefono(rs.getInt(5));
                beb.setRuc(rs.getString(6));
                beb.setDireccion(rs.getString(7));
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
