
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
        int r = 0;
        String sqlInsert = "insert into bebida values (?,?,?,?,?)";
        
        String myId = "";
        
        //sacar id de la secuencia de la respectiva tabla
        String sqlIdentifier = "SELECT NEXT VALUE FOR seq_bebida;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()){
                myId = "BMBEB-0" + rs1.getInt(1);
            }else{
                myId = "BMBEB-10000";
            }
            
            ps = con.prepareStatement(sqlInsert);
            ps.setString(1, myId);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update bebida set NOMBRE_BEBIDA=?,DESCRIPCION_BEBIDA=?,PRECIO_BEBIDA=? WHERE ID_BEBIDA=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[1]);//nombre_bebida
            ps.setObject(2, o[2]); //descripcion
            ps.setObject(3, o[3]); //precio
            ps.setObject(4, o[0]); //idbebida
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql = "delete from bebida where id_bebida=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
