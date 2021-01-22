/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.FacturaCompra;
import bluemoon.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDao implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    
    Usuario user = new Usuario();
    Connection con = Conexion.getConexion();
    
    public Usuario ValidarUsuario(String email, String password){
        String sql = "select * from usuario where EMAIL_USUARIO=? AND CONTRASEÑA_USUARIO=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            while(rs.next()){ //construimos el usuario
                user.setIdUser(rs.getString(1));
                user.setNombreUser(rs.getString(2));
                user.setPasswordUser(rs.getString(3));
                user.setEmailUser(rs.getString(4));
                user.setTipoUser(rs.getString(5));
                user.setIdPersonal(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return user;
    }

    @Override
    public List listar() {
        List<Usuario> lista = new ArrayList<>();
        String sql ="SELECT * FROM Usuario";
        try{
            //con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario us = new Usuario();
                us.setIdUser(rs.getString(1));
                us.setNombreUser(rs.getString(2));
                us.setPasswordUser(rs.getString(3));
                us.setEmailUser(rs.getString(4));
                us.setTipoUser(rs.getString(5));
                us.setIdPersonal(rs.getString(6));
                
                lista.add(us);
            }
            
        }catch(SQLException e){
            
        }
        return lista;
    
    
    }

    @Override
    public int agregar(Object[] o) {
        int r=0;
        String myId = "";
        String sqlIdentifier = "SELECT NEXT VALUE FOR SEQ_USUARIO;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMUSU-0" + rs.getInt(1);
            }else{
                myId = "BMUSU-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO USUARIO VALUES (?,?,?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "UPDATE USUARIO SET NOMBRE_USUARIO=?,CONTRASEÑA_USUARIO=?,EMAIL_USUARIO=?,TIPO_USUARIO=?,ID_PERSONAL=? WHERE ID_USUARIO=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[1]);
            ps.setObject(2,o[2]);
            ps.setObject(3,o[3]);
            ps.setObject(4,o[4]);
            ps.setObject(5,o[5]);
            ps.setObject(6,o[0]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    
    
    
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM USUARIO WHERE ID_USUARIO=?";
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        }
    
    
    }
    
    
}
