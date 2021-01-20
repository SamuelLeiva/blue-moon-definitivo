/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioDao {
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
}
