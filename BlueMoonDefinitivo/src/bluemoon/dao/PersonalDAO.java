/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.dao;

import bluemoon.model.Conexion;
import bluemoon.model.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PersonalDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<Personal> lista = new ArrayList<>();
        String sql ="SELECT * FROM Personal";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Personal per = new Personal();
                per.setIdCargo(rs.getString(1));
                per.setIdPersonal(rs.getString(2));
                per.setDniPersonal(rs.getInt(3));
                per.setNombrePersonal(rs.getString(4));
                per.setApellidoPersonal(rs.getString(5));
                per.setTelefonoPersonal(rs.getInt(6));
                per.setEmailPersonal(rs.getString(7));
                per.setIdSede(rs.getString(8));
                lista.add(per);
            }
            
        }catch(SQLException e){
            
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r=0;
        String myId = "";
        String sqlIdentifier = "SELECT NEXT VALUE FOR seq_personal;";
        try {
            PreparedStatement pst = con.prepareStatement(sqlIdentifier);
            ResultSet rsId = pst.executeQuery();
            if(rsId.next()){
                myId = "BMC-0" + rs.getInt(1);
            }else{
                myId = "BMC-10000";
            }
        } catch (Exception e) {
        }
        
        String sql = "INSERT INTO PERSONAL VALUES (?,?,?,?,?,?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            ps.setObject(7,o[6]);
            ps.setObject(8,o[7]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "UPDATE PERSONAL SET ID_CARGO=?,DNI_PERSONAL=?,NOMBRE_PERSONAL=?,APELLIDO_PERSONAL=?,TELEFONO_PERSONAL=?,EMAIL_PERSONAL=?,ID_SEDE=? WHERE ID_PERSONAL=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[2]);
            ps.setObject(3,o[3]);
            ps.setObject(4,o[4]);
            ps.setObject(5,o[5]);
            ps.setObject(6,o[6]);
            ps.setObject(7,o[7]);
            ps.setObject(8,o[1]);
            r=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return r;
    
    }

    @Override
    public void eliminar(String id) {
        String sql="DELETE FROM PERSONAL WHERE ID_PERSONAL=?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch(SQLException e){
            
        } }
    
}
