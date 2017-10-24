/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.h10.connection.Conexion;
import com.h10.vo.prueba;
import com.interfaces.Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Informatica
 */
public class ProjectModel implements Model {

    ArrayList<prueba> pruebas;
    @Override
    public ArrayList<prueba> List() {
        Connection con=new Conexion().getConnection();
        pruebas=new ArrayList<prueba>();
        try {
            Statement st=con.createStatement();
            String query="select * from users";
            ResultSet rs=st.executeQuery(query);
            while (rs.next()) {                
                int id=rs.getInt("id_usuario");
                String nombre=rs.getString("nombre");
                prueba obj=new prueba(id,nombre);
                pruebas.add(obj);
            }
        } catch (Exception e) {
        }
        
      return pruebas; 
    }
    
}
