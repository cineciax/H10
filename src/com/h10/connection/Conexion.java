/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.h10.connection;
import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author PC_3
 */
public class Conexion{
    public static Connection con;
    //public String ruta=getClass().getResource("/com/h10/data/prueba.s3db").toString();
   public Connection getConnection(){
        try {
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:prueba.s3db");
           // con=DriverManager.getConnection("jdbc:sqlite:"+ruta);
        } catch (Exception e) {
            e.printStackTrace();
        }
     return con;
    }
}
