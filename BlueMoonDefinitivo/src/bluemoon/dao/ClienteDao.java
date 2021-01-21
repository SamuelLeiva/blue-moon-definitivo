
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
        int r = 0;
        String sqlInsert = "insert into CLIENTE values (?,?,?,?,?,?,?)";
        
        String myId = "";
        
        //sacar id de la secuencia de la respectiva tabla
        String sqlIdentifier = "SELECT NEXT VALUE FOR seq_cliente;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()){
                myId = "BMCLI-0" + rs1.getInt(1);
            }else{
                myId = "BMCLI-10000";
            }
            
            ps = con.prepareStatement(sqlInsert);
            ps.setObject(1, myId);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update CLIENTE set DNI_CLIENTE=?,NOMBRE_CLIENTE=?,APELLIDOS_CLIENTE=?,TELEFONO_CLIENTE=?,RUC=?,DIRECCION=? WHERE ID_CLIENTE=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[1]);
            ps.setObject(2, o[2]); 
            ps.setObject(3, o[3]); 
            ps.setObject(4, o[4]); 
            ps.setObject(5, o[5]); 
            ps.setObject(6, o[6]); 
            ps.setObject(7, o[0]); 
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql = "delete from CLIENTE where id_cliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
