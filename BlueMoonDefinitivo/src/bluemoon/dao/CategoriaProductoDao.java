
package bluemoon.dao;

import bluemoon.model.CategoriaProducto;
import bluemoon.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaProductoDao implements CRUD{
    Connection con = Conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public List listar() {
        List<CategoriaProducto> lista = new ArrayList();
        String sql = "select * from categoria_producto";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                CategoriaProducto beb = new CategoriaProducto();
                beb.setCatProId(rs.getString(1));
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
        String sqlInsert = "insert into CATEGORIA_PRODUCTO values (?,?,?)";
        String myId = "";
        
        //sacar id de la secuencia de la respectiva tabla
        String sqlIdentifier = "SELECT NEXT VALUE FOR seq_categoria_producto;";
        
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()){
                myId = "BMCATP-0" + rs1.getInt(1);
            }else{
                myId = "BMCATP-10000";
            }
                        
            ps = con.prepareStatement(sqlInsert);
            ps.setObject(1, myId);
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
        String sql = "update CATEGORIA_PRODUCTO set NOMBRE_CATEGORIA=?, DESCRIPCION_CATEGORIA=? WHERE ID_CATEGORIA_PRODUCTO=?";
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
        String sql = "delete from CATEGORIA_PRODUCTO where ID_CATEGORIA_PRODUCTO=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
