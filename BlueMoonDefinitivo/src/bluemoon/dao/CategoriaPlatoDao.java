/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.CategoriaPlato;
import bluemoon.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CategoriaPlatoDao implements CRUD{
    Connection con = Conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public List listar() {
        List<CategoriaPlato> lista = new ArrayList();
        String sql = "select * from categoria_plato";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                CategoriaPlato beb = new CategoriaPlato();
                beb.setCatPlatId(rs.getString(1));
                beb.setNombre(rs.getString(2));
                beb.setDescripcion(rs.getString(3));
                beb.setEstado(rs.getString(4));
                lista.add(beb);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sqlInsert = "insert into CATEGORIA_PLATO values (?,?,?,?)";
        
        String myId = "";
        
        //sacar id de la secuencia de la respectiva tabla
        String sqlIdentifier = "SELECT NEXT VALUE FOR seq_categoria_plato;";
        
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()){
                myId = "BMCAT-0" + rs1.getInt(1);
            }else{
                myId = "BMCAT-10000";
            }
                        
            ps = con.prepareStatement(sqlInsert);
            ps.setObject(1, myId);
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
        String sql = "update CATEGORIA_PLATO set NOMBRE=?, DESCRIPCION=?,ESTADO=? WHERE ID_CATEGORIA_PLATO=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[1]);
            ps.setObject(2, o[2]);
            ps.setObject(3, o[3]);
            ps.setObject(4, o[0]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
        String sql = "delete from CATEGORIA_PLATO where ID_CATEGORIA_PLATO=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
